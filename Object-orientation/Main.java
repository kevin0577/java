public class Main {
	public static void main(String[] args) {
		Hero h = new Hero("ミナト", 100);
		Dancer d = new Dancer();
		Matango m = new Matango();
		System.out.println("勇者" + h.name + "を生み出した");
		d.run();
		d.attack(m);
		m.run();
		d.dance();
		h.sleep();
		h.sit(5);
	}
}