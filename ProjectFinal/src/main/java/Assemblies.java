import java.util.ArrayList;
import java.util.Random;

public class Assemblies {

    private String name;
    private Character master;
    private ArrayList<Character> members = new ArrayList<Character>();


    public Assemblies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getMaster() {
        return master;
    }

    public void setMaster(Character master) {
        this.master = master;
    }

    public ArrayList<Character> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Character> members) {
        this.members = members;
    }

    public void addMembre(Character membre){
        this.members.add(membre);
    }
    public boolean isMembresEmpty(){
        return (this.members.isEmpty());
    }
    public  void leaveMember(Character member){
        this.members.remove(0);
        if(this.master == member){
            Random rand = new Random();
            int next = rand.nextInt(this.members.size());
            this.setMaster(this.members.get(next));
        }
    }

}
