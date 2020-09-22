public class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}

	public double getPower() {
		return this.power;
	}

	public void setName(String name) {
		if (name.length() > 3) {
			throw new IllegalArgumentException
			("3文字以上入力してください");
		}
		this.name = name;
	}

	public void setPower(double power) {
		if (power < 0.5 || power > 100) {
			throw new IllegalArgumentException
			("数値が以上です");
		}
		this.power = power;
	}

}