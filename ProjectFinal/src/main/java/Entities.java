public class Entities {
    private int health;

    public Entities(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void receiveDamage(int damagePoints){
        if(this.health <= 0)
            return;
        this.health -= damagePoints;
    }
    public void damage(){
        System.out.println("Priest can't deal damages!!!");
    }
    public void healing(){
        System.out.println("Priest can't heal !!!");
    }

}
