package ex1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Admin_kiosk extends JFrame{
	String [] columnName = {"주문유형", "주문번호", "메뉴", "수량"};
	Kiosk a = new Kiosk();
	
	public Admin_kiosk() {
		setTitle("관리자 화면");
		JPanel admin_panel = new JPanel();
		setContentPane(admin_panel);
		setSize(300,300);
		setResizable(false);
		setVisible(true);
		JLabel newlabel=new JLabel("대기중...");
		add(newlabel);
		String [][] test = null;
		JTable table = new JTable();
		
	}

}
