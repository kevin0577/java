public class SuperHero extends Hero {
	public SuperHero() {
		super("ミナト", 100);
	}

	public void run() {
		System.out.println(this.name + "は逃げた");
	}
}