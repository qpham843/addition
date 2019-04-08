import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DnDCharacter {
    public static String[] names = new String[]{"Bob"};
    public static String[] dndClasses = new String[]{"Barbarian", "Bard", "Cleric", "Druid", "Fighter","Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};

    String name;
    String dndClass;
    Map<String, Integer> attributes;

    DnDCharacter(String name, String dndClass, Map<String, Integer> attributes) {
        this.name = name;
        this.dndClass = dndClass;
        this.attributes = attributes;
    }

    public static DnDCharacter randomChar() {
        String randName = names[new Random().nextInt(names.length)];
        String randClass = dndClasses[new Random().nextInt(dndClasses.length)];
        Map<String, Integer> randAttributes = new HashMap<String, Integer>();
        randAttributes.put("Strength", new Random().nextInt(20));
        randAttributes.put("Dexterity", new Random().nextInt(20));
        randAttributes.put("Constitution", new Random().nextInt(20));
        randAttributes.put("Intelligence", new Random().nextInt(20));
        randAttributes.put("Wisdom", new Random().nextInt(20));
        randAttributes.put("Charisma", new Random().nextInt(20));
        return new DnDCharacter(randName, randClass, randAttributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DnDCharacter)) {
            return false;
        }

        DnDCharacter otherChar = (DnDCharacter) other;
        if (this.name.equals(otherChar.name) && this.dndClass.equals(otherChar.dndClass) && this.attributes.equals(otherChar.attributes)) {
            return true;
        }
        return false;
    }
}
