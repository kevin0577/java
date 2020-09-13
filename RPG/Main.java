public class Main {
	public static void main(String[] args) {
		Sword s = new Sword("剣");

		Hero h = new Hero("ミナト");
		h.sword = s;

		Monster m = new Monster("スライム");

		System.out.println(h.name + "の前に" + m.name + "が、現れた！");
		for (int i = 0; i < 3; i++) {
				m.attack(h, 5);
				h.attack(m, s);
			}
		h.victory(m);
		h.hp();
	}
}