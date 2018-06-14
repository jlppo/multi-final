package spring.project.easydb;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DataDAO {
	
	@Autowired
	SqlSession session;
	
	public List<TableVO> selectAll(){
		return session.selectList("dbcontrol.selectAll");
	}
	
}
