public class Main {
	public static void main(String[] args) {
		Sword s = new Sword("剣", 10);

		Sword s1 = new Sword("炎の剣", 20);

		Hero h = new Hero("ミナト", 100);
		h.sword = s;

		SuperHero sh = new SuperHero();
		h.sword = s1;

		Monster m = new Monster("スライムA", 20);

		Monster m1 = new Monster("スライムB", 40);

		System.out.println(h.name + "の前に" + m.name + "が、現れた！");
		System.out.println(h.name + "のHPは" + h.hp + "です");
		System.out.println(m.name + "のHPは" + m.hp + "です");
		for (int i = 0; i < 3; i++) {
			if (m.hp != 0) {
				m.attack(h, 5);
				h.attack(m, s);
			}
		}
		h.victory(m);
		h.hp();

		System.out.println(sh.name + "がスーパーヒーローに進化した！");
		System.out.println(sh.name + "のHPは" + sh.hp + "です");
		System.out.println(m1.name + "のHPは" + m1.hp + "です");

		sh.fly();
		for (int i = 0; i < 3; i++) {
			if (m1.hp != 0) {
				m1.attack(sh, 10);
				sh.attack(m1, s1);
			}
		}
		if (m1.hp == 0) {
			System.out.println(m1.name + "を倒した！");
		} else {
			System.out.println(m1.name + "は、逃げ出した");
		}
		sh.hp();
	}
}