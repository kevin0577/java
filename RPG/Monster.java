public class Monster {
	String name;
	int hp;

	public void attack(Hero h, int a) {
		h.hp -= a;
		System.out.println(this.name + "は、" + h.name + "に" + a + "のダメージを与えた！");
	}
}