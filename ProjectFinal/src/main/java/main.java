
public class main {
    public static void main(String[] args) {

        System.out.println("cc");

        Warrior warrior1 = new Warrior("zed");
        Priest priest1 = new Priest("sona");
        Warrior warrior2 = new Warrior("driven");
        Priest priest2 = new Priest("caitlayne");
        Warrior warrior3 = new Warrior("silouh");
        Priest priest3 = new Priest("jojo");

        Faction faction1 = new Faction("healer");
        Faction faction2 = new Faction("destroyer");
        Faction faction3 = new Faction("skipper");

        faction1.join(warrior1);
        faction1.join(priest1);

        faction2.join(warrior2);
        faction2.join(priest2);
        faction3.join(warrior3);
        faction3.join(priest3);

        System.out.println("test attack warrior1 vs warrior2");
        warrior1.damage(warrior2);
        warrior1.damage(warrior1);

        System.out.println("healt warrior1  " + warrior1.getHealth());
        System.out.println("healt warrior2  " + warrior2.getHealth());

        System.out.println("test attack warrior1 vs priest1");
        warrior1.damage(priest1);
        System.out.println("healt warrior1  " + warrior1.getHealth());
        System.out.println("healt priest1  " + priest1.getHealth());
        //// test warrior heal others
        warrior1.healing(warrior2);

        /////test prist heal warrior same faction
        System.out.println("test preist1 vs warrior1  ");
        warrior2.damage(warrior1);
        warrior2.damage(warrior1);
        warrior2.damage(warrior1);
        System.out.println("healt warrior1 before " + warrior1.getHealth());
        priest1.healing(warrior1);
        System.out.println("healt warrior1 after  " + warrior1.getHealth());


        /////test prist heal warrior differents factions
        System.out.println("test preist1 vs warrior1  ");
        warrior1.damage(warrior2);
        warrior1.damage(warrior2);
        warrior1.damage(warrior2);
        System.out.println("healt warrior2 before " + warrior2.getHealth());
        priest1.healing(warrior2);
        System.out.println("healt warrior2 after  " + warrior2.getHealth());


        /////test prist damage warrior friend factions
        faction1.addFriend(faction3);
        System.out.println("test warrior1 et warrior 3  ");
        System.out.println("healt warrior3 before " + warrior3.getHealth());
        warrior1.damage(warrior3);
        System.out.println("healtwarrior3 after  " + warrior3.getHealth());


    }

}
