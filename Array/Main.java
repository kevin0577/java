public class Main {
	public static void main(String[] args) {
		int[] scores = new int[5];
		scores[1] = 30;
		System.out.println(scores[1]);

		int[] moneyList = {121902, 8302, 55100};
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for (int m : moneyList) {
			System.out.println(m);
		}

		System.out.println("数あてクイズ");
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int a : numbers) {
			if (input == a) {
				System.out.println("アタリ！");
			}
		}
	}
}

