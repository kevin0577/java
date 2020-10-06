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
	}
}