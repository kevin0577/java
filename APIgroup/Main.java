public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;
		Hero.setRandomMoney();
		if (h.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
		System.out.println(h.toString());
		System.out.println(Hero.money);
	}
}