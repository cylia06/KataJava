import java.util.Random;

public class Priest extends Character {

    public Priest(String name) {
        super(name);
    }

    public void damage(Character enemy){
        System.out.println("Priest can't deal damages!!!");
    }
    public void healing(Character partner){
        Random rand = new Random();
        int healingPoints = rand.nextInt(5) + 5;
        this.heal(partner, healingPoints);

    }
}
