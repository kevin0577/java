public class Main {
	public static void main(String[] args) {
		Character[] c = new Character[5];
		c[0] = new SuperHero();
		c[1] = new SuperHero();
		c[2] = new Thief("c", 100);
		c[3] = new Wizard("d", 100);
		c[4] = new Wizard("e", 100);

		for (Character ch : c) {
			ch.run();
		}
	}
}