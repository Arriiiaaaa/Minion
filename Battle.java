import java.util.ArrayList;         //import array list class
/**
 * Write a description of class Cattery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    //make 2 sides
    private ArrayList<Minion> Player1 = new ArrayList<Minion>();
    private ArrayList<Minion> Player2 = new ArrayList<Minion>();
    
    private final int MAXNUMMINIONS = 7;
    
    String[] p1names = new String[] {"Rainbow Dash", "Fluttershy", "Pinky Pie", "Twilight Sparkle", "Princess Celestia", "Apple Jack", "Princess Luna"};
    String[] p2names = new String[] {"Greed", "Lust", "Pride", "Gluttony", "Wrath", "Sloth", "Envy"};
    
    private final int MAXHP = 30;
    private final int MINHP = 1;
    private final int MAXAT = 30;
    private final int MINAT = 1;
    
    private int attack = 0;
    private int health = 0;
    
    /**
     * constructor for obects of class cattery
     */
    public Battle()
    {
        //populate on creation
        this.populatePlayer1();
        this.populatePlayer2();
    }
    
    /**
     * Fills in Player 1 Team
     */
    public void populatePlayer1() {
        for (int idx=0; idx < MAXNUMMINIONS; idx++) {
            Player1.add(new Minion(p1names[idx++], (int) (MINAT + Math.random() * MAXAT), (int) (MINHP + Math.random() * MAXHP)));
        }
    }
    
    public void populatePlayer2() {
        for (int idx=0; idx < MAXNUMMINIONS; idx++) {
            Player2.add(new Minion(p1names[idx++], (int) (MINAT + Math.random() * MAXAT), (int) (MINHP + Math.random() * MAXHP)));
        }
    }
    
    public void fight() {
        // chosiosing attack and defender randomly
        Minion attacker, defender;
        // need to set inside a var. Doesn't work otherwise
        int attackerIdx = 0;
        int defenderIdx = 0;
        
        attacker = Player1.get(attackerIdx);
        defender = Player2.get(defenderIdx);
        
        // get attack and deal to enemy
        int attackAmt = attacker.getAttack();
        
        defender.takeDamage(attackAmt); // Deal attack
        
        // Defender attack back
        attacker.takeDamage(defender.getAttack());
        
        System.out.println(attacker.getName() + " deals " + attackAmt);
        System.out.println(defender.getName() + " has " + defender.getlife());
        System.out.println(attacker.getName() + " has " + attacker.getlife());
    }
    
    public static void main(String[] args) {
        Battle b = new Battle();
        b.fight();
    }
}