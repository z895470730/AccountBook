package com.AccountBook;
import java.awt.*;

import javax.swing.UIManager;
public class Staff{
	/*���˵����˱�ϵͳ����*/
	private boolean packFrame=false;
	//���췽��
	public Staff(){
		new MainFace().mainface();	
	}
	public static void main(String[] args) {
		try {
			//��ȡ����ϵͳ������
			String UIFace=UIManager.getSystemLookAndFeelClassName();
			//����ϵͳ���н����뱾��һ��
			UIManager.setLookAndFeel(UIFace);
		}catch(Exception e) {
			// e.printStackTrace();
		}
		new Staff();
	}
}
