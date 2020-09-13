public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;

		Monster m = new Monster();
		m.name = "スライム";
		m.hp = 30;

		System.out.println(h.name + "の前に" + m.name + "が、現れた！");
		for (int i = 0; i < 3; i++) {
		m.attack(h, 5);
		h.attack(m, 10);
		h.victory(m);
		}
	}
}