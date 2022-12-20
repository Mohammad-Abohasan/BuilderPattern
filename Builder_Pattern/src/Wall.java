/**
 * author: Mohammad AboHasan
 **/

public class Wall {
    String name;

    public Wall(String material) {
        this.name = "Wall made out of " + material;
    }

    @Override
    public String toString() {
        return this.name;
    }

}


