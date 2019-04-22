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
}
