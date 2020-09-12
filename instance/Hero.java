public class Hero {
	String name;
	int hp;
	Sword sword;

	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}

	public void slip(int s) {
		this.hp -= s;
		System.out.println(this.name + "は、転んだ！");
		System.out.println(s + "のダメージ");
	}

	public void attack(Matango m1) {
		System.out.println(this.name  + "は攻撃した！");
		m1.hp -= 10;
		System.out.println("敵に10のダメージを与えた！");
	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
	}

	public void victory() {
		System.out.println("最終HPは" + this.hp + "でした");
		System.out.println("戦闘に勝利しました！");
	}
}