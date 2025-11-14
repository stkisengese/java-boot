public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public void heal(Character target) {
        target.currentHealth = Math.min(target.currentHealth + healCapacity, target.getMaxHealth());
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public String toString() {
        if (currentHealth > 0) {
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", getName(), currentHealth, healCapacity);
        } else {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", getName(), healCapacity);
        }
    }
}
