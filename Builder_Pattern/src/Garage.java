/**
 * author: Mohammad AboHasan
 **/

public class Garage {
    String name;
    String material;

    public Garage(String material) {
        this.name = "Garage made out of " + material;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
