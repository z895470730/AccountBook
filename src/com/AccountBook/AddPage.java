package com.AccountBook;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.*;

public class AddPage extends JScrollPane{
	//获取时间戳
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
	String sj=df.format(System.currentTimeMillis());
	/*花销标题*/
	private JLabel clotheslabel=new JLabel("衣物花销:");
	private JLabel foodlabel=new JLabel("食物花销:");
	private JLabel livelabel=new JLabel("居住花销:");
	private JLabel travellabel=new JLabel("出行花销:");
	private JLabel otherlabel=new JLabel("其他花销:");
	/*各项花销名称*/
	private JLabel clothesname=new JLabel("名称");
	private JLabel travelname=new JLabel("名称");
	private JLabel othername=new JLabel("名称");
	private JLabel livename=new JLabel("名称");
	/*各项备注*/
	private JLabel clothesnote=new JLabel("备注");
	private JLabel foodnote=new JLabel("备注");
	private JLabel travelnote=new JLabel("备注");
	private JLabel othernote=new JLabel("备注");
	private JLabel livenote=new JLabel("备注");
	/*各项备注输入框*/
	JTextField clothesnotejte=new JTextField();
	JTextField foodnotejte=new JTextField();
	JTextField livenotejte=new JTextField();
	JTextField travelnotejte=new JTextField();
	JTextField othernotejte=new JTextField();
	/*各项花销名称输入框*/
	JTextField clothesjte=new JTextField();
	JTextField livejte=new JTextField();
	JTextField traveljte=new JTextField();
	JTextField otherjte=new JTextField();
	/*各项提交按钮*/
	JButton clothesSubmission=new JButton("提交");
	JButton liveSubmission=new JButton("提交");
	JButton foodSubmission=new JButton("提交");
	JButton travelSubmission=new JButton("提交");
	JButton otherSubmission=new JButton("提交");
	/*各项金额名称*/
	private JLabel clothesmoneyname=new JLabel("金额");
	private JLabel livemoneyname=new JLabel("金额");
	private JLabel foodmoneyname=new JLabel("金额");
	private JLabel travelmoneyname=new JLabel("金额");
	private JLabel othermoneyname=new JLabel("金额");
	/*各项金额*/
	JTextField clothesmoney=new JTextField();
	JTextField foodmoney=new JTextField();
	JTextField livemoney=new JTextField();
	JTextField travelmoney=new JTextField();
	JTextField othermoney=new JTextField();
	/*各输入框的值*/
	private String ClothesNameValue;
	private String ClothesMoneyValue;
	private String ClothesNoteValue;
	private String type;
	private String FoodMoneyValue;
	private String FoodNoteValue;
	private String LiveNameValue;
	private String LiveMoneyValue;
	private String LiveNoteValue;
	private String TravelNameValue;
	private String TravelMoneyValue;
	private String TravelNoteValue;
	private String OtherNameValue;
	private String OtherMoneyValue;
	private String OtherNoteValue;
	
	private JComboBox combobox=new JComboBox();
	
