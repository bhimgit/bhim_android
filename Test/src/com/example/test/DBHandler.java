package com.example.test;

import android.database.sqlite.SQLiteDatabase;

public class DBHandler {
	
	private static final String TABLE_NAME="table_list";
	private SQLiteDatabase sqLiteDatabase = null;
	private String dbName, tableName;

	public void setDBName(String dbName) {
		this.dbName = dbName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
