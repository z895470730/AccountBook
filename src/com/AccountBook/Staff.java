package com.AccountBook;
import java.awt.*;

import javax.swing.UIManager;
public class Staff{
	/*个人电子账本系统主类*/
	private boolean packFrame=false;
	//构造方法
	public Staff(){
		new MainFace().mainface();	
	}
	public static void main(String[] args) {
		try {
			//获取本地系统界面风格
			String UIFace=UIManager.getSystemLookAndFeelClassName();
			//设置系统运行界面与本地一致
			UIManager.setLookAndFeel(UIFace);
		}catch(Exception e) {
			// e.printStackTrace();
		}
		new Staff();
	}
}
