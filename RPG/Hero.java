public class Hero {
	String name;
	int hp;
	Sword sword;

	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}

	public void attack(Monster m, Sword s) {
			m.hp -= s.damage;
			System.out.println(this.name + "は、" + m.name + "に" + s.name + "で" + s.damage + "のダメージを与えた！");
	}

	public void victory(Monster m) {
		if (m.hp == 0) {
			System.out.println(m.name + "を倒した！");
		} else {
			System.out.println(m.name + "は、逃げ出した");
		}
	}

	public void hp() {
			System.out.println(this.name + "の現在のHPは" + this.hp + "です");
	}
}