/**
 * author: Mohammad AboHasan
 **/

public class Client {

    public static void main(String[] args) {

        Director director = new Director();

        Builder builder = new WoodHouseBuilder();

        director.BuildWoodHouse(builder);
        House house = builder.build();
        System.out.println(house.getDescription());

        director.BuildWoodHouseWithGarage(builder);
        house = builder.build();
        System.out.println(house.getDescription());

    }

}