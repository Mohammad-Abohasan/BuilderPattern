/**
 * author: Mohammad AboHasan
 **/

public class NormalHouseBuilder implements Builder {

    private NormalHouse Nhouse;

    public NormalHouseBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.Nhouse = new NormalHouse();
    }

    public Builder setName() {
        Nhouse.setName();
        return this;
    }

    @Override
    public Builder addWall(Wall wall) {
        wall.name = "Normal Wall";
        Nhouse.addWall(wall);
        return this;
    }

    @Override
    public Builder addRoof(Roof roof) {
        roof.name = "Normal Roof";
        Nhouse.addRoof(roof);
        return this;
    }

    @Override
    public Builder addWindow(Window window) {
        window.name = "Normal window";
        Nhouse.addWindow(window);
        return this;
    }

    @Override
    public Builder addGarage(Garage garage) {
        garage.name = "Normal garage";
        Nhouse.addGarage(garage);
        return this;
    }

    @Override
    public House build() {
        return Nhouse;
    }

}