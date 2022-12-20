/**
 * author: Mohammad AboHasan
 **/

public class StoneHouseBuilder implements Builder {

    private StoneHouse Shouse;

    public StoneHouseBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.Shouse = new StoneHouse();
    }

    public Builder setName() {
        Shouse.setName();
        return this;
    }

    @Override
    public Builder addWall(Wall wall) {
        wall.name = "Stone Wall";
        Shouse.addWall(wall);
        return this;
    }

    @Override
    public Builder addRoof(Roof roof) {
        roof.name = "Stone Roof";
        Shouse.addRoof(roof);
        return this;
    }

    @Override
    public Builder addWindow(Window window) {
        window.name = "Stone window";
        Shouse.addWindow(window);
        return this;
    }

    @Override
    public Builder addGarage(Garage garage) {
        garage.name = "Stone garage";
        Shouse.addGarage(garage);
        return this;
    }

    @Override
    public House build() {
        return Shouse;
    }

}
