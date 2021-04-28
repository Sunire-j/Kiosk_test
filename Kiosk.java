package ex1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Kiosk extends JFrame {

	// 아이스 순서 아메, 카푸, 모카, 카라멜, 초코, 바닐라, 카페라떼, 헤이즐넛
	// 핫 순서 아메, 카푸, 모카, 카라멜, 초코, 바닐라, 카페라떼, 헤이즐넛
	// 음류 순서 딸기, 망고, 블루베리, 바닐라, 초코, 딸기, 청포도, 자몽
	// 디저트 순서 쿠키, 마카롱, 머핀, 베이글, 와플, 케이크

	private Image screenImage;
	private Graphics screenGraphic;
	private Image Background = new ImageIcon(Main.class.getResource("../img_src/Intro.png")).getImage();
	private ImageIcon t_o_btn_img = new ImageIcon(Main.class.getResource("../img_src/take_out_btn.png"));
	private ImageIcon t_o_btn_click_img = new ImageIcon(Main.class.getResource("../img_src/take_out_btn_click.png"));
	private ImageIcon e_i_btn_img = new ImageIcon(Main.class.getResource("../img_src/eat_in_btn.png"));
	private ImageIcon e_i_btn_click_img = new ImageIcon(Main.class.getResource("../img_src/eat_in_btn_click.png"));
	private ImageIcon coffee_ice_img = new ImageIcon(Main.class.getResource("../img_src/COFFEE(ICE).png"));
	private ImageIcon coffee_ice_click_img = new ImageIcon(Main.class.getResource("../img_src/COFFEE(ICE)_CLICK.png"));
	private ImageIcon coffee_hot_img = new ImageIcon(Main.class.getResource("../img_src/COFFEE(HOT).png"));
	private ImageIcon coffee_hot_click_img = new ImageIcon(Main.class.getResource("../img_src/COFFEE(HOT)_CLICK.png"));
	private ImageIcon beverage_img = new ImageIcon(Main.class.getResource("../img_src/BEVERAGE.png"));
	private ImageIcon beverage_click_img = new ImageIcon(Main.class.getResource("../img_src/BEVERAGE_CLICK.png"));
	private ImageIcon dessert_img = new ImageIcon(Main.class.getResource("../img_src/DESSERT.png"));
	private ImageIcon dessert_click_img = new ImageIcon(Main.class.getResource("../img_src/DESSERT_CLICK.png"));
	
	private ImageIcon add_img = new ImageIcon(Main.class.getResource("../img_src/add.png"));
	private ImageIcon add_click_img = new ImageIcon(Main.class.getResource("../img_src/add_click.png"));
	private ImageIcon check_img = new ImageIcon(Main.class.getResource("../img_src/check.png"));
	private ImageIcon check_click_img = new ImageIcon(Main.class.getResource("../img_src/check_click.png"));
	private ImageIcon amount_img = new ImageIcon(Main.class.getResource("../img_src/Amount.png"));
	private ImageIcon plus_img = new ImageIcon(Main.class.getResource("../img_src/Plus.png"));
	private ImageIcon plus_click_img = new ImageIcon(Main.class.getResource("../img_src/Plus_click.png"));
	private ImageIcon minus_img = new ImageIcon(Main.class.getResource("../img_src/Minus.png"));
	private ImageIcon minus_click_img = new ImageIcon(Main.class.getResource("../img_src/Minus_click.png"));

	private ImageIcon back_border_img = new ImageIcon(Main.class.getResource("../img_src/Back_border.png"));
	private ImageIcon back_img = new ImageIcon(Main.class.getResource("../img_src/Back.png"));
	private ImageIcon coffee_hot_border_img = new ImageIcon(
			Main.class.getResource("../img_src/COFFEE(HOT)_BORDER.png"));
	private ImageIcon coffee_ice_border_img = new ImageIcon(
			Main.class.getResource("../img_src/COFFEE(ICE)_BORDER.png"));
	private ImageIcon beverage_border_img = new ImageIcon(Main.class.getResource("../img_src/BEVERAGE_BORDER.png"));
	private ImageIcon dessert_border_img = new ImageIcon(Main.class.getResource("../img_src/DESSERT_BORDER.png"));

	private JButton take_out_btn = new JButton(t_o_btn_img);
	private JButton eat_in_btn = new JButton(e_i_btn_img);
	private JButton hidden_exit = new JButton("exit");

	private JButton coffee_ice = new JButton(coffee_ice_img);
	private JButton coffee_hot = new JButton(coffee_hot_img);
	private JButton beverage = new JButton(beverage_img);
	private JButton dessert = new JButton(dessert_img);
	private JButton back = new JButton(back_img);

	private ImageIcon menu1_1_img = new ImageIcon(Main.class.getResource("../img_src/americano.png"));
	private ImageIcon menu1_2_img = new ImageIcon(Main.class.getResource("../img_src/cappuccino.png"));
	private ImageIcon menu1_3_img = new ImageIcon(Main.class.getResource("../img_src/cafe_mocha.png"));
	private ImageIcon menu1_4_img = new ImageIcon(Main.class.getResource("../img_src/caramel.png"));
	private ImageIcon menu1_5_img = new ImageIcon(Main.class.getResource("../img_src/choco_latte.png"));
	private ImageIcon menu1_6_img = new ImageIcon(Main.class.getResource("../img_src/vanilla.png"));
	private ImageIcon menu1_7_img = new ImageIcon(Main.class.getResource("../img_src/cafe_latte.png"));
	private ImageIcon menu1_8_img = new ImageIcon(Main.class.getResource("../img_src/hazlenut_latte.png"));
	private ImageIcon menu2_1_img = new ImageIcon(Main.class.getResource("../img_src/menu2_1.png"));
	private ImageIcon menu2_2_img = new ImageIcon(Main.class.getResource("../img_src/menu2_2.png"));
	private ImageIcon menu2_3_img = new ImageIcon(Main.class.getResource("../img_src/menu2_3.png"));
	private ImageIcon menu2_4_img = new ImageIcon(Main.class.getResource("../img_src/menu2_4.png"));
	private ImageIcon menu2_5_img = new ImageIcon(Main.class.getResource("../img_src/menu2_5.png"));
	private ImageIcon menu2_6_img = new ImageIcon(Main.class.getResource("../img_src/menu2_6.png"));
	private ImageIcon menu2_7_img = new ImageIcon(Main.class.getResource("../img_src/menu2_7.png"));
	private ImageIcon menu2_8_img = new ImageIcon(Main.class.getResource("../img_src/menu2_8.png"));
	private ImageIcon menu3_1_img = new ImageIcon(Main.class.getResource("../img_src/menu3_1.png"));
	private ImageIcon menu3_2_img = new ImageIcon(Main.class.getResource("../img_src/menu3_2.png"));
	private ImageIcon menu3_3_img = new ImageIcon(Main.class.getResource("../img_src/menu3_3.png"));
	private ImageIcon menu3_4_img = new ImageIcon(Main.class.getResource("../img_src/menu3_4.png"));
	private ImageIcon menu3_5_img = new ImageIcon(Main.class.getResource("../img_src/menu3_5.png"));
	private ImageIcon menu3_6_img = new ImageIcon(Main.class.getResource("../img_src/menu3_6.png"));
	private ImageIcon menu3_7_img = new ImageIcon(Main.class.getResource("../img_src/menu3_7.png"));
	private ImageIcon menu3_8_img = new ImageIcon(Main.class.getResource("../img_src/menu3_8.png"));
	private ImageIcon menu4_1_img = new ImageIcon(Main.class.getResource("../img_src/menu4_1.png"));
	private ImageIcon menu4_2_img = new ImageIcon(Main.class.getResource("../img_src/menu4_2.png"));
	private ImageIcon menu4_3_img = new ImageIcon(Main.class.getResource("../img_src/menu4_3.png"));
	private ImageIcon menu4_4_img = new ImageIcon(Main.class.getResource("../img_src/menu4_4.png"));
	private ImageIcon menu4_5_img = new ImageIcon(Main.class.getResource("../img_src/menu4_5.png"));
	private ImageIcon menu4_6_img = new ImageIcon(Main.class.getResource("../img_src/menu4_6.png"));
	private ImageIcon menu1_1_img_border = new ImageIcon(Main.class.getResource("../img_src/americano_border.png"));
	private ImageIcon menu1_2_img_border = new ImageIcon(Main.class.getResource("../img_src/cappuccino_border.png"));
	private ImageIcon menu1_3_img_border = new ImageIcon(Main.class.getResource("../img_src/cafe_mocha_border.png"));
	private ImageIcon menu1_4_img_border = new ImageIcon(Main.class.getResource("../img_src/caramel_border.png"));
	private ImageIcon menu1_5_img_border = new ImageIcon(Main.class.getResource("../img_src/choco_latte_border.png"));
	private ImageIcon menu1_6_img_border = new ImageIcon(Main.class.getResource("../img_src/vanilla_border.png"));
	private ImageIcon menu1_7_img_border = new ImageIcon(Main.class.getResource("../img_src/cafe_latte_border.png"));
	private ImageIcon menu1_8_img_border = new ImageIcon(Main.class.getResource("../img_src/hazlenut_latte_border.png"));
	private ImageIcon menu2_1_img_border = new ImageIcon(Main.class.getResource("../img_src/menu2_1_border.png"));
	private ImageIcon menu2_2_img_border = new ImageIcon(Main.class.getResource("../img_src/menu2_2_border.png"));
	private ImageIcon menu2_3_img_border = new ImageIcon(Main.class.getResource("../img_src/menu2_3_border.png"));
	private ImageIcon menu2_4_img_border = new ImageIcon(Main.class.getResource("../img_src/menu2_4_border.png"));
	private ImageIcon menu2_5_img_border = new ImageIcon(Main.class.getResource("../img_src/menu2_5_border.png"));
	private ImageIcon menu2_6_img_border = new ImageIcon(Main.class.getResource("../img_src/menu2_6_border.png"));
	private ImageIcon menu2_7_img_border = new ImageIcon(Main.class.getResource("../img_src/menu2_7_border.png"));
	private ImageIcon menu2_8_img_border = new ImageIcon(Main.class.getResource("../img_src/menu2_8_border.png"));
	private ImageIcon menu3_1_img_border = new ImageIcon(Main.class.getResource("../img_src/menu3_1_border.png"));
	private ImageIcon menu3_2_img_border = new ImageIcon(Main.class.getResource("../img_src/menu3_2_border.png"));
	private ImageIcon menu3_3_img_border = new ImageIcon(Main.class.getResource("../img_src/menu3_3_border.png"));
	private ImageIcon menu3_4_img_border = new ImageIcon(Main.class.getResource("../img_src/menu3_4_border.png"));
	private ImageIcon menu3_5_img_border = new ImageIcon(Main.class.getResource("../img_src/menu3_5_border.png"));
	private ImageIcon menu3_6_img_border = new ImageIcon(Main.class.getResource("../img_src/menu3_6_border.png"));
	private ImageIcon menu3_7_img_border = new ImageIcon(Main.class.getResource("../img_src/menu3_7_border.png"));
	private ImageIcon menu3_8_img_border = new ImageIcon(Main.class.getResource("../img_src/menu3_8_border.png"));
	private ImageIcon menu4_1_img_border = new ImageIcon(Main.class.getResource("../img_src/menu4_1_border.png"));
	private ImageIcon menu4_2_img_border = new ImageIcon(Main.class.getResource("../img_src/menu4_2_border.png"));
	private ImageIcon menu4_3_img_border = new ImageIcon(Main.class.getResource("../img_src/menu4_3_border.png"));
	private ImageIcon menu4_4_img_border = new ImageIcon(Main.class.getResource("../img_src/menu4_4_border.png"));
	private ImageIcon menu4_5_img_border = new ImageIcon(Main.class.getResource("../img_src/menu4_5_border.png"));
	private ImageIcon menu4_6_img_border = new ImageIcon(Main.class.getResource("../img_src/menu4_6_border.png"));
	private JButton menu1_1 = new JButton(menu1_1_img);
	private JButton menu1_2 = new JButton(menu1_2_img);
	private JButton menu1_3 = new JButton(menu1_3_img);
	private JButton menu1_4 = new JButton(menu1_4_img);
	private JButton menu1_5 = new JButton(menu1_5_img);
	private JButton menu1_6 = new JButton(menu1_6_img);
	private JButton menu1_7 = new JButton(menu1_7_img);
	private JButton menu1_8 = new JButton(menu1_8_img);
	private JButton menu2_1 = new JButton(menu2_1_img);
	private JButton menu2_2 = new JButton(menu2_2_img);
	private JButton menu2_3 = new JButton(menu2_3_img);
	private JButton menu2_4 = new JButton(menu2_4_img);
	private JButton menu2_5 = new JButton(menu2_5_img);
	private JButton menu2_6 = new JButton(menu2_6_img);
	private JButton menu2_7 = new JButton(menu2_7_img);
	private JButton menu2_8 = new JButton(menu2_8_img);
	private JButton menu3_1 = new JButton(menu3_1_img);
	private JButton menu3_2 = new JButton(menu3_2_img);
	private JButton menu3_3 = new JButton(menu3_3_img);
	private JButton menu3_4 = new JButton(menu3_4_img);
	private JButton menu3_5 = new JButton(menu3_5_img);
	private JButton menu3_6 = new JButton(menu3_6_img);
	private JButton menu3_7 = new JButton(menu3_7_img);
	private JButton menu3_8 = new JButton(menu3_8_img);
	private JButton menu4_1 = new JButton(menu4_1_img);
	private JButton menu4_2 = new JButton(menu4_2_img);
	private JButton menu4_3 = new JButton(menu4_3_img);
	private JButton menu4_4 = new JButton(menu4_4_img);
	private JButton menu4_5 = new JButton(menu4_5_img);
	private JButton menu4_6 = new JButton(menu4_6_img);
	
	private JButton add = new JButton(add_img);
	private JButton check = new JButton(check_img);
	private JButton plus = new JButton(plus_img);
	private JButton minus = new JButton(minus_img);
	private JButton amount = new JButton(amount_img);
	private Font font;
	
	public String[] basket_temp= new String[4];
	
	private JButton menu_dummy = new JButton(); //메뉴 아래쪽
	int amount_i=0;

	public Kiosk() {
		
		String basket[][] = new String[10][]; //장바구니 배열 최대 10가지만 들어가게
		int i; // 주문내역번호용+배열용
		int sum; //결제금액
		
		
		JLabel amount_l = new JLabel();

		setUndecorated(true);
		setSize(Main.SCREEN_WIDHT, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		setBackground(new Color(0, 0, 0, 0));
		
		add(amount_l);
		amount_l.setBounds(280,863,68,60);
		font = new Font("맑은 고딕",Font.PLAIN, 30);
		amount_l.setVisible(true);
		amount_l.setFont(font);
		
		
		

		take_out_btn.setBounds(8, 773, 248, 176);
		take_out_btn.setContentAreaFilled(false);
		take_out_btn.setBorderPainted(false);
		take_out_btn.setFocusPainted(false);
		take_out_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				take_out_btn.setIcon(t_o_btn_click_img);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				take_out_btn.setIcon(t_o_btn_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				take_out_btn.setVisible(false);
				eat_in_btn.setVisible(false);
				hidden_exit.setVisible(false);
				coffee_ice.setVisible(true);
				coffee_hot.setVisible(true);
				beverage.setVisible(true);
				dessert.setVisible(true);
				back.setVisible(true);
				Background = new ImageIcon(Main.class.getResource("../img_src/Menu_Order.png")).getImage();
				basket_temp[0]="take_out";
			}

		});
		add(take_out_btn);
		eat_in_btn.setContentAreaFilled(false);
		eat_in_btn.setBorderPainted(false);
		eat_in_btn.setBounds(284, 773, 248, 176);
		eat_in_btn.setFocusPainted(false);
		eat_in_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				eat_in_btn.setIcon(e_i_btn_click_img);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				eat_in_btn.setIcon(e_i_btn_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				take_out_btn.setVisible(false);
				eat_in_btn.setVisible(false);
				hidden_exit.setVisible(false);
				coffee_ice.setVisible(true);
				coffee_hot.setVisible(true);
				beverage.setVisible(true);
				dessert.setVisible(true);
				back.setVisible(true);
				Background = new ImageIcon(Main.class.getResource("../img_src/Menu_Order.png")).getImage();
				basket_temp[0]="eat_in";
			}

		});
		add(eat_in_btn);

		hidden_exit.setBounds(0, 0, 50, 50);
		hidden_exit.setContentAreaFilled(false);
		hidden_exit.setBorderPainted(false);
		hidden_exit.setFocusPainted(false);
		hidden_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}

		});
		add(hidden_exit);

		// 메뉴선택부분 카테고리 버튼

		coffee_ice.setBounds(0, 0, 135, 60);
		coffee_ice.setContentAreaFilled(false);
		coffee_ice.setBorderPainted(false);
		coffee_ice.setFocusPainted(false);
		coffee_ice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				coffee_ice.setIcon(coffee_ice_border_img);
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				coffee_ice.setIcon(coffee_ice_click_img);
				coffee_hot.setIcon(coffee_hot_img);
				beverage.setIcon(beverage_img);
				dessert.setIcon(dessert_img);
				menu1_1.setVisible(true);
				menu1_2.setVisible(true);
				menu1_3.setVisible(true);
				menu1_4.setVisible(true);
				menu1_5.setVisible(true);
				menu1_6.setVisible(true);
				menu1_7.setVisible(true);
				menu1_8.setVisible(true);
				menu2_1.setVisible(false);
				menu2_2.setVisible(false);
				menu2_3.setVisible(false);
				menu2_4.setVisible(false);
				menu2_5.setVisible(false);
				menu2_6.setVisible(false);
				menu2_7.setVisible(false);
				menu2_8.setVisible(false);
				menu3_1.setVisible(false);
				menu3_2.setVisible(false);
				menu3_3.setVisible(false);
				menu3_4.setVisible(false);
				menu3_5.setVisible(false);
				menu3_6.setVisible(false);
				menu3_7.setVisible(false);
				menu3_8.setVisible(false);
				menu4_1.setVisible(false);
				menu4_2.setVisible(false);
				menu4_3.setVisible(false);
				menu4_4.setVisible(false);
				menu4_5.setVisible(false);
				menu4_6.setVisible(false);

			}

		});
		add(coffee_ice);
		coffee_ice.setVisible(false);

		coffee_hot.setBounds(135, 0, 135, 60);
		coffee_hot.setContentAreaFilled(false);
		coffee_hot.setBorderPainted(false);
		coffee_hot.setFocusPainted(false);
		coffee_hot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				coffee_hot.setIcon(coffee_hot_border_img);
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				coffee_ice.setIcon(coffee_ice_img);
				coffee_hot.setIcon(coffee_hot_click_img);
				beverage.setIcon(beverage_img);
				dessert.setIcon(dessert_img);
				menu1_1.setVisible(false);
				menu1_2.setVisible(false);
				menu1_3.setVisible(false);
				menu1_4.setVisible(false);
				menu1_5.setVisible(false);
				menu1_6.setVisible(false);
				menu1_7.setVisible(false);
				menu1_8.setVisible(false);
				menu2_1.setVisible(true);
				menu2_2.setVisible(true);
				menu2_3.setVisible(true);
				menu2_4.setVisible(true);
				menu2_5.setVisible(true);
				menu2_6.setVisible(true);
				menu2_7.setVisible(true);
				menu2_8.setVisible(true);
				menu3_1.setVisible(false);
				menu3_2.setVisible(false);
				menu3_3.setVisible(false);
				menu3_4.setVisible(false);
				menu3_5.setVisible(false);
				menu3_6.setVisible(false);
				menu3_7.setVisible(false);
				menu3_8.setVisible(false);
				menu4_1.setVisible(false);
				menu4_2.setVisible(false);
				menu4_3.setVisible(false);
				menu4_4.setVisible(false);
				menu4_5.setVisible(false);
				menu4_6.setVisible(false);
			}

		});
		add(coffee_hot);
		coffee_hot.setVisible(false);

		beverage.setBounds(270, 0, 135, 60);
		beverage.setContentAreaFilled(false);
		beverage.setBorderPainted(false);
		beverage.setFocusPainted(false);
		beverage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				beverage.setIcon(beverage_border_img);
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				coffee_ice.setIcon(coffee_ice_img);
				coffee_hot.setIcon(coffee_hot_img);
				beverage.setIcon(beverage_click_img);
				dessert.setIcon(dessert_img);
				menu1_1.setVisible(false);
				menu1_2.setVisible(false);
				menu1_3.setVisible(false);
				menu1_4.setVisible(false);
				menu1_5.setVisible(false);
				menu1_6.setVisible(false);
				menu1_7.setVisible(false);
				menu1_8.setVisible(false);
				menu2_1.setVisible(false);
				menu2_2.setVisible(false);
				menu2_3.setVisible(false);
				menu2_4.setVisible(false);
				menu2_5.setVisible(false);
				menu2_6.setVisible(false);
				menu2_7.setVisible(false);
				menu2_8.setVisible(false);
				menu3_1.setVisible(true);
				menu3_2.setVisible(true);
				menu3_3.setVisible(true);
				menu3_4.setVisible(true);
				menu3_5.setVisible(true);
				menu3_6.setVisible(true);
				menu3_7.setVisible(true);
				menu3_8.setVisible(true);
				menu4_1.setVisible(false);
				menu4_2.setVisible(false);
				menu4_3.setVisible(false);
				menu4_4.setVisible(false);
				menu4_5.setVisible(false);
				menu4_6.setVisible(false);
			}

		});
		add(beverage);
		beverage.setVisible(false);

		dessert.setBounds(405, 0, 135, 60);
		dessert.setContentAreaFilled(false);
		dessert.setBorderPainted(false);
		dessert.setFocusPainted(false);
		dessert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dessert.setIcon(dessert_border_img);
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				coffee_ice.setIcon(coffee_ice_img);
				coffee_hot.setIcon(coffee_hot_img);
				beverage.setIcon(beverage_img);
				dessert.setIcon(dessert_click_img);
				menu1_1.setVisible(false);
				menu1_2.setVisible(false);
				menu1_3.setVisible(false);
				menu1_4.setVisible(false);
				menu1_5.setVisible(false);
				menu1_6.setVisible(false);
				menu1_7.setVisible(false);
				menu1_8.setVisible(false);
				menu2_1.setVisible(false);
				menu2_2.setVisible(false);
				menu2_3.setVisible(false);
				menu2_4.setVisible(false);
				menu2_5.setVisible(false);
				menu2_6.setVisible(false);
				menu2_7.setVisible(false);
				menu2_8.setVisible(false);
				menu3_1.setVisible(false);
				menu3_2.setVisible(false);
				menu3_3.setVisible(false);
				menu3_4.setVisible(false);
				menu3_5.setVisible(false);
				menu3_6.setVisible(false);
				menu3_7.setVisible(false);
				menu3_8.setVisible(false);
				menu4_1.setVisible(true);
				menu4_2.setVisible(true);
				menu4_3.setVisible(true);
				menu4_4.setVisible(true);
				menu4_5.setVisible(true);
				menu4_6.setVisible(true);
			}

		});
		add(dessert);
		dessert.setVisible(false);

		back.setBounds(7, 775, 40, 40);
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				back.setIcon(back_border_img);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				back.setIcon(back_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				take_out_btn.setVisible(true);
				eat_in_btn.setVisible(true);
				hidden_exit.setVisible(true);
				coffee_ice.setVisible(false);
				coffee_hot.setVisible(false);
				beverage.setVisible(false);
				dessert.setVisible(false);
				back.setVisible(false);
				menu1_1.setVisible(false);
				menu1_2.setVisible(false);
				menu1_3.setVisible(false);
				menu1_4.setVisible(false);
				menu1_5.setVisible(false);
				menu1_6.setVisible(false);
				menu1_7.setVisible(false);
				menu1_8.setVisible(false);
				menu2_1.setVisible(false);
				menu2_2.setVisible(false);
				menu2_3.setVisible(false);
				menu2_4.setVisible(false);
				menu2_5.setVisible(false);
				menu2_6.setVisible(false);
				menu2_7.setVisible(false);
				menu2_8.setVisible(false);
				menu3_1.setVisible(false);
				menu3_2.setVisible(false);
				menu3_3.setVisible(false);
				menu3_4.setVisible(false);
				menu3_5.setVisible(false);
				menu3_6.setVisible(false);
				menu3_7.setVisible(false);
				menu3_8.setVisible(false);
				menu4_1.setVisible(false);
				menu4_2.setVisible(false);
				menu4_3.setVisible(false);
				menu4_4.setVisible(false);
				menu4_5.setVisible(false);
				menu4_6.setVisible(false);
				Background = new ImageIcon(Main.class.getResource("../img_src/Intro.png")).getImage();
			}

		});
		add(back);
		back.setVisible(false);
		
		plus.setBounds(348, 863, 60, 60);
		plus.setContentAreaFilled(false);
		plus.setBorderPainted(false);
		plus.setFocusPainted(false);
		plus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				plus.setIcon(plus_click_img);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				plus.setIcon(plus_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				if(amount_i<=8) {
					amount_i = amount_i+1;
					amount_l.setText(String.valueOf(amount_i));
				}
			}

		});
		add(plus);
		plus.setVisible(false);
		
		minus.setBounds(220, 863, 60, 60);
		minus.setContentAreaFilled(false);
		minus.setBorderPainted(false);
		minus.setFocusPainted(false);
		minus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				minus.setIcon(minus_click_img);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				minus.setIcon(minus_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				if(amount_i>0) {
					amount_i--;
					amount_l.setText(String.valueOf(amount_i));
				}
			}

		});
		add(minus);
		minus.setVisible(false);

		menu1_1.setBounds(10, 87, 115, 200);
		menu1_1.setContentAreaFilled(false);
		menu1_1.setBorderPainted(false);
		menu1_1.setFocusPainted(false);
		menu1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu1_1.setIcon(menu1_1_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu1_1.setIcon(menu1_1_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				plus.setVisible(true);
				minus.setVisible(true);
			}

		});
		add(menu1_1);
		menu1_1.setVisible(false);

		menu1_2.setBounds(145, 87, 115, 200);
		menu1_2.setContentAreaFilled(false);
		menu1_2.setBorderPainted(false);
		menu1_2.setFocusPainted(false);
		menu1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu1_2.setIcon(menu1_2_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu1_2.setIcon(menu1_2_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 카푸치노 이벤트
			}

		});
		add(menu1_2);
		menu1_2.setVisible(false);

		menu1_3.setBounds(280, 87, 115, 200);
		menu1_3.setContentAreaFilled(false);
		menu1_3.setBorderPainted(false);
		menu1_3.setFocusPainted(false);
		menu1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu1_3.setIcon(menu1_3_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu1_3.setIcon(menu1_3_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 카페모카 이벤트
			}

		});
		add(menu1_3);
		menu1_3.setVisible(false);

		menu1_4.setBounds(415, 87, 115, 200);
		menu1_4.setContentAreaFilled(false);
		menu1_4.setBorderPainted(false);
		menu1_4.setFocusPainted(false);
		menu1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu1_4.setIcon(menu1_4_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu1_4.setIcon(menu1_4_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 카라멜 마끼아또 이벤트
			}

		});
		add(menu1_4);
		menu1_4.setVisible(false);

		menu1_5.setBounds(10, 380, 115, 200);
		menu1_5.setContentAreaFilled(false);
		menu1_5.setBorderPainted(false);
		menu1_5.setFocusPainted(false);
		menu1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu1_5.setIcon(menu1_5_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu1_5.setIcon(menu1_5_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 초코 라떼 이벤트
			}

		});
		add(menu1_5);
		menu1_5.setVisible(false);

		menu1_6.setBounds(145, 380, 115, 200);
		menu1_6.setContentAreaFilled(false);
		menu1_6.setBorderPainted(false);
		menu1_6.setFocusPainted(false);
		menu1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu1_6.setIcon(menu1_6_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu1_6.setIcon(menu1_6_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 바닐라 라떼 이벤트
			}

		});
		add(menu1_6);
		menu1_6.setVisible(false);

		menu1_7.setBounds(280, 380, 115, 200);
		menu1_7.setContentAreaFilled(false);
		menu1_7.setBorderPainted(false);
		menu1_7.setFocusPainted(false);
		menu1_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu1_7.setIcon(menu1_7_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu1_7.setIcon(menu1_7_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 카페 라떼 이벤트
			}

		});
		add(menu1_7);
		menu1_7.setVisible(false);

		menu1_8.setBounds(415, 380, 115, 200);
		menu1_8.setContentAreaFilled(false);
		menu1_8.setBorderPainted(false);
		menu1_8.setFocusPainted(false);
		menu1_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu1_8.setIcon(menu1_8_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu1_8.setIcon(menu1_8_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 헤이즐넛 라떼 이벤트
			}

		});
		add(menu1_8);
		menu1_8.setVisible(false);

		menu2_1.setBounds(10, 87, 115, 200);
		menu2_1.setContentAreaFilled(false);
		menu2_1.setBorderPainted(false);
		menu2_1.setFocusPainted(false);
		menu2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu2_1.setIcon(menu2_1_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu2_1.setIcon(menu2_1_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫아메 이벤트
			}

		});
		add(menu2_1);
		menu2_1.setVisible(false);

		menu2_2.setBounds(145, 87, 115, 200);
		menu2_2.setContentAreaFilled(false);
		menu2_2.setBorderPainted(false);
		menu2_2.setFocusPainted(false);
		menu2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu2_2.setIcon(menu2_2_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu2_2.setIcon(menu2_2_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫카푸 이벤트
			}

		});
		add(menu2_2);
		menu2_2.setVisible(false);

		menu2_3.setBounds(280, 87, 115, 200);
		menu2_3.setContentAreaFilled(false);
		menu2_3.setBorderPainted(false);
		menu2_3.setFocusPainted(false);
		menu2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu2_3.setIcon(menu2_3_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu2_3.setIcon(menu2_3_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫모카 이벤트
			}

		});
		add(menu2_3);
		menu2_3.setVisible(false);

		menu2_4.setBounds(415, 87, 115, 200);
		menu2_4.setContentAreaFilled(false);
		menu2_4.setBorderPainted(false);
		menu2_4.setFocusPainted(false);
		menu2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu2_4.setIcon(menu2_4_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu2_4.setIcon(menu2_4_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫카라멜 이벤트
			}

		});
		add(menu2_4);
		menu2_4.setVisible(false);
		
		menu2_5.setBounds(10, 380, 115, 200);
		menu2_5.setContentAreaFilled(false);
		menu2_5.setBorderPainted(false);
		menu2_5.setFocusPainted(false);
		menu2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu2_5.setIcon(menu2_5_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu2_5.setIcon(menu2_5_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu2_5);
		menu2_5.setVisible(false);
		
		menu2_6.setBounds(145, 380, 115, 200);
		menu2_6.setContentAreaFilled(false);
		menu2_6.setBorderPainted(false);
		menu2_6.setFocusPainted(false);
		menu2_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu2_6.setIcon(menu2_6_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu2_6.setIcon(menu2_6_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu2_6);
		menu2_6.setVisible(false);
		
		menu2_7.setBounds(280, 380, 115, 200);
		menu2_7.setContentAreaFilled(false);
		menu2_7.setBorderPainted(false);
		menu2_7.setFocusPainted(false);
		menu2_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu2_7.setIcon(menu2_7_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu2_7.setIcon(menu2_7_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu2_7);
		menu2_7.setVisible(false);
		
		menu2_8.setBounds(415, 380, 115, 200);
		menu2_8.setContentAreaFilled(false);
		menu2_8.setBorderPainted(false);
		menu2_8.setFocusPainted(false);
		menu2_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu2_8.setIcon(menu2_8_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu2_8.setIcon(menu2_8_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu2_8);
		menu2_8.setVisible(false);
		
		menu3_1.setBounds(10, 87, 115, 200);
		menu3_1.setContentAreaFilled(false);
		menu3_1.setBorderPainted(false);
		menu3_1.setFocusPainted(false);
		menu3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu3_1.setIcon(menu3_1_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu3_1.setIcon(menu3_1_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu3_1);
		menu3_1.setVisible(false);
		
		menu3_2.setBounds(145, 87, 115, 200);
		menu3_2.setContentAreaFilled(false);
		menu3_2.setBorderPainted(false);
		menu3_2.setFocusPainted(false);
		menu3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu3_2.setIcon(menu3_2_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu3_2.setIcon(menu3_2_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu3_2);
		menu3_2.setVisible(false);
		
		menu3_3.setBounds(280, 87, 115, 200);
		menu3_3.setContentAreaFilled(false);
		menu3_3.setBorderPainted(false);
		menu3_3.setFocusPainted(false);
		menu3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu3_3.setIcon(menu3_3_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu3_3.setIcon(menu3_3_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu3_3);
		menu3_3.setVisible(false);
		
		menu3_4.setBounds(415, 87, 115, 200);
		menu3_4.setContentAreaFilled(false);
		menu3_4.setBorderPainted(false);
		menu3_4.setFocusPainted(false);
		menu3_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu3_4.setIcon(menu3_4_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu3_4.setIcon(menu3_4_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu3_4);
		menu3_4.setVisible(false);
		
		menu3_5.setBounds(10, 380, 115, 200);
		menu3_5.setContentAreaFilled(false);
		menu3_5.setBorderPainted(false);
		menu3_5.setFocusPainted(false);
		menu3_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu3_5.setIcon(menu3_5_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu3_5.setIcon(menu3_5_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu3_5);
		menu3_5.setVisible(false);
		
		menu3_6.setBounds(145, 380, 115, 200);
		menu3_6.setContentAreaFilled(false);
		menu3_6.setBorderPainted(false);
		menu3_6.setFocusPainted(false);
		menu3_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu3_6.setIcon(menu3_6_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu3_6.setIcon(menu3_6_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu3_6);
		menu3_6.setVisible(false);
		
		menu3_7.setBounds(280, 380, 115, 200);
		menu3_7.setContentAreaFilled(false);
		menu3_7.setBorderPainted(false);
		menu3_7.setFocusPainted(false);
		menu3_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu3_7.setIcon(menu3_7_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu3_7.setIcon(menu3_7_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu3_7);
		menu3_7.setVisible(false);
		
		menu3_8.setBounds(415, 380, 115, 200);
		menu3_8.setContentAreaFilled(false);
		menu3_8.setBorderPainted(false);
		menu3_8.setFocusPainted(false);
		menu3_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu3_8.setIcon(menu3_8_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu3_8.setIcon(menu3_8_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu3_8);
		menu3_8.setVisible(false);
		
		menu4_1.setBounds(10, 87, 115, 200);
		menu4_1.setContentAreaFilled(false);
		menu4_1.setBorderPainted(false);
		menu4_1.setFocusPainted(false);
		menu4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu4_1.setIcon(menu4_1_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu4_1.setIcon(menu4_1_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu4_1);
		menu4_1.setVisible(false);
		
		menu4_2.setBounds(145, 87, 115, 200);
		menu4_2.setContentAreaFilled(false);
		menu4_2.setBorderPainted(false);
		menu4_2.setFocusPainted(false);
		menu4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu4_2.setIcon(menu4_2_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu4_2.setIcon(menu4_2_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu4_2);
		menu4_2.setVisible(false);
		
		menu4_3.setBounds(280, 87, 115, 200);
		menu4_3.setContentAreaFilled(false);
		menu4_3.setBorderPainted(false);
		menu4_3.setFocusPainted(false);
		menu4_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu4_3.setIcon(menu4_3_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu4_3.setIcon(menu4_3_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu4_3);
		menu4_3.setVisible(false);
		
		menu4_4.setBounds(415, 87, 115, 200);
		menu4_4.setContentAreaFilled(false);
		menu4_4.setBorderPainted(false);
		menu4_4.setFocusPainted(false);
		menu4_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu4_4.setIcon(menu4_4_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu4_4.setIcon(menu4_4_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu4_4);
		menu4_4.setVisible(false);
		
		menu4_5.setBounds(10, 380, 115, 200);
		menu4_5.setContentAreaFilled(false);
		menu4_5.setBorderPainted(false);
		menu4_5.setFocusPainted(false);
		menu4_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu4_5.setIcon(menu4_5_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu4_5.setIcon(menu4_5_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu4_5);
		menu4_5.setVisible(false);
		
		menu4_6.setBounds(145, 380, 115, 200);
		menu4_6.setContentAreaFilled(false);
		menu4_6.setBorderPainted(false);
		menu4_6.setFocusPainted(false);
		menu4_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menu4_6.setIcon(menu4_6_img_border);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menu4_6.setIcon(menu4_6_img);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 핫초코 이벤트
			}

		});
		add(menu4_6);
		menu4_6.setVisible(false);



	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(Background, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}

}
