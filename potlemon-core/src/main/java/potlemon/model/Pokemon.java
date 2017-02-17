package potlemon.model;

import java.util.List;

public class Pokemon {
	
	private String name;
	private int hp;//hp at this moment
	private int hpMax;//maximum hp when the pokemon is full life
	private int level;
	private int defense;
	private Type type; //enum
	private List<Attack> attacks;

	public Pokemon() {
		
	}
	
	public Pokemon(int pv) {
		this.hpMax = pv;
		this.hp = pv;
	}
	

	public Pokemon(String name, int hpMax, int defense,int level, Type type, List<Attack> attacks) {
		this.name = name;
		this.hpMax = hpMax;
		this.defense = defense;
		this.level = level;
		this.type = type;
		this.hp = hpMax;
		this.attacks = attacks;
	}

	/**
	 * Remove the amount of pv in parameter
	 * @param lost
	 */
	public void lostPV(int lost) {
		hp -= lost;
	}
	
	/**
	 * Remove the amount of pv in parameter
	 * @param lost
	 */
	public void addPV(int gain) {
		hp += gain;
	}

	public void heal(){
		this.hp = this.hpMax;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHpMax() {
		return hpMax;
	}

	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public List<Attack> getAttacks() {
		return attacks;
	}
	
	public void setAttacks(Attack attack) {
		this.attacks.add(attack);
	}
}