import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CharacterSheetTest {
    @Test
    public void DnDCharacterIsEqualToItself() {
        Map<String,Integer> attributes = new HashMap<String, Integer>();
        attributes.put("Strength", 0);
        attributes.put("Dexterity", 0);
        attributes.put("Constitution", 0);
        attributes.put("Intelligence", 0);
        attributes.put("Wisdom", 0);
        attributes.put("Charisma", 0);
        CharacterSheet myChar = new CharacterSheet("Name", "Class", attributes);
        assertEquals(myChar, myChar);
    }

    @Test
    public void randomDnDCharacterIsEqualToANewCopyOfIt() {
        CharacterSheet randChar = CharacterSheet.randomChar();
        CharacterSheet myChar = new CharacterSheet(randChar.name, randChar.dndClass, randChar.attributes);
        assertEquals(randChar, myChar);
    }

    @Test
    public void randomDnDCharacterIsNotEqualToAPremadeCharacterWithNonStandardNameAndClass() {
        Map<String,Integer> attributes = new HashMap<String, Integer>();
        attributes.put("Strength", 0);
        attributes.put("Dexterity", 0);
        attributes.put("Constitution", 0);
        attributes.put("Intelligence", 0);
        attributes.put("Wisdom", 0);
        attributes.put("Charisma", 0);
        CharacterSheet myChar = new CharacterSheet("Name", "Class", attributes);
        CharacterSheet randChar = CharacterSheet.randomChar();
        assertNotEquals(randChar, myChar);
    }
}
