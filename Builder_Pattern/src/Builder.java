/**
 * author: Mohammad AboHasan
 **/

public interface Builder {

    void reset();

    Builder setName();

    Builder addWall(Wall wall);

    Builder addRoof(Roof roof);

    Builder addWindow(Window window);

    Builder addGarage(Garage garage);

    House build();

}
