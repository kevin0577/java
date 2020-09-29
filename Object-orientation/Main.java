public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出した");
		h.sleep();
		h.sit(5);
	}
}