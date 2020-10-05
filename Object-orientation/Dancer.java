public class Dancer extends Character {
	public Dancer() {
		super("アスカ", 100);
	}
	public void run() {
		System.out.println(this.name + "サササっと逃げ出した");
	}
	public void dance() {
		System.out.println(this.name + "は踊った");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃 3ポイント減った");
		System.out.println(m.hp -= 3);
	}
}