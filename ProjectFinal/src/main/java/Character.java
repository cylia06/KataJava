import java.util.HashSet;
import java.util.Set;

public class Character {

    public static final int MAX_HEALTH = 100;
    //public static final int DAMAGE_REDUCTION_THRESHOLD = 5;
    //public static final int DAMAGE_AMPLIFICATION_THRESHOLD = 5;


    private String name;
    private int health;
    private Faction faction = new Faction();
    private Set<Faction> factions = new HashSet<Faction>();

    public Set<Faction> getFactions() {
        return factions;
    }

    public void setFactions(Set<Faction> factions) {
        this.factions = factions;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public Character(String name) {
        this.name = name;
        this.health = MAX_HEALTH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void addFaction(Faction faction){
        this.factions.add(faction);
    }

    public boolean isAlive(){
        return health > 0 ;
    }
    public void receiveDamage(int damageHealth){
        this.health -= damageHealth;
        if(this.health < 0)
            this.health = 0;
    }
    public void receiveHealing(int healingHealth){
        this.health += healingHealth;
        if(this.health > MAX_HEALTH){
            this.health = MAX_HEALTH;
        }

    }

    public void attack(Character enemy, int attackDamage){
        if(enemy.isAlive() && this != enemy){
            if(!this.faction.areAllies(this, enemy)){
                enemy.receiveDamage(attackDamage);
            }
            else
                System.out.println("*** You shouldn't attack an ally or friend!!!!");
        }
        else
            System.out.println("*** Enemy is dead or you shouldn't attack your self!!!!");
    }

    public void heal(Character partner, int healingPoint){
        if(this.faction.areAllies(this, partner))
            partner.receiveHealing(healingPoint);
        else
            System.out.println("*** You shouldn't heal an enemy!!!!");
    }



}
