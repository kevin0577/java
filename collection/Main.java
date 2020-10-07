import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		}
		Iterator<Integer> it = points.iterator();
		while (it.hasNext()) {
			Integer e = it.next();
			System.out.println(e);
		}

		Set<String> colors = new TreeSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		for (String s : colors) {
			System.out.print(s + ",");
		}
		System.out.println("色は" + colors.size() + "種類");

		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 1000);
		prefs.put("東京都", 3000);
		prefs.put("熊本県", 2000);
		int tokyo = prefs.get("東京都");
		System.out.println("東京の人口は" + tokyo);
		prefs.put("熊本県", 2001);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本の人口は" + kumamoto);
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + value);
		}
	}
}