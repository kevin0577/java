public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		Wizard w = new Wizard();
		Wand wa = new Wand();

		h.setName("ミナト1");
		h.setHp(100);
		w.setName("あああああ");
		w.setHp(100);
		w.setMp(50);
		wa.setName("あああああ");
		wa.setPower(20);
		w.heal(h);
	}
}