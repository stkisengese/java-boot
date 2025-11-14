public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public void takeDamage(int amount) {
        int reducedDamage = Math.max(0, amount - shield);
        setCurrentHealth(getCurrentHealth() - reducedDamage);
    }

    @Override
    public void attack(Character target) {
        this.heal(this);
        target.takeDamage(6);
    }

    @Override
    public void heal(Character target) {
        target.setCurrentHealth(target.getCurrentHealth() + healCapacity);
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public int getShield() {
        return shield;
    }

    @Override
    public String toString() {
        if (getCurrentHealth() > 0) {
            return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                    getName(), getCurrentHealth(), healCapacity, shield);
        } else {
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",
                    getName(), shield, healCapacity);
        }
    }
}
