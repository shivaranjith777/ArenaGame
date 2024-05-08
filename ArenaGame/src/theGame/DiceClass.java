package theGame;
import java.util.Random;

public class DiceClass {
//Instance of Random Class
	private Random random;

//Constructor
    public DiceClass() {
        this.random = new Random();
    }

//Function to Get a random number from 1 to 6
    public int roll() {
        // 6-sided die
        return random.nextInt(6) + 1;
    }
}
