public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		Monster m = new Slime();

		h.setName("");
		System.out.println(h.hp + h.getName());
		h.attack();
		m.attack();
	}
}