package theGame;
import java.util.Random;

public class PlayerClass {
	
//Declaration of Attributes	
    char name;
	private int health;
    private int strength;
    private int attack;
    private Random random;

//Constructor Call with Parameters
    
    public PlayerClass(char name,int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.name=name;
        this.random = new Random();
    }
    
//Getter methods
    
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }
    
//Dies rolling function
    
    public int rollDice() {
        // a 6-sided die
        return random.nextInt(6) + 1;
    }

//Reducing the health of the player by Damage acquired

    public void reduceHealth(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

	public char getName() {
		return name;
	}

}
