package spring.project.easydb;

public class TableTempVO {

	String table_Name;
	String column_Name;
	String data_Type;
	String data_Length;
	String nullable;
	String column_Value;
	
	public String getTable_Name() {
		return table_Name;
	}
	public void setTable_Name(String table_Name) {
		this.table_Name = table_Name;
	}
	public String getColumn_Name() {
		return column_Name;
	}
	public void setColumn_Name(String column_Name) {
		this.column_Name = column_Name;
	}
	public String getData_Type() {
		return data_Type;
	}
	public void setData_Type(String data_Type) {
		this.data_Type = data_Type;
	}
	public String getData_Length() {
		return data_Length;
	}
	public void setData_Length(String data_Length) {
		this.data_Length = data_Length;
	}
	public String getNullable() {
		return nullable;
	}
	public void setNullable(String nullable) {
		this.nullable = nullable;
	}
	public String getColumn_Value() {
		return column_Value;
	}
	public void setColumn_Value(String column_Value) {
		this.column_Value = column_Value;
	}
	
}
