package spring.project.easydb;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TableDAO {
	
	@Autowired
	SqlSession session;

	public List<TableVO> getTable(String tableName){
		// TODO Auto-generated method stub
		List<TableTempVO> tmplist = session.selectList("dbcontrol.selectAllTable", tableName);
		//List<TableVO> list=new ArrayList<TableVO>();
		
		ArrayList<String> columnNameList=new ArrayList<>();		
		ArrayList<String> columnLengthList=new ArrayList<String>();
		ArrayList<String> columnTypeList=new ArrayList<String>();
		ArrayList<String> columnNullableList=new ArrayList<String>();
		
		TableVO vo = new TableVO();
		List<TableVO> list =new ArrayList<TableVO>();
		
		vo.setTableName(tableName);
		
		System.out.println("tmplist_SIZE : " + tmplist.size());
		
		for (int i = 0; i <tmplist.size() ; i++) {
			System.out.print(" / Name : " + tmplist.get(i).getColumn_Name());
			System.out.print(" / Type : " + tmplist.get(i).getData_Type());
			System.out.print(" / Length : " + tmplist.get(i).getData_Length());
			System.out.println(" / Nullable : " + tmplist.get(i).getNullable());
			columnNameList.add(tmplist.get(i).getColumn_Name());
			columnTypeList.add(tmplist.get(i).getData_Type());
			columnLengthList.add(tmplist.get(i).getData_Length());
			columnNullableList.add(tmplist.get(i).getNullable());
		}
		
		vo.setColumnNameList(columnNameList);
		vo.setColumnTypeList(columnTypeList);
		vo.setColumnLengthList(columnLengthList);
		vo.setColumnNullableList(columnNullableList);
	
		list.add(vo);
		
		return list;
	}
}

/*List<TableTempVO>  list = </TableVO>seesionn.selectList("", "");
[TABLE_NAME,COLUMN_NAME, DATA_TYPE, DATA_LENGTH]
[TABLE_NAME,COLUMN_NAME, DATA_TYPE, DATA_LENGTH]
[TABLE_NAME,COLUMN_NAME, DATA_TYPE, DATA_LENGTH]*/