package spring.project.easydb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EasyDBServiceImpl implements EasyDBService {
	
	@Autowired
	UserDAO userDao;
	@Autowired
	TableDAO tableDao;
	@Autowired
	DataDAO dataDao;
	
	@Override
	public UserVO checkLogin(String id){
		return userDao.checkLogin(id);
	}
	
	@Override
	
	public List<TableVO> getTable(String tableName){
		return tableDao.getTable(tableName);
	}
	
}
