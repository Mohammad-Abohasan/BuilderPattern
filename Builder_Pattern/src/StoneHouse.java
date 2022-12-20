import java.util.ArrayList;

/**
 * author: Mohammad AboHasan
 **/

public class StoneHouse extends House {

    public StoneHouse() {
        this.walls = new ArrayList<Wall>();
        this.windows = new ArrayList<Window>();
    }

    public StoneHouse(Roof roof, ArrayList<Wall> walls, ArrayList<Window> windows, Garage garage) {
        setName();
        this.roof = roof;
        this.walls = walls;
        this.windows = windows;
        this.garage = garage;
    }

    @Override
    void setName() {
        this.name = "Stone House";
    }

}