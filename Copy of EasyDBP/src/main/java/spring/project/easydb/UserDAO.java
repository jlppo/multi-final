package spring.project.easydb;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDAO {
	
	@Autowired
	SqlSession session;
	
	public UserVO checkLogin (String id){
		return session.selectOne("dbcontrol.checkLogin", id);//id를 checkLogin으로 보내준다 --> sql-mapping.xml에서
								//mapper name이 dbcontrol인 것의 checkLogin으로 보내라. 
	}							//하나만 찾으려면 UserVO랑 selectOne해도 되는데, 여러개 뽑을꺼면 List해주자

	public void insert(Map<String,String> map) {
		session.insert("dbcontrol.insert", map);
		
	}
		
	public String write(){
		return session.toString();
	}
}
