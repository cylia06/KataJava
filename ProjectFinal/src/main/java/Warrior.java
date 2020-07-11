import java.util.Random;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
    }

    public void damage(Character enemy){
        Random rand = new Random();
        int damagePoints = rand.nextInt(10);
        this.attack(enemy, damagePoints);
    }
    public void healing(Character partner){
        if(this == partner){
            this.heal(this, 1);
        } else
            System.out.println("*** You can't heal others !!!!");
    }
}
