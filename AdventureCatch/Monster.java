public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public void takeDamage(int amount) throws DeadCharacterException {
        if (getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
        int reducedDamage = (int) Math.floor(0.8 * amount);
        setCurrentHealth(getCurrentHealth() - reducedDamage);
    }

    @Override
    public void attack(Character target) throws DeadCharacterException {
        if (getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
        int damage = getWeapon() != null ? getWeapon().getDamage() : 7;
        target.takeDamage(damage);
    }

    @Override
    public String toString() {
        String weaponInfo = getWeapon() != null ? " He has the weapon " + getWeapon().toString() : "";
        if (getCurrentHealth() > 0) {
            return String.format("%s is a monster with %d HP.%s", getName(), getCurrentHealth(), weaponInfo);
        } else {
            return String.format("%s is a monster and is dead.%s", getName(), weaponInfo);
        }
    }
}
