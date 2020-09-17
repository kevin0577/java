public class Thief implements Character {
	String name;
	int hp;

	public Thief(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void run() {
		System.out.println(this.name + "は逃げた");
	}

}