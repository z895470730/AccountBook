package com.AccountBook;
import java.sql.*;
public class ConnectSQL {
	private static Connection conn=null;
	public ConnectSQL() {
		connect();
	}
	public void connect() {
		try {
			//��������
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//��ȡ����
			conn=DriverManager.getConnection("jdbc:sqlserver://192.168.1.105:1433;DatabaseName=AccountBook","zhangxv","root");
		}catch(Exception error){
			System.out.println("����ʧ��"+error.getMessage());
		}
	}
	//�����ṩһ����������ȡ���ݿ�����
    public static Connection getConnection(){
        return conn;
    }
	//�ر������ݿ������
    public void closeConn() {
    	try {
    		conn.close();
    	}catch(SQLException ex){
    		System.err.println("closeConn:"+ex.getMessage());
    	}
    }
}
