package com.AccountBook;

import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ModifyPage extends JScrollPane{
	private JLabel year;
	private JLabel month;
	private JLabel week;
	private JLabel clothes;
	private JLabel food;
	private JLabel live;
	private JLabel travel;
	private JLabel other;
	private JLabel yeardata;
	private JLabel monthdata;
	private JLabel weekdata;
	private JLabel clothesdata;
	private JLabel fooddata;
	private JLabel livedata;
	private JLabel traveldata;
	private JLabel otherdata;
	private String yearvalue;
	private String monthvalue;
	private String weekvalue;
	private String clothesvalue;
	private String foodvalue;
	private String livevalue;
	private String travelvalue;
	private String othervalue;
	//获取时间戳
			SimpleDateFormat df = new SimpleDateFormat("yyyy"); 
			String sj=df.format(System.currentTimeMillis());
	public ModifyPage() {
		this.modifypage();
	}
	public void modifypage() {
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
				
	}  			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 year=new JLabel("年度共花销：");
		 month=new JLabel("本月共花销：");
		 clothes=new JLabel("衣物共花销：");
		 food=new JLabel("餐饮共花销：");
		 live=new JLabel("住房共花销：");
		 travel=new JLabel("出行共花销：");
		 other=new JLabel("其它共花销:");
		 yeardata=new JLabel("xxx");
		 monthdata=new JLabel("xxx");
		 weekdata=new JLabel("xxx");
		 clothesdata=new JLabel("xxx");
		 fooddata=new JLabel("xxx");
		 livedata=new JLabel("xxx");
		 traveldata=new JLabel("xxx");
		 otherdata=new JLabel("xxx");
		 //添加组件
		 	year.setFont(new Font("黑体",Font.PLAIN, 17));
		 	year.setSize(160,50);
		 	year.setLocation(15,0);
			this.add(year);
			yeardata.setFont(new Font("黑体",Font.PLAIN, 17));
			yeardata.setSize(40,50);
			yeardata.setLocation(120,0);
			this.add(yeardata);
			month.setSize(160,50);
			month.setLocation(15,40);
			month.setFont(new Font("黑体",Font.PLAIN,17));
			this.add(month);
			monthdata.setSize(40,50);
			monthdata.setLocation(120,40);
			monthdata.setFont(new Font("黑体",Font.PLAIN,17));
			this.add(monthdata);
			clothes.setSize(160,50);
			clothes.setLocation(15,80);
			clothes.setFont(new Font("黑体",Font.PLAIN,17));
			this.add(clothes);
			clothesdata.setSize(40,50);
			clothesdata.setLocation(120,80);
			clothesdata.setFont(new Font("黑体",Font.PLAIN,17));
			this.add(clothesdata);
			food.setFont(new Font("黑体",Font.PLAIN, 17));
			food.setSize(160,50);
			food.setLocation(15,120);
			this.add(food);
			fooddata.setFont(new Font("黑体",Font.PLAIN, 17));
			fooddata.setSize(40,50);
			fooddata.setLocation(120,120);
			this.add(fooddata);
			live.setSize(160,50);
			live.setLocation(15,160);
			live.setFont(new Font("黑体",Font.PLAIN,17));
			this.add(live);
			livedata.setSize(40,50);
			livedata.setLocation(120,160);
			livedata.setFont(new Font("黑体",Font.PLAIN,17));
			this.add(livedata);
			travel.setFont(new Font("黑体",Font.PLAIN, 17));
			travel.setSize(160,50);
			travel.setLocation(15,200);
			this.add(travel);
			traveldata.setFont(new Font("黑体",Font.PLAIN, 17));
			traveldata.setSize(40,50);
			traveldata.setLocation(120,200);
			this.add(traveldata);
			 other.setFont(new Font("黑体",Font.PLAIN, 17));
			 other.setSize(160,50);
			 other.setLocation(15,240);
			this.add(other);
			otherdata.setFont(new Font("黑体",Font.PLAIN, 17));
			 otherdata.setSize(40,50);
			 otherdata.setLocation(120,240);
			this.add(otherdata);
			this.setSize(550,470);
			this.setLocation(0,0);
			this.setLayout(null);
			this.setSize(550,470);
			this.setLocation(0,0);
			this.setVisible(true);
			
	}
}
