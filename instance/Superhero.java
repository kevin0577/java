public class Superhero extends Hero {
	public Superhero() {
		super("ミナト");
	}

	boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	public void run() {
		System.out.println(this.name + "は撤退した");
	}

	public void attack(Matango m1) {
		System.out.println(this.name + "の攻撃");
		super.attack(m1);
		System.out.println("10ポイントのダメージを与えた！");
		if (this.flying) {
			System.out.println(this.name + "の攻撃");
			super.attack(m1);
			System.out.println("さらに10ポイントのダメージを与えた！");
		}
	}
}