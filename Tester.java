import java.util.*;
public class Tester{
    public static void main(String[] args){
        
        ArrayList<Plant> listPlants = new ArrayList<Plant>();
        Plant p1 = new Plant(5, 2, true);
        Plant p2 = new Plant(7, 5, false);
        //System.out.println(p2.waterPlant());
        Plant p3 = new Plant(14, 2, true);
        Plant p4 = new Succulent(11,  4, true, 8);
        Succulent p5 = new Succulent(4, 8, false, 3);
        //Plant p6 = new Succulent(9, 9,  false, 9);
        Plant p6 = new ChineseMoneyPlant(5, 2, true, 2, "green","black");
        Plant p7 = new ChineseMoneyPlant(10, 10, false, 2, "yellow", "black");
        Plant p8 = new ChineseMoneyPlant(6, 4, true, 1, "green", "red");
        Plant p9 = new ChineseMoneyPlant(14, 8, true, 10, "yellow", "green");
        Plant p10 = p6;

        listPlants.add(p1);
        listPlants.add(p2);
        listPlants.add(p3);
        listPlants.add(p4);
        listPlants.add(p5);
        listPlants.add(p6);
        listPlants.add(p7);
        listPlants.add(p8);
        listPlants.add(p9);
        listPlants.add(p10);

        System.out.println("\n*************** Houseplant status update ***************");
        //p1 stats
        System.out.println("\nPlant one:");
        System.out.println("Info: " + p1);
        System.out.println("\t-" + p1.determineSize());
        System.out.println("\t-" + p1.waterPlant());
        
        //p2 stats
        System.out.println("\nPlant two:");
        System.out.println("Info: " + p2);
        System.out.println("\t-" + p2.determineSize());
        System.out.println("\t-" + p2.waterPlant());
        
        //p3 stats
        System.out.println("\nPlant three:");
        System.out.println("Info: " + p3);
        System.out.println("\t-" + p3.determineSize());
        System.out.println("\t-" + p3.waterPlant());
        
        //p4 stats
        System.out.println("\nPlant four:");
        System.out.println("Info: " + p4);
        System.out.println("\t-" + p4.determineSize());
        System.out.println("\t-" + p4.waterPlant());
        
        //p5 stats
        System.out.println("\nPlant five:");
        System.out.println("Info: " + p5);
        System.out.println("\t-" + p5.determineSize());
        System.out.println("\t-" + p5.waterPlant());
        System.out.println("\t-" + p5.determineTurn());
        //p6 stats

        //p7 stats

        //p8 stats

        //p9 stats

        //p10 stats

    }
}