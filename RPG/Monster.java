public class Monster {
	String name;
	int hp;

	public Monster(String name, int hp) {
		this.name = name;
		this.hp =hp;
	}

	public void attack(Hero h, int a) {
		h.hp -= a;
		System.out.println(this.name + "は、" + h.name + "に" + a + "のダメージを与えた！");
	}
}