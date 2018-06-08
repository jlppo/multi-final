package spring.project.easydb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;





@Controller
@RequestMapping("/db")
public class DataController {
	
	@Autowired
	DataDAO dataDao;
	@Autowired
	SqlSession session;
	
	@ModelAttribute("columnList")
	public List<String> getTableColumnList() {
		List<String> list = session.selectList("dbcontrol.selectColumnName");
		return list;
	}
	
	@ModelAttribute("tableList")
	public List<List<Object>> getTableList() {
		List<HashMap<String, Object>> list = session.selectList("dbcontrol.selectAll");
		List<List<Object>> resultList = new ArrayList<>();
		for(HashMap<String, Object> elist : list){
			List<Object> tmplist = new ArrayList<>();
			System.out.println(elist.keySet().size());
			for(String e : elist.keySet()){
				tmplist.add(elist.get(e));
			}
			resultList.add(tmplist);
		}
		return resultList;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String dataManageForm(){	
		return "/db/datamanage";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView dataManageForm(HttpServletRequest res, HttpSession session) throws Exception {

		List<TableVO> list = dataDao.selectAll();
		
		String searchcolumn[] = res.getParameterValues("searchcolumn");
	
		String user = (String) session.getAttribute("sessionid");
			
		//}

		ModelAndView mv = new ModelAndView("dataManage");

		return mv;
	}
}
