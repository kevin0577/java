public class Slime extends Monster {
	private String name = "スライム";

	public Slime() {
		super(50);
	}

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
	}

}