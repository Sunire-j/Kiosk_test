package ex1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Admin_kiosk extends JFrame{
	String [] columnName = {"�ֹ�����", "�ֹ���ȣ", "�޴�", "����"};
	Kiosk a = new Kiosk();
	
	public Admin_kiosk() {
		setTitle("������ ȭ��");
		JPanel admin_panel = new JPanel();
		setContentPane(admin_panel);
		setSize(300,300);
		setResizable(false);
		setVisible(true);
		JLabel newlabel=new JLabel("�����...");
		add(newlabel);
		String [][] test = null;
		JTable table = new JTable();
		
	}

}
