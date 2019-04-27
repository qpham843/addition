import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CharacterSheet {
    //Understands the creation of a character sheet.
    public static String[] names = new String[]{"Bob"};
    public static String[] dndClasses = new String[]{"Barbarian", "Bard", "Cleric", "Druid", "Fighter","Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};

    String name;
    String dndClass;
    Map<String, Integer> attributes;

    CharacterSheet(String name, String dndClass, Map<String, Integer> attributes) {
        this.name = name;
        this.dndClass = dndClass;
        this.attributes = attributes;
    }

    public static CharacterSheet randomChar() {
        Random rand = new Random();
        String randName = names[rand.nextInt(names.length)];
        String randClass = dndClasses[rand.nextInt(dndClasses.length)];
        Map<String, Integer> randAttributes = new HashMap<String, Integer>();
        randAttributes.put("Strength", CharacterSheet.rollAttribute());
        randAttributes.put("Dexterity", CharacterSheet.rollAttribute());
        randAttributes.put("Constitution", CharacterSheet.rollAttribute());
        randAttributes.put("Intelligence", CharacterSheet.rollAttribute());
        randAttributes.put("Wisdom", CharacterSheet.rollAttribute());
        randAttributes.put("Charisma", CharacterSheet.rollAttribute());
        return new CharacterSheet(randName, randClass, randAttributes);
    }

    public static int rollAttribute(){
        Random rand = new Random();
        int minval = 20;
        int attribute = 0;
        for (int i = 0; i < 4; i += 1) {
           int val = rand.nextInt(6) + 1;
           attribute += val;
           if (val < minval) {
               minval = val;
           }
        }
        return attribute - minval;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharacterSheet)) {
            return false;
        }

        CharacterSheet otherChar = (CharacterSheet) other;
        if (this.name.equals(otherChar.name) && this.dndClass.equals(otherChar.dndClass) && this.attributes.equals(otherChar.attributes)) {
            return true;
        }
        return false;
    }
}
