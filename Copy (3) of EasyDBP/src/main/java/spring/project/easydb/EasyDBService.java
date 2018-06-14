package spring.project.easydb;

import java.util.List;

public interface EasyDBService {
	public List<TableVO> getTable(String tableName);
	public UserVO checkLogin(String id);
	
}
