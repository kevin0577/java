public class Main {
	public static void main (String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Hero h = new Hero("ミナト");
		h.sword = s;

		Superhero sh = new Superhero();

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 40;
		m2.suffix = 'B';

		Cleric c = new Cleric();
		c.name = "アスカ";

		System.out.println("勇者" + h.name + "を生み出した");
		System.out.println("現在の武器は" + h.sword.name);
		System.out.println("聖職者" + c.name + "を生み出した");
		c.selfaid();
		c.pray(1);
		h.sit(5);
		h.slip(50);
		h.sit(25);
		c.heal(h);
		h.attack(10);
		m1.run();
		m2.run();
		h.run();
		sh.run();
	}
}