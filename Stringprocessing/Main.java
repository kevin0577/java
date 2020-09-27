public class Main {
	public static void main(String[] args) {
		String s1 = "java and javaScript";

		if (s1.contains("java")) {
			System.out.println("文字列s1は、javaを含んでいます");
		}

		if (s1.endsWith("java")) {
			System.out.println("文字列s1は、javaが末尾にあります");
		}

		System.out.println("文字列s1で最初にjavaが登場する位置は" + s1.indexOf("java"));
		System.out.println("文字列s1で最後にjavaが登場する位置は" + s1.lastIndexOf("java"));

		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		System.out.println("文字列s1の4~8文字目は" + s1.substring(3, 8));

		System.out.println("大文字を小文字に変換" + s1.toLowerCase());


		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10; i++) {
			sb.append("java");
		}
		String s = sb.toString();
		System.out.println(s);


		String abc = "abc,def:ghi";

		String[] words = abc.split("[,:]");
		for (String w : words) {
			System.out.print(w + "->");
		}

		String w1 = abc.replaceAll("[beh]", "x");
		System.out.println(w1);

		System.out.printf("製品番号%s-%02d" , "SUV" , 3);
	}
}