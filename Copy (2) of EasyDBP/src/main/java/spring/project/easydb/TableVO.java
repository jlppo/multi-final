package spring.project.easydb;

import java.util.ArrayList;

public class TableVO {

	String tableName;
	ArrayList<String> columnNameList;
	//ArrayList<String> columnValueList;
	ArrayList<String> columnTypeList;
	ArrayList<String> columnLengthList;
	ArrayList<String> columnNullableList;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public ArrayList<String> getColumnNameList() {
		return columnNameList;
	}

	public void setColumnNameList(ArrayList<String> columnNameList) {
		this.columnNameList = columnNameList;
	}

/*	public ArrayList<String> getColumnValueList() {
		return columnValueList;
	}

	public void setColumnValueList(ArrayList<String> columnValueList) {
		this.columnValueList = columnValueList;
	}*/

	public ArrayList<String> getColumnTypeList() {
		return columnTypeList;
	}

	public void setColumnTypeList(ArrayList<String> columnTypeList) {
		this.columnTypeList = columnTypeList;
	}
	
	public ArrayList<String> getColumnLengthList() {
		return columnLengthList;
	}

	public void setColumnLengthList(ArrayList<String> columnLengthList) {
		this.columnLengthList = columnLengthList;
	}

	public ArrayList<String> getColumnNullableList() {
		return columnNullableList;
	}

	public void setColumnNullableList(ArrayList<String> columnNullableList) {
		this.columnNullableList = columnNullableList;
	}

	@Override
	public String toString() {
		return "TableVO [tableName=" + tableName + ", columnNameList=" + columnNameList + ",  columnTypeList=" + columnTypeList + "]";
	}
}
