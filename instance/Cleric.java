public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfaid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println(this.name + "は、セルフエイドを唱えた");
		System.out.println("HPを最大まで回復しました");
	}

	public void pray(int p) {
		System.out.println(this.name + "は" + p + "秒間天に祈った！");
		int recover = new java.util.Random().nextInt(3) + p;
		int recoveractual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoveractual;
		System.out.println("MPが" + recoveractual + "回復した");
		System.out.println("最終MPは" + this.mp + "でした");
	}

	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(this.name + "はヒールを唱えた！");
		System.out.println(h.name + "のHPを10回復した！");
	}
}