public class DeadCharacterException extends Exception {
    private final Character character;

    public DeadCharacterException(Character character) {
        this.character = character;
    }

    @Override
    public String getMessage() {
        String characterType;
        if (character instanceof Sorcerer) {
            characterType = "sorcerer";
        } else if (character instanceof Templar) {
            characterType = "templar";
        } else if (character instanceof Monster) {
            characterType = "monster";
        } else {
            characterType = "character";
        }
        return String.format("The %s %s is dead.", characterType, character.getName());
    }
}
