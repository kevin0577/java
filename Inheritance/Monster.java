public class Monster extends BattleCreature {
	public Monster() {
		super("スライム", 10);
	}

	public void run() {
		System.out.println(this.name + "は逃げた");
	}
}