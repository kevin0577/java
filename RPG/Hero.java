public class Hero {
	String name;
	int hp;

	public void attack(Monster m, int a) {
			m.hp -= a;
			System.out.println(this.name + "は、" + m.name + "に" + a + "のダメージを与えた！");
	}

	public void victory(Monster m) {
		if (m.hp == 0) {
			System.out.println(m.name + "を倒した！");
			System.out.println(this.name + "の現在のHPは" + this.hp + "です");
		}
	}
}