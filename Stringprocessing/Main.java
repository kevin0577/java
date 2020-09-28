import java.util.Date;
import java.util.Calendar;
import java.time.*;
import java.time.format.*;

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


		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1601295702320L);
		System.out.println(past);


		Calendar c = Calendar.getInstance();
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");


		Instant i1 = Instant.now();
		System.out.println(i1);

		ZonedDateTime z1 = ZonedDateTime.now();
		System.out.println(z1);

		LocalDateTime l1 = LocalDateTime.now();
		System.out.println(l1);


		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2020/09/22", fmt);

		// １０００日後を計算する
		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);

		// 現在日時との比較
		LocalDate now2 = LocalDate.now();
		if (now2.isAfter(ldate)) {
			System.out.println("1000日後は過去日付です");
		}
	}
}




























