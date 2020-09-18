public class Hero extends Human {
	private String name = "ミナト";

	public Hero() {
		super(100);
	}

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
	}

}