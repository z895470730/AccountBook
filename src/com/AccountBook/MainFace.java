package com.AccountBook;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.*;
import java.awt.event.ActionEvent;
public class MainFace extends JFrame{
	/*
	 *ϵͳ������ 
	 */
		private JPanel leftmenu;
		public JScrollPane rightmenu;
		private JPanel top;
		private JButton consumebtn;
		private JButton addbtn;
		private JButton Statisticsbtn;
		private JButton modifybtn;
		private JButton querybtn;
		private JLabel text;
		private JLabel xxx;
		private JLabel yuan;
	 public MainFace() {
}
	 public void mainface() {
		 this.setTitle("�����˱�");
		 this.setSize(700,600);
		 this.setLocation(600, 200);
		 this.addWindowListener(new mainfaceListener());//�رմ���
		 this.setLayout(null);
		 top=new JPanel();
		 rightmenu=new JScrollPane();
		 leftmenu=new JPanel();
		 text=new JLabel("�����Ѿ�����");
		 xxx=new JLabel("xxx");
		 yuan=new JLabel("Ԫ");
		 consumebtn=new JButton("���ջ���");
		 addbtn=new JButton("��ӻ���");
		 Statisticsbtn=new JButton("����ͳ��");
		 modifybtn=new JButton("�޸Ļ���");
		 querybtn=new JButton("��ѯ����");
		 Color color=new Color(34,203,100);
		 this.add(top);
		 this.add(leftmenu);
		 this.add(rightmenu);
		 top.setSize(700,130);
		 top.setLocation(0,0);
		 top.setBackground(color);
		 top.setLayout(null);
		 text.setFont(new Font("΢���ź�",Font.PLAIN, 45));
		 text.setForeground(color.WHITE);
		 text.setSize(270,100);
		 text.setLocation(30,10);
		 xxx.setFont(new Font("΢���ź�",Font.PLAIN, 45));
		 xxx.setForeground(color.WHITE);
		 xxx.setSize(270,100);
		 xxx.setLocation(320,10);
		 yuan.setFont(new Font("΢���ź�",Font.PLAIN, 45));
		 yuan.setForeground(color.WHITE);
		 yuan.setSize(270,100);
		 yuan.setLocation(420,10);
		 top.add(yuan);
		 top.add(xxx);
		 top.add(text);
		 rightmenu.setSize(550,470);
		 rightmenu.setLocation(150,130);
		 rightmenu.setLayout(null);
		 consumebtn.setPreferredSize(new Dimension(120,40)); 
		 addbtn.setPreferredSize(new Dimension(120,40)); 
		 Statisticsbtn.setPreferredSize(new Dimension(120,40)); 
		 modifybtn.setPreferredSize(new Dimension(120,40)); 
		 querybtn.setPreferredSize(new Dimension(120,40)); 
		 leftmenu.add(consumebtn);
		 leftmenu.add(addbtn);
		 leftmenu.add(Statisticsbtn);
		 leftmenu.add(modifybtn);
		 leftmenu.add(querybtn);
		 leftmenu.setSize(150,470);
		 leftmenu.setLocation(0,130);
		 leftmenu.setBackground(Color.lightGray);	
		 class Listener implements ActionListener{
			 String consume="���ջ���";
			 String add="��ӻ���";
			 String Statistics="����ͳ��";
			 String modify="�޸Ļ���";
			 String query="��ѯ����";
			public void actionPerformed(ActionEvent e) {
				if(add==e.getActionCommand()) {
						rightmenu.removeAll();
						rightmenu.add(new AddPage());
						System.out.println("���");
						rightmenu.repaint();
			}else {
				if(consume==e.getActionCommand()) {
					rightmenu.removeAll();
					rightmenu.add(new HomePage());
					rightmenu.repaint();
					System.out.println("����");
				}else{
					if(Statistics==e.getActionCommand()) {
						rightmenu.removeAll();
						rightmenu.add(new ModifyPage());
						rightmenu.repaint();				
						System.out.println("ͳ��");
					}else {
						if(modify==e.getActionCommand()) {
							rightmenu.removeAll();
							rightmenu.repaint();
							rightmenu.add(new StatisticsPage());
							System.out.println("�޸�");
						}else {
							if(query==e.getActionCommand()) {
								rightmenu.removeAll();
								rightmenu.add(new QueryPage());
								rightmenu.repaint();
								System.out.println("��ѯ");
							}
						}
					}
				}
			}
		}
	}
		 rightmenu.add(new HomePage());
		 consumebtn.addActionListener(new Listener());
		 addbtn.addActionListener(new Listener());
		 Statisticsbtn.addActionListener(new Listener());
		 modifybtn.addActionListener(new Listener());
		 querybtn.addActionListener(new Listener());		
		 rightmenu.setVisible(true);
		 this.setResizable(false);
		 this.setVisible(true);
	 }
}
	class mainfaceListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			Window window=(Window) e.getComponent();
			window.dispose();
		}
}
