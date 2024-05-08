package testGame;
import theGame.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArenaTest {

//This test Checks if the game ends when a player's health reaches zero
	@Test
	public void testGameEndsWhenPlayerHealthReachesZero() throws InterruptedException {
		PlayerClass playerA = new PlayerClass('A',50, 5, 10);
        PlayerClass playerB = new PlayerClass('B',100, 10, 5);
        ArenaClass game = new ArenaClass(playerA, playerB);

        game.play();

        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
	}

//This test verifies the result of the game when Player A has lower health initially.
	@Test
    public void testGameResultWhenPlayerAHasLowerHealth() throws InterruptedException {
        PlayerClass playerA = new PlayerClass('A',10, 5, 10);
        PlayerClass playerB = new PlayerClass('B',100, 10, 5);
        ArenaClass game = new ArenaClass(playerA, playerB);

        game.play();

        assertEquals("Player B wins!", game.getResult());
    }

}
