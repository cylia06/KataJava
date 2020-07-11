import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {
    public static final int MAX_HEALTH = 100;
    Character character = new Character("test");

    @Test
    public void test(){
        Assert.assertTrue(true);
    }
    @Test
    public void has_health_at_100_when_created(){
        assertEquals(character.getHealth(), character.MAX_HEALTH);
    }



}