	public AddPage() {
		this.addpage();
	}
	public void addpage() {
		/*衣物花销*/
		clotheslabel.setFont(new Font("黑体",Font.PLAIN, 17));
		clotheslabel.setSize(100,50);
		clotheslabel.setLocation(15,0);
		this.add(clotheslabel);
		clothesname.setSize(100,50);
		clothesname.setLocation(15,30);
		clothesname.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(clothesname);
		clothesjte.setSize(80,23);
		clothesjte.setLocation(45,44);
		this.add(clothesjte);
		clothesnote.setSize(100,50);
		clothesnote.setLocation(270,30);
		clothesnote.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(clothesnote);
		clothesnotejte.setSize(130,23);
		clothesnotejte.setLocation(300,43);
		this.add(clothesnotejte);
		clothesSubmission.setSize(65,23);
		clothesSubmission.setLocation(440,43);
		this.add(clothesSubmission);
		clothesSubmission.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						ClothesNameValue=clothesjte.getText();
						ClothesMoneyValue=clothesmoney.getText();
						ClothesNoteValue=clothesnotejte.getText();
						//写入数据库
						ConnectSQL sql=new ConnectSQL();
						Connection conn=sql.getConnection();
						ResultSet rs=null;
						Statement stmt=null;
						try {
							stmt=conn.createStatement();			
							String Sentence="INSERT INTO Clothes(date,clothes,money,note)"
									+"VALUES('"+sj+"','"+ClothesNameValue+"','"+ClothesMoneyValue+"','"+ClothesNoteValue+"')";
							int num=stmt.executeUpdate(Sentence);
							if(num>0) {
								System.out.println("插入成功");
							}
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						System.out.println(sj);
						System.out.println(ClothesNameValue);
						System.out.println(ClothesMoneyValue);
						System.out.println(ClothesNoteValue);
					}
				}
		);
		clothesmoneyname.setSize(100,50);
		clothesmoneyname.setLocation(150,30);
		clothesmoneyname.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(clothesmoneyname);
		clothesmoney.setSize(60,23);
		clothesmoney.setLocation(180,43);
		this.add(clothesmoney);
		/*居住花销*/
		livelabel.setFont(new Font("黑体",Font.PLAIN, 17));
		livelabel.setSize(100,50);
		livelabel.setLocation(15,60);
		this.add(livelabel);
		livename.setSize(100,50);
		livename.setLocation(15,90);
		livename.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(livename);
		livejte.setSize(80,23);
		livejte.setLocation(45,105);
		this.add(livejte);
		livenote.setSize(100,50);
		livenote.setLocation(270,90);
		livenote.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(livenote);
		livenotejte.setSize(130,23);
		livenotejte.setLocation(300,105);
		this.add(livenotejte);
		liveSubmission.setSize(65,23);
		liveSubmission.setLocation(440,105);
		this.add(liveSubmission);
		liveSubmission.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						LiveNameValue=livejte.getText();
						LiveMoneyValue=livemoney.getText();
						LiveNoteValue=livenotejte.getText();
//						写入数据库
						ConnectSQL sql=new ConnectSQL();
						Connection conn=sql.getConnection();
						ResultSet rs=null;
						Statement stmt=null;
						try {
							stmt=conn.createStatement();			
							String Sentence="INSERT INTO Live(date,name,money,note)"
							+"VALUES('"+sj+"','"+LiveNameValue+"','"+LiveMoneyValue+"','"+LiveNoteValue+"')";
							int num=stmt.executeUpdate(Sentence);
							if(num>0) {
								System.out.println("插入成功");
							}
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
		);
		livemoneyname.setSize(100,50);
		livemoneyname.setLocation(150,90);
		livemoneyname.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(livemoneyname);
		livemoney.setSize(60,23);
		livemoney.setLocation(180,105);
		this.add(livemoney);
		/*出行花销*/
		travellabel.setFont(new Font("黑体",Font.PLAIN, 17));
		travellabel.setSize(100,50);
		travellabel.setLocation(15,120);
		this.add(travellabel);
		travelname.setSize(100,50);
		travelname.setLocation(15,150);
		travelname.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(travelname);
		traveljte.setSize(80,23);
		traveljte.setLocation(45,165);
		this.add(traveljte);
		travelnote.setSize(100,50);
		travelnote.setLocation(270,150);
		travelnote.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(travelnote);
		travelnotejte.setSize(130,23);
		travelnotejte.setLocation(300,165);
		this.add(travelnotejte);
		travelSubmission.setSize(65,23);
		travelSubmission.setLocation(440,165);
		this.add(travelSubmission);
		travelSubmission.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						TravelNameValue=traveljte.getText();
						TravelMoneyValue=travelmoney.getText();
						TravelNoteValue=travelnotejte.getText();
