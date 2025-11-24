// package Decorator;

public abstract class RacletteDecorator {
    private Raclette raclette;

    public RacletteDecorator(Raclette raclette) {
         this.raclette = raclette;
    }

    public int getCalories() {
        return raclette.getCalories();
    }

    public String getIngredients() {
        return raclette.getIngredients();
    }
}