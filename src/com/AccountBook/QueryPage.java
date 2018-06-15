package com.AccountBook;
import java.awt.*;
import javax.swing.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
public class QueryPage extends JScrollPane {
	private JLabel date;
	private JTextField yearjte;
	private JTextField monjte;
	private JTextField datejte;
	private JButton datebtn;
	private String value;
	private JTable tab;
	private JScrollPane jsp;
	private JLabel font;
	public QueryPage(){ 
		this.querypage();
		
	}
	public void querypage() {
		date=new JLabel("输入查询日期:");
		yearjte=new JTextField(10);
		monjte=new JTextField(10);
		datejte=new JTextField(10);
		font=new JLabel("年        月       日");
		datebtn=new JButton("查询");
		jsp=new JScrollPane();
		jsp.setSize(540,500);
		jsp.setLocation(0,70);
	    jsp.setHorizontalScrollBarPolicy(                
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setVerticalScrollBarPolicy(                
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		date.setFont(new Font("黑体",Font.PLAIN, 17));
		date.setSize(300,50);
		date.setLocation(15,15);
		this.add(date);
		font.setSize(500,23);
		font.setLocation(200,30);
		font.setFont(new Font("黑体",Font.PLAIN, 17));
		this.add(font);
		yearjte.setSize(60,23);
		yearjte.setLocation(130,30);
		this.add(yearjte);
		monjte.setSize(60,23);
		monjte.setLocation(220,30);
		this.add(monjte);
		datejte.setSize(60,23);
		datejte.setLocation(310,30);
		this.add(datejte);
		datebtn.setSize(65,23);
		datebtn.setLocation(390,30);
		this.add(datebtn);
		Object[]  columnTitle= {"花销名称","金额","备注"};
		Object[][] tableDate=new Object[20][3];
		tab = new JTable(tableDate,columnTitle);
		tab.setSize(540,600);
		tab.setLocation(0,0);
		tab.setRowHeight(21);
		jsp.setViewportView(tab);
		this.add(jsp);
		this.setSize(550,470);
		this.setLocation(0,0);
		this.setVisible(true);
		datebtn.addActionListener(
				 new ActionListener(){
						public void actionPerformed(ActionEvent e) {							
							value=yearjte.getText();
							//在数据库中查找
							ConnectSQL sql=new ConnectSQL();
							Connection conn=sql.getConnection();
							ResultSet rs=null;
							Statement stmt=null;
							try {
								stmt=conn.createStatement();			
								String Sentence="";
								int num=stmt.executeUpdate(Sentence);
								if(num>0) {
									System.out.println("查询成功");
								}
								
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
							System.out.println(value);
						}
		            }
				 );		
	}
}
