// classDiagram
// class Excalibur{
//     -String name
//     -Excalibur INSTANCE$
//     -Excalibur(String name)
//     +getName() String
//     +getInstance()$ Excalibur
// }
// Excalibur <-- Excalibur
// package Singleton;

public class Excalibur {
    private String name;
    private static final Excalibur INSTANCE = new Excalibur("Sword");

    private Excalibur(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Excalibur getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
         System.out.println(Excalibur.getInstance().getName());
    }
}