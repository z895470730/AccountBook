package com.AccountBook;
import java.sql.*;
public class ConnectSQL {
	private static Connection conn=null;
	public ConnectSQL() {
		connect();
	}
	public void connect() {
		try {
			//加载驱动
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//获取链接
			conn=DriverManager.getConnection("jdbc:sqlserver://192.168.1.105:1433;DatabaseName=AccountBook","zhangxv","root");
		}catch(Exception error){
			System.out.println("连接失败"+error.getMessage());
		}
	}
	//对外提供一个方法来获取数据库连接
    public static Connection getConnection(){
        return conn;
    }
	//关闭与数据库的连接
    public void closeConn() {
    	try {
    		conn.close();
    	}catch(SQLException ex){
    		System.err.println("closeConn:"+ex.getMessage());
    	}
    }
}
