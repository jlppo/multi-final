package spring.project.easydb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")//경로를 크게 하나 더 잡아줌
public class UserController {
	
	@Autowired
	UserDAO userDao;
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String userLogin(){
		return "/user/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView checkLogin(String id, String pw){
		
		System.out.println(id+" "+pw);
		ModelAndView mv = new ModelAndView();
		System.out.println("확인중");
			UserVO userVo = userDao.checkLogin(id);
			System.out.println("매칭중");
			String loginFailMsg = null;
			
		if(userVo == null){
			System.out.println("해당 아이디 없음");
			loginFailMsg = "해당 아이디 없음";
			mv.addObject("loginFailMsg", loginFailMsg);
			mv.setViewName("loginResult");
		}
			
		else if(userVo.getPw().equals(pw)){
			System.out.println("로그인 완료!");
			mv.addObject("userVo", userVo);
			mv.setViewName("/user/mainmain");
		}
		
		else if(!userVo.getPw().equals(pw)){
			System.out.println("패스워드 불일치");
			 loginFailMsg = "패스워드불일치";
			 mv.addObject("loginFailMsg", loginFailMsg);
			mv.setViewName("loginResult");
		}
	
		return mv;
	}
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String userJoin1(){
		return "/user/join";
	}
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public void userJoin2(String id, String pw){
		Map<String,String> map = new HashMap<String,String>();
		map.put("id", id);
		map.put("pw", pw);
		userDao.insert(map);
	}
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String userOut1(){
		return "/user/logout";
	}
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public String userOut2(){
		return "/user/logout";
	}
	@RequestMapping(value="/idconfirm", method=RequestMethod.GET)
	@ResponseBody//ajax 쓰려면 이거 꼭 필요
	public UserVO idConfirm(String id){//json형태의 UserVO
		UserVO userVo = userDao.checkLogin(id);
		
		return userVo;//json 형태
	}
	
	@RequestMapping(value="/SQLTab", method=RequestMethod.GET)
	public String SQLTab1(){
		return "/user/SQLTab";
	}
	@RequestMapping(value="/SQLTab", method=RequestMethod.POST)
	public String SQLTab2(){
		return "/user/SQLTab";
	}
	
	
}
