import java.util.Set;
import java.util.HashSet;

public class Faction {
    private String name;
    private Set<Character> members = new HashSet<Character>();
    private Set<Faction> friends = new HashSet<Faction>();

    public Set<Faction> getFriends() {
        return friends;
    }

    public void setFriends(Set<Faction> friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public Set<Character> getMembers() {
        return members;
    }

    public void setMembers(Set<Character> members) {
        this.members = members;
    }

    public Faction(String name) {
        this.name = name;
    }
    public Faction() {

    }

    public boolean hasMember(Character character) {
        return members.contains(character);
    }

    public void join(Character member) {
        this.members.add(member);
        member.addFaction(this);
        member.setFaction(this);
    }

    public void leave(Character member) {
        this.members.remove(member);
        //member.setFaction(null);
    }

    public boolean areAllies(Character character, Character anotherCharacter) {
        return ((members.contains(character) && members.contains(anotherCharacter))||
                character.getFaction().isFriend(anotherCharacter.getFaction()));
    }

    public void addFriend(Faction friend){
        this.friends.add(friend);
    }
    public boolean isFriend(Faction anotherFaction){
        return (friends.contains(anotherFaction));
    }

}
