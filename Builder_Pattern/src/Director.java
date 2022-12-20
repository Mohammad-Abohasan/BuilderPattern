/**
 * author: Mohammad AboHasan
 **/

public class Director {

    public void BuildStoneHouse(Builder builder) {
        builder.reset();
        builder.setName();
        // Stone houses have 5 walls: 4 exterior, 1 interior
        // Add 4 exterior walls
        for (int i = 0; i < 4; i++)
            builder.addWall(new Wall("Stone, 1 foot thick"));
        // Add 1 interior wall
        builder.addWall(new InteriorWall("Stone, 2 feet thick"));

        // Stone houses have a lot of windows
        for (int i = 0; i < 20; i++)
            builder.addWindow(new Window("Antique glass"));
    }

    public void BuildStoneHouseWithRoof(Builder builder) {
        BuildStoneHouse(builder);
        builder.addRoof(new Roof("Tile"));
    }

    public void BuildStoneHouseWithGarage(Builder builder) {
        BuildStoneHouse(builder);
        builder.addGarage(new Garage("Tile"));
    }

    public void BuildWoodHouse(Builder builder) {
        builder.reset();
        builder.setName();
        // 4 exterior walls, 2 interior
        // add exterior walls
        for (int i = 0; i < 4; i++) {
            System.out.println("Nailing wood for wall made out of Wood, 4x6");
            builder.addWall(new Wall("Wood, 4x6"));
        }
        // add interior walls
        for (int i = 0; i < 2; i++) {
            System.out.println("Nailing wood for interior wall made out of Wood, 2x4");
            builder.addWall(new InteriorWall("Wood, 2x4"));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Adding window made out of Tempered glass");
            builder.addWindow(new Window("Tempered glass"));
        }
    }

    public void BuildWoodHouseWithGarage(Builder builder) {
        BuildWoodHouse(builder);
        builder.addGarage(new Garage("Metal"));
    }

    public void BuildNormalHouse(Builder builder) {
        builder.reset();
        builder.setName();
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + " - Wall");
            builder.addWall(new Wall("Normal"));
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("Adding Normal window");
            builder.addWindow(new Window("Normal glass"));
        }
    }

}
