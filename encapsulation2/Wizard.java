public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public int getHp() {
		return this.hp;
	}

	public int getMp() {
		return this.mp;
	}

	public String getName() {
		return this.name;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp =hp;
		}
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException
			("MPの数値が以上です");
		}
		this.mp = mp;
	}

	public void setName(String name) {
		if (name.length() > 3) {
			throw new IllegalArgumentException
			("3文字以上入力してください");
		}
		this.name = name;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException
			("杖を装備していません");
		}
		this.wand = wand;
	}


	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
}