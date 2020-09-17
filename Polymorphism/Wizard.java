public class Wizard implements Character {
	String name;
	int hp;

	public Wizard(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void run() {
		System.out.println(this.name + "は逃げた");
	}

}