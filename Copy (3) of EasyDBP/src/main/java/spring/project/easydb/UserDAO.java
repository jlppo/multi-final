package spring.project.easydb;

import java.util.HashMap;
import java.util.List;
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

	public List<HashMap<String, String>> insert(String column) {
		session.insert("dbcontrol.insert", column);
		return null;
		
	}
	public List<HashMap<String, String>> update(String column) {
		session.update("dbcontrol.update", column);
		return null;
		
	}
	public List<HashMap<String, String>> delete(String column) {
		session.delete("dbcontrol.delete", column);
		return null;
		
	}
		
	/*public List<HashMap<String, String>> select(String column) {
		System.out.println(column);
		return session.selectList("dbcontrol.select", column);
		
	}
	
	//insert, update, delete 다 int로 반환되고 그건 성공된 row 갯수임.
	public List<HashMap<String, String>> insert(String column) {
		System.out.println(column);
		return session.insert("dbcontrol.insert", column);
		
	}*/
	
}
