public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public void takeDamage(int amount) throws DeadCharacterException {
        if (getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
        setCurrentHealth(getCurrentHealth() - amount);
    }

    @Override
    public void attack(Character target) throws DeadCharacterException {
        if (getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
        this.heal(this);
        int damage = getWeapon() != null ? getWeapon().getDamage() : 10;
        target.takeDamage(damage);
    }

    @Override
    public void heal(Character target) throws DeadCharacterException {
        if (getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
        target.setCurrentHealth(target.getCurrentHealth() + healCapacity);
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public String toString() {
        String weaponInfo = getWeapon() != null ? " He has the weapon " + getWeapon().toString() : "";
        if (getCurrentHealth() > 0) {
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP.%s",
                    getName(), getCurrentHealth(), healCapacity, weaponInfo);
        } else {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.%s",
                    getName(), healCapacity, weaponInfo);
        }
    }
}
