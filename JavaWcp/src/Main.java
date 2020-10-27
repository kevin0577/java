
public class Main {
	public static void main(String[] args) {
		int num1 = 10;
		String str1 = "こんにちは";
		System.out.println(num1);
		System.out.println(str1);

		num1 = 20;
		System.out.println(num1);
		int num2 = 30;
		System.out.println(num2);

		String s = "あいう";
		System.out.println(s + "の文字数：" + s.length());
		s = "";
		System.out.println(s + "の文字数：" + s.length());
		s = null;
		System.out.println(s + "の文字数：" + s.length());

		int[] array = {10, 20, 30};
		System.out.println(array[1]);
	}
}