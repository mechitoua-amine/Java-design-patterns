package design.mechitoua.patterns.structural.decorator.client;

import design.mechitoua.patterns.structural.decorator.Bike;
import design.mechitoua.patterns.structural.decorator.impl.BasicBike;
import design.mechitoua.patterns.structural.decorator.impl.LuxuryBike;
import design.mechitoua.patterns.structural.decorator.impl.SportBike;

public class Client {
    public static void main(String[] args) {
        System.out.println("---------------- assembling a basic bike");
        Bike basicBike = new BasicBike();
        basicBike.assembleBike();

        System.out.println("---------------- assembling a luxury bike");
        Bike luxuryBike = new LuxuryBike(new BasicBike());
        luxuryBike.assembleBike();

        System.out.println("----------------- assembling a sports luxury bike");
        Bike sportsLuxuryBike = new SportBike(new LuxuryBike(new BasicBike()));
        sportsLuxuryBike.assembleBike();
    }
}
