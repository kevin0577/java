public class Main {
	public static void main(String[] args) {
		email("aaa", "s@s.s", "ddddd");
		double triangle = calctrianglearea(10.0, 5.0);
		double circle = calccirclearea(5.0);
		System.out.println("三角形の面積:" + triangle);
		System.out.println("円の面積:" + circle);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールが送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

	public static double calctrianglearea(double x, double y) {
		double a = (x * y) / 2;
		return a;
	}

	public static double calccirclearea(double radius) {
		double b = (radius * radius * 3.14);
		return b;
	}
}