public class Hero extends Human {
	private String name;

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
			("名前がnillである。処理を中断。");
		}

		if (name.length() <= 1) {
			throw new IllegalArgumentException
			("名前が短すぎる。処理を中断。");
		}

		if (name.length() >= 8) {
			throw new IllegalArgumentException
			("名前が長すぎる。処理を中断。");
		}

		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public Hero() {
		super(100);
	}

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
	}

}