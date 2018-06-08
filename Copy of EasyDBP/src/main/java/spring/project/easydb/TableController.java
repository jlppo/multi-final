package spring.project.easydb;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/db")
public class TableController {
	@Autowired
	SqlSession session;
	
	@Autowired
	EasyDBService service;
	
	@ModelAttribute("tableinfolist")
	public List<TableVO> getTable(){
		
		List<TableVO> list = service.getTable("employees");
		//TableVO vo=new TableVO();
		/*for (TableVO vo : list) {
			ArrayList<String> columnNameList=new ArrayList<>();
			for (String name : columnNameList) {
				columnNameList.add(columnNameList.get(Integer.parseInt(name)));
			}
			ArrayList<String> columnValueList=new ArrayList<String>();
			for (String value : columnValueList) {
				columnValueList.add(columnValueList.get(Integer.parseInt(value)));
			}
			ArrayList<Integer> columnTypeList=new ArrayList<Integer>();
			for (Integer type : columnTypeList) {
				columnTypeList.add(columnTypeList.get(type));
			}
			list.add(vo);
		}	*/
		return list;
	}
	
	
	@RequestMapping(value="/table", method=RequestMethod.GET)
	public String tableManageForm(){
		
		return "/db/tablemanage";
	}
	
	@RequestMapping(value="/table", method=RequestMethod.POST)
	public ModelAndView tableManageForm(String str)
	{
		/*List<TableVO> list=service.getTable("employees");
		
		//service.getTable("employees");
*/		ModelAndView mv =new ModelAndView();
		/*mv.addObject("tablelist",list);
		mv.setViewName("tablemanage");*/
		return mv;
	}
	
}
