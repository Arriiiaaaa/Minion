
/**
 * Write a description of class Minions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Minion

{
    private String name;
    private int attack,life;
    private int CORRECTOR = 1;
    /**
     * constructor
     * 
     */
    public Minion(String nm, int at, int hp) {
        name = nm;
        attack = at;
        life = hp;
    }
    
    public boolean isAlive() {
        if (life <= 0)
            return false;
        return true;
    }
    
    public void takeDamage(int amt) {
        life -= amt;
    }
    
    public int getAttack() {
        return attack;
    }
    
    public String getName() {
        return name;
    }
    
    public int getlife() {
        return life;
    }
}
