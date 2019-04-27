import java.util.Random;

public class DnDCharacter {
    //Understands a character's interactions with the world.
    CharacterSheet charSheet;

    public DnDCharacter(CharacterSheet charSheet) {
        this.charSheet = charSheet;
    }

    public int getModifier(String attribute) {
        int attr = charSheet.attributes.get(attribute);
        return (attr - 10)/2;
    }

    public int roll(String attribute) {
        int rollNumber = new Random().nextInt(20);
        return rollNumber + getModifier(attribute);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DnDCharacter)) {
            return false;
        }

        DnDCharacter otherChar = (DnDCharacter) other;
        if (this.charSheet.equals(((DnDCharacter) other).charSheet)) {
            return true;
        }
        return false;
    }
}
