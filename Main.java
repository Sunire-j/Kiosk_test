package ex1;

public class Main {

	// �ػ󵵼���
	public static final int SCREEN_WIDHT = 540;
	public static final int SCREEN_HEIGHT = 960;
	// ���ݼ���
	public static final int AMERICANO = 2000;
	public static final int CAFELATTE = 2500;
	public static final int CAPPUCCINO = 3000;
	public static final int CARAMEL_MACCHIATO = 3000;
	public static final int CAFE_MOCA = 3000;
	public static final int ANOTHER_LATTE = 3500; // ����,�������,�ٴҶ�
	public static final int ALL_ADE = 3700; // beverage
	public static final int ALL_SMOOTHIE = 4000; // ����, ����, ��纣��, ������� beverage
	public static final int ALL_SHAKE = 4300; // �ٴҶ� ���� ��纣�� ���� ���� beverage
	public static final int DESSERT_1 = 2500;// ��Ű, ��ī��, ����
	public static final int DESSERT_2 = 3000;// ����Ŭ ���� ��������

	public static void main(String[] args) {

		new Kiosk();
		new Admin_kiosk();

	}

}
