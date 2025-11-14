public class Monster extends Character {
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public void takeDamage(int amount) {
        int reducedDamage = (int) Math.floor(0.8 * amount);
        setCurrentHealth(getCurrentHealth() - reducedDamage);
    }

    @Override
    public void attack(Character target) {
        target.takeDamage(7);
    }


    @Override
    public String toString() {
        if (getCurrentHealth() > 0) {
            return String.format("%s is a monster with %d HP", getName(), getCurrentHealth());
        } else {
            return String.format("%s is a monster and is dead", getName());
        }
    }
}
