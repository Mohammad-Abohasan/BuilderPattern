import java.util.ArrayList;

/**
 * author: Mohammad AboHasan
 **/

public abstract class House {
    String name;
    Roof roof;
    ArrayList<Wall> walls;
    ArrayList<Window> windows;
    Garage garage;

    abstract void setName();

    House addRoof(Roof roof) {
        this.roof = roof;
        return this;
    }

    House addWall(Wall wall) {
        this.walls.add(wall);
        return this;
    }

    House addWindow(Window window) {
        this.windows.add(window);
        return this;
    }
    House addGarage(Garage garage) {
        this.garage = garage;
        return this;
    }
    String getDescription() {

        StringBuilder description = new StringBuilder();

        description.append("---- " + this.name + " ----\n");

        for (Wall wall : walls)
            description.append("--- " + wall.toString() + " ---\n");

        for (Window window : windows)
            description.append("--- " + window.toString() + " ---\n");

        if (roof != null)
            description.append("--- " + roof.toString() + " ---\n");

        if (garage != null)
            description.append("--- " + garage.toString() + " ---\n");

        return description.toString();
    }

}


