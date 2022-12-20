/**
 * author: Mohammad AboHasan
 **/

public class Roof {
    String name;
    String material;

    public Roof(String material) {
        this.name = "Roof made out of " + material;
    }

    public String toString() {
        return this.name;
    }

}