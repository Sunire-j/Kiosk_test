package ex1;

public class Main {

	// 해상도설정
	public static final int SCREEN_WIDHT = 540;
	public static final int SCREEN_HEIGHT = 960;
	// 가격설정
	public static final int AMERICANO = 2000;
	public static final int CAFELATTE = 2500;
	public static final int CAPPUCCINO = 3000;
	public static final int CARAMEL_MACCHIATO = 3000;
	public static final int CAFE_MOCA = 3000;
	public static final int ANOTHER_LATTE = 3500; // 초코,헤이즐넛,바닐라
	public static final int ALL_ADE = 3700; // beverage
	public static final int ALL_SMOOTHIE = 4000; // 딸기, 망고, 블루베리, 망고애플 beverage
	public static final int ALL_SHAKE = 4300; // 바닐라 초코 블루베리 딸기 망고 beverage
	public static final int DESSERT_1 = 2500;// 쿠키, 마카롱, 머핀
	public static final int DESSERT_2 = 3000;// 베이클 와플 조각케익

	public static void main(String[] args) {

		new Kiosk();
		new Admin_kiosk();

	}

}
