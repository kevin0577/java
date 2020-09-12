public class PoisonMatango extends Matango {
	int poison = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		System.out.println("毒キノコは攻撃した！");
		h.hp -= 5;
		System.out.println("敵に5のダメージを与えた！");
		if (this.poison != 0) {
			this.poison -= 1;
			System.out.println("さらに毒の胞子をばら撒いた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "のダメージ");
			System.out.println("毒攻撃の残り回数は" + poison);
		}
	}
}