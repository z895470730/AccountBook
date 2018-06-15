package com.AccountBook;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.*;
public class StatisticsPage extends JPanel{
	private JLabel label;
	private JButton btn;
	private JTextField datejte;
	private JTable tab;
	private JScrollPane jsp;
	private JButton del;
	private JButton sta;
	public StatisticsPage() {
		this.statisticspage();
	}
	public void statisticspage(){ 
		label=new JLabel("输入要修改的数据的日期:");
		datejte=new JTextField();
		jsp=new JScrollPane();
		btn=new JButton("查询");
		del=new JButton("删除");
		sta=new JButton("保存");
		label.setFont(new Font("黑体",Font.PLAIN, 17));
		label.setSize(300,15);
		label.setLocation(15,15);
		this.add(label);
		datejte.setSize(240,23);
		datejte.setLocation(130,42);
		this.add(datejte);
		btn.setSize(65,23);
		btn.setLocation(380,42);
		this.add(btn);
		jsp.setSize(540,320);
		jsp.setLocation(0,80);
		jsp.setHorizontalScrollBarPolicy(                
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setVerticalScrollBarPolicy(                
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        del.setSize(65,23);
        del.setLocation(130,410);
        this.add(del);
        sta.setSize(65,23);
        sta.setLocation(300,410);
        this.add(sta);
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
	}
}