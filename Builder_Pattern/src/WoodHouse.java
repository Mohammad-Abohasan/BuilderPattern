import java.util.ArrayList;

/**
 * author: Mohammad AboHasan
 **/

public class WoodHouse extends House {

    public WoodHouse() {
        this.walls = new ArrayList<Wall>();
        this.windows = new ArrayList<Window>();
    }

    public WoodHouse(Roof roof, ArrayList<Wall> walls, ArrayList<Window> windows, Garage garage) {
        setName();
        this.roof = roof;
        this.walls = walls;
        this.windows = windows;
        this.garage = garage;
    }

    @Override
    void setName() {
        this.name = "Wood House";
    }

}

