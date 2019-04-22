import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class DnDCharacterTest {
    private static Map<String, Integer> attributes = new HashMap<String, Integer>();
    static {

        attributes.put("Strength", 0);
        attributes.put("Dexterity", 6);
        attributes.put("Constitution", 8);
        attributes.put("Intelligence", 10);
        attributes.put("Wisdom", 14);
        attributes.put("Charisma", 18);
    }
    CharacterSheet myCharSheet = new CharacterSheet("Name", "Class", attributes);
    DnDCharacter myChar = new DnDCharacter(myCharSheet);

    @Test
    public void myCharHasIntelligenceModifierOf0() {
        assertEquals(0, myChar.getModifier("Intelligence"));
    }
}
