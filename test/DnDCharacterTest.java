import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void myCharHasStrengthModifierOfNegativeFive() {
        assertEquals(-5, myChar.getModifier("Strength"));
    }

    @Test
    public void myCharHasCharismaModifierOf4() {
        assertEquals(4, myChar.getModifier("Charisma"));
    }

    @Test
    public void intelligenceRollIsAlwaysGreaterThan0() {
        for (int i = 0; i < 100; i += 1) {
            assertTrue(myChar.roll("Intelligence") >= 0);
        }
    }
}
