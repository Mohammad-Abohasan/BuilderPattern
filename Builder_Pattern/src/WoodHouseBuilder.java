/**
 * author: Mohammad AboHasan
 **/

public class WoodHouseBuilder implements Builder {

    private WoodHouse Whouse;

    public WoodHouseBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.Whouse = new WoodHouse();
    }

    public Builder setName() {
        Whouse.setName();
        return this;
    }

    @Override
    public Builder addWall(Wall wall) {
        wall.name = "Wood Wall";
        Whouse.addWall(wall);
        return this;
    }

    @Override
    public Builder addRoof(Roof roof) {
        roof.name = "Wood Roof";
        Whouse.addRoof(roof);
        return this;
    }

    @Override
    public Builder addWindow(Window window) {
        window.name = "Wood window";
        Whouse.addWindow(window);
        return this;
    }

    @Override
    public Builder addGarage(Garage garage) {
        garage.name = "Wood garage";
        Whouse.addGarage(garage);
        return this;
    }

    @Override
    public House build() {
        return Whouse;
    }

}
