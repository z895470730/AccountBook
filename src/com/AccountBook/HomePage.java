package com.AccountBook;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.*;
public class HomePage extends JScrollPane{
	JLabel clothes;
	JLabel clothesdata;
	JTable tab;
	int x=0;
	//获取时间戳
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		String sj=df.format(System.currentTimeMillis());
	public HomePage() {
		this.homepage();
	}
	public void homepage(){
		Object[]  columnTitle= {"花销名称","金额","备注"};
		Object[][] tableDate=new Object[30][3];
		tab=new JTable(tableDate,columnTitle);
		tab.setSize(540,600);
		tab.setLocation(0, 30);
		tab.setRowHeight(21);
		this.setHorizontalScrollBarPolicy(                
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.setVerticalScrollBarPolicy(                
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //在数据库中查找
		ConnectSQL sql=new ConnectSQL();
		Connection conn=sql.getConnection();
		ResultSet rs=null;
		Statement stmt=null;
		try {
			stmt=conn.createStatement();			
			String Sentence="select *from Clothes where date='"+sj+"'";
			rs=stmt.executeQuery(Sentence);
			while (rs.next()){ 
				tableDate[x][0]=rs.getString(2);
				tableDate[x][1]=rs.getString(3);
				tableDate[x][2]=rs.getString(4);
				x=x+1;
	}  			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			stmt=conn.createStatement();			
			String Sentence="select *from Food where date='"+sj+"'";
			rs=stmt.executeQuery(Sentence);
			while (rs.next()){ 
				tableDate[x][0]=rs.getString(2);
				tableDate[x][1]=rs.getString(3);
				tableDate[x][2]=rs.getString(4);
				x=x+1;
	}  			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		try {
			stmt=conn.createStatement();			
			String Sentence="select *from Live where date='"+sj+"'";
			rs=stmt.executeQuery(Sentence);
			while (rs.next()){ 
				tableDate[x][0]=rs.getString(2);
				tableDate[x][1]=rs.getString(3);
				tableDate[x][2]=rs.getString(4);
				x=x+1;
	}  			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		try {
			stmt=conn.createStatement();			
			String Sentence="select *from Travel where date='"+sj+"'";
			rs=stmt.executeQuery(Sentence);
			while (rs.next()){ 
				tableDate[x][0]=rs.getString(2);
				tableDate[x][1]=rs.getString(3);
				tableDate[x][2]=rs.getString(4);
				x=x+1;
	}  			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			stmt=conn.createStatement();			
			String Sentence="select *from Other where date='"+sj+"'";
			rs=stmt.executeQuery(Sentence);
			while (rs.next()){ 
				tableDate[x][0]=rs.getString(2);
				tableDate[x][1]=rs.getString(3);
				tableDate[x][2]=rs.getString(4);
				x=x+1;
	}  			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		this.setViewportView(tab);
		this.setSize(550,470);
		this.setLocation(0,0);
		this.setVisible(true);
	}
}
