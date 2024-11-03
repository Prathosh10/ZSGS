public class Fighter {

    public boolean isVulnerable() {
        return true;
    }

    public int getDamagePoints(Fighter fighter) {
        return 0;
    }
}

class Warriors extends Fighter{
    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizards extends Fighter{
    private boolean spell = false;

    @Override
    public boolean isVulnerable() {
        return !spell;
    }

    public boolean prepareSpell() {
        return spell = true;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (spell) {
            return 12;
        } else {
           return 3;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}

class FighterDemo {
    public static void main(String[] args) {
        Warriors warrior = new Warriors();
        System.out.println(warrior.toString());
        System.out.println("Vulnerable : " + warrior.isVulnerable());
        System.out.println("Damage points : " + warrior.getDamagePoints(warrior));

        Wizards wizard = new Wizards();
        System.out.println("Damage points : " + warrior.getDamagePoints(wizard));

        System.out.println(wizard.toString());
        System.out.println("Vulnerable : " + wizard.isVulnerable());
        System.out.println("Damage points : " + wizard.getDamagePoints(warrior));
        wizard.prepareSpell();
        System.out.println("Vulnerable : " + wizard.isVulnerable());
        System.out.println("Damage points : " + wizard.getDamagePoints(warrior));

    }
}
