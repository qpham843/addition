import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class DnDCharacterTest {
    @Test
    public void DnDCharacterIsEqualToItself() {
        Map<String,Integer> attributes = new HashMap<String, Integer>();
        attributes.put("Strength", 0);
        attributes.put("Dexterity", 0);
        attributes.put("Constitution", 0);
        attributes.put("Intelligence", 0);
        attributes.put("Wisdom", 0);
        attributes.put("Charisma", 0);
        DnDCharacter myChar = new DnDCharacter("Name", "Class", attributes);
        assertEquals(myChar, myChar);
    }

    @Test
    public void randomDnDCharacterIsEqualToANewCopyOfIt() {
        DnDCharacter randChar = DnDCharacter.randomChar();
        DnDCharacter myChar = new DnDCharacter(randChar.name, randChar.dndClass, randChar.attributes);
        assertEquals(randChar, myChar);
    }
}
