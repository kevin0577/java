public class SuperHero extends Hero {
	public SuperHero() {
		super("ミナト", 120);
	}

	boolean flying = true;

	public void fly() {
		if (this.flying == true) {
			System.out.println("飛び上がった！");
		} else {
			System.out.println("着地した！");
		}
	}

	public void attack(Monster m1, Sword s1) {
		m1.hp -= s1.damage;
			System.out.println(this.name + "は、" + m1.name + "に" + s1.name + "で" + s1.damage + "のダメージを与えた！");
		if (this.flying == true) {
			m1.hp -= s1.damage;
			System.out.println(this.name + "は、" + m1.name + "に" + s1.name + "で2回目のした！");
			System.out.println(s1.damage + "のダメージを与えた！");
		}
	}
}