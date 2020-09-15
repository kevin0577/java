public abstract class BattleCreature implements Creature {
	String name;
	int hp;

	public BattleCreature(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

}