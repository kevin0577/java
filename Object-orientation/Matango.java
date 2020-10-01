public class Matango extends Character {
	public Matango() {
		super("キノコ", 50);
	}
	public void attack(Matango m) {
		m.hp -= 5;
	}
}