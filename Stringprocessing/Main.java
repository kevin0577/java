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
	}
}