import java.util.ArrayList;

/**
 * author: Mohammad AboHasan
 **/

public class NormalHouse extends House {

    public NormalHouse() {
        this.walls = new ArrayList<Wall>();
        this.windows = new ArrayList<Window>();
    }

    public NormalHouse(Roof roof, ArrayList<Wall> walls, ArrayList<Window> windows, Garage garage) {
        setName();
        this.roof = roof;
        this.walls = walls;
        this.windows = windows;
        this.garage = garage;
    }

    @Override
    void setName() {
        this.name = "Normal House";
    }

}
