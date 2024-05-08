package theGame;

public class ArenaClass {
	static String result="";
//Instance of Player class for PlayerA and PlayerB
		private static  PlayerClass playerA;
	    private static  PlayerClass playerB;
	    
//Instance of Dice class for Attacking Dice and Defending Dice
	    
	    private DiceClass attackingDice;
	    private DiceClass defendingDice;
	    
//Game class constructor with parameters ==> Player A and B with Dice instance
	    public ArenaClass(PlayerClass playerA, PlayerClass playerB) {
	        this.playerA = playerA;
	        this.playerB = playerB;
	        this.attackingDice = new DiceClass();
	        this.defendingDice = new DiceClass();
	    }
	    
//Starting Function of the game 
	    public void play() throws InterruptedException {

	        System.out.print("\t\tThe Game Starts...in ");
	        for(int i=1;i<=3;i++)
	        {
	        	System.out.print(i+"  ");
	        	Thread.sleep(1000);
	        }
	        System.out.println("\n******************************************************************");
	        System.out.println("\n\n");

	        
//Looping the game to find the Winner
	        
	        //Loop Start
	        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
	        	
                
	        	//Who is Attacker ==> By Comparing Who has Less Health
		    	System.out.println("\t\tFound the Attacker...");
		        PlayerClass attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
		        System.out.println("\n\t\t\t"+attacker.getName()+" is the Attacker\n");
		        
                //Who is Defender ==> By getting the attacker from above line we can know the defender
		        System.out.println("\t\tFound the Defender...");
		        PlayerClass defender = attacker == playerA ? playerB : playerA;
		        System.out.println("\n\t\t\t"+defender.getName()+" is the Defender");

                //Attackers Dice roll
	            int attackRoll = attacker.rollDice();
	            System.out.println("\n\t\tRolling the Attacker Dice...");
	            Thread.sleep(1300);
	            System.out.println("\t\t\tNo ==> "+attackRoll);

	            
                //Defenders Dice roll
	            int defenseRoll = defender.rollDice();
	            System.out.println("\n\t\tRolling the Defender Dice...");
	            Thread.sleep(1300);
	            System.out.println("\t\t\tNo ==> "+defenseRoll);
	            
                //Calculating Attack damage Dice*Attack
	            int attackDamage = attackRoll * attacker.getAttack();
	            
                //Calculating Defense damage Dice*Strength
	            int defenseDamage = defenseRoll * defender.getStrength();
	            
                //Calculating the Total damage 
	            int actualDamage = Math.max(attackDamage - defenseDamage, 0);
	            System.out.println("\n\t\tCalculating the Damage...");
	            Thread.sleep(1300);
	            System.out.println("\t\t\tDAMAGE==> -" +actualDamage+"\n");
	            
                //Deduction of Total damage from Health
	            defender.reduceHealth(actualDamage);
	            System.out.print("  Player "+attacker.getName()+" Health : "+attacker.getHealth()+"\t\t"+"Player "+defender.getName()+" Health : "+defender.getHealth()+"\n\n");
	            System.out.println("******************************************************************\n\n");
	            Thread.sleep(1300);
	            
                // Switch roles for next turn
	            PlayerClass temp = attacker;
	            attacker = defender;
	            defender = temp;
	        }//Loop End
	        
//Finding the Health of both players who's Health is 0
	        
	        if (playerA.getHealth() <= 0) {
	        	result="Player B wins!";
	            System.out.println("\t\t\tPlayer B wins!");
	        } 
	        else 
	        {
	        	result="Player A wins!";
	            System.out.println("\t\t\tPlayer A wins!");
	        }
	    }
	    
//Getter and Setter methods for Dice
	    
		public DiceClass getAttackingDice() {
			return attackingDice;
		}

		public void setAttackingDice(DiceClass attackingDice) {
			this.attackingDice = attackingDice;
		}

		public DiceClass getDefendingDice() {
			return defendingDice;
		}

		public void setDefendingDice(DiceClass defendingDice) {
			this.defendingDice = defendingDice;
		}

		public Object getResult() {
			
			return result;
		}

}
