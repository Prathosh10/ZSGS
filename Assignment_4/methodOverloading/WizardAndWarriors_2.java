class GameMaster {
    public void describe(Character character) {
        System.out.println("You're a level " + character.getLevel() + " "
                + character.getCharacterClass() + " with " + character.getHitPoints()
                + " hit points.");
    }

    public void describe(Destination destination) {
        System.out.println("You've arrived at " + destination.getName() +
                ", which has " + destination.getInhabitants()+ " inhabitants.");
    }

    public void describe(TravelMethod travelBy) {
        if (TravelMethod.HORSEBACK.equals(travelBy)) {
            System.out.println("You're traveling to your destination on horseback.");
        }
    }

    public void describe(Character character, Destination destination, TravelMethod travelBy) {
        System.out.println("You're a level " + character.getLevel() + " "
                + character.getCharacterClass() + " with " + character.getHitPoints()
                + " hit points."
                + "You're traveling to your destination on horseback. " +
                "You've arrived at " + destination.getName() +
                ", which has " + destination.getInhabitants()+ " inhabitants.");
    }

    public void describe(Character character, Destination destination) {
        System.out.println("You're a level " + character.getLevel() + " "
                + character.getCharacterClass() + " with " + character.getHitPoints()
                + " hit points."
                + "You're traveling to your destination by walking. " +
                "You've arrived at " + destination.getName() +
                ", which has " + destination.getInhabitants()+ " inhabitants.");
    }
}
class Character {
    private String characterClass;
    private int level;
    private int hitPoints;

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getLevel() {
        return level;
    }
}

class Destination {
    private String name;
    private int inhabitants;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }
}

enum TravelMethod {
    HORSEBACK, WALKING;
}


public class WizardAndWarriors_2 {
    public static void main(String[] args) {
        Character character = new Character();
        character.setCharacterClass("Wizard");
        character.setLevel(4);
        character.setHitPoints(28);

        Destination destination = new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);

        GameMaster gm = new GameMaster();
        gm.describe(character);
        gm.describe(destination);
        gm.describe(TravelMethod.HORSEBACK);
        gm.describe(character, destination, TravelMethod.HORSEBACK);
        gm.describe(character, destination);
    }
}
