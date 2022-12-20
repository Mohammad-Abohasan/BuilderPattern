/**
 * author: Mohammad AboHasan
 **/

public class InteriorWall extends Wall {
    String name;

    public InteriorWall(String material) {
        super(material);
        this.name = "Interior wall made out of " + material;
    }

    @Override
    public String toString() {
        return this.name;
    }

}