//						写入数据库
						ConnectSQL sql=new ConnectSQL();
						Connection conn=sql.getConnection();
						ResultSet rs=null;
						Statement stmt=null;
						try {
							stmt=conn.createStatement();			
							String Sentence="INSERT INTO Travel(date,name,money,note)"
									+"VALUES('"+sj+"','"+TravelNameValue+"','"+TravelMoneyValue+"','"+TravelNoteValue+"')";
							int num=stmt.executeUpdate(Sentence);
							if(num>0) {
								System.out.println("插入成功");
							}
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						System.out.println(TravelNameValue);
						System.out.println(TravelMoneyValue);
						System.out.println(TravelNoteValue);
					}
				}
		);
		travelmoneyname.setSize(100,50);
		travelmoneyname.setLocation(150,150);
		travelmoneyname.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(travelmoneyname);
		travelmoney.setSize(60,23);
		travelmoney.setLocation(180,165);
		this.add(travelmoney);
		/*食物花销*/
		foodlabel.setFont(new Font("黑体",Font.PLAIN, 17));
		foodlabel.setSize(100,50);
		foodlabel.setLocation(15,180);
		this.add(foodlabel);
		combobox.addItem("请选择");
		combobox.addItem("早饭");
		combobox.addItem("午饭");
		combobox.addItem("晚饭");
		combobox.addItem("其他");
		combobox.setSize(100,23);
		combobox.setLocation(25,220);
		this.add(combobox);
		foodnote.setSize(100,50);
		foodnote.setLocation(270,205);
		foodnote.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(foodnote);
		foodnotejte.setSize(130,23);
		foodnotejte.setLocation(300,220);
		this.add(foodnotejte);
		foodSubmission.setSize(65,23);
		foodSubmission.setLocation(440,220);
		this.add(foodSubmission);
		foodSubmission.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						type=(String) combobox.getSelectedItem();
						FoodMoneyValue=foodmoney.getText();
						FoodNoteValue=foodnotejte.getText();
						//写入数据库
						ConnectSQL sql=new ConnectSQL();
						Connection conn=sql.getConnection();
						ResultSet rs=null;
						Statement stmt=null;
						try {
							stmt=conn.createStatement();			
							String Sentence="INSERT INTO Food(date,type,money,note)"
									+"VALUES('"+sj+"','"+type+"','"+FoodMoneyValue+"','"+FoodNoteValue+"')";
							int num=stmt.executeUpdate(Sentence);
							if(num>0) {
								System.out.println("插入成功");
							}
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
		);
		foodmoneyname.setSize(100,50);
		foodmoneyname.setLocation(150,205);
		foodmoneyname.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(foodmoneyname);
		foodmoney.setSize(60,23);
		foodmoney.setLocation(180,220);
		this.add(foodmoney);
		
		/*其他花销*/
		otherlabel.setFont(new Font("黑体",Font.PLAIN, 17));
		otherlabel.setSize(100,50);
		otherlabel.setLocation(15,240);
		this.add(otherlabel);
		othername.setSize(100,50);
		othername.setLocation(15,270);
		othername.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(othername);
		otherjte.setSize(80,23);
		otherjte.setLocation(45,285);
		this.add(otherjte);
		othernote.setSize(100,50);
		othernote.setLocation(270,270);
		othernote.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(othernote);
		othernotejte.setSize(130,23);
		othernotejte.setLocation(300,285);
		this.add(othernotejte);
		otherSubmission.setSize(65,23);
		otherSubmission.setLocation(440,285);
		this.add(otherSubmission);
		otherSubmission.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						OtherNameValue=otherjte.getText();
						OtherMoneyValue=othermoney.getText();
						OtherNoteValue=othernotejte.getText();
//						写入数据库
						ConnectSQL sql=new ConnectSQL();
						Connection conn=sql.getConnection();
						ResultSet rs=null;
						Statement stmt=null;
						try {
							stmt=conn.createStatement();			
							String Sentence="INSERT INTO Other(date,name,money,note)"
									+"VALUES('"+sj+"','"+OtherNameValue+"','"+OtherMoneyValue+"','"+OtherNoteValue+"')";
							int num=stmt.executeUpdate(Sentence);
							if(num>0) {
								System.out.println("插入成功");
							}
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
		);
		othermoneyname.setSize(100,50);
		othermoneyname.setLocation(150,270);
		othermoneyname.setFont(new Font("黑体",Font.PLAIN,14));
		this.add(othermoneyname);
		othermoney.setSize(60,23);
		othermoney.setLocation(180,285);
		this.add(othermoney);
		this.setSize(550,470);
		this.setLocation(0,0);
		this.setLayout(null);
		this.setSize(550,470);
		this.setLocation(0,0);
		this.setVisible(true);
	}
	
}
