import java.util.*;
public class Tester{
    public static void main(String[] args){
        
        ArrayList<Plant> listPlants = new ArrayList<Plant>();
        Plant p1 = new Plant(5, 2, true);
        Plant p2 = new Plant(7, 5, false);
        Plant p3 = new Plant(14, 2, true);
        Plant p4 = new Succulent(11,  4, true, 8);
        Succulent p5 = new Succulent(4, 8, false, 3);
        //Plant p6 = new Succulent(9, 9,  false, 9);
        ChineseMoneyPlant p6 = new ChineseMoneyPlant(5, 2, true, 2, "green","black");
        ChineseMoneyPlant p7 = new ChineseMoneyPlant(10, 10, false, 2, "yellow", "black");
        Plant p8 = new ChineseMoneyPlant(6, 4, true, 1, "green", "red");
        ChineseMoneyPlant p9 = new ChineseMoneyPlant(14, 8, true, 10, "yellow", "green");
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
        System.out.println("\nPlant six:");
        System.out.println("Info: " + p6);
        System.out.println("\t-" + p6.determineSize());
        System.out.println("\t-" + p6.waterPlant());
        System.out.println("\t-" + p6.determineRot());
        //p7 stats
        System.out.println("\nPlant seven:");
        System.out.println("Info: " + p7);
        System.out.println("\t-" + p7.determineSize());
        System.out.println("\t-" + p7.waterPlant());
        System.out.println("\t-" + p7.determineRot());
        //p8 stats
        System.out.println("\nPlant eight:");
        System.out.println("Info: " + p8);
        System.out.println("\t-" + p8.determineSize());
        System.out.println("\t-" + p8.waterPlant());
        //System.out.println("\t-" + p8.determineRot());
        //p9 stats
        System.out.println("\nPlant nine:");
        System.out.println("Info: " + p9);
        System.out.println("\t-" + p9.determineSize());
        System.out.println("\t-" + p9.waterPlant());
        System.out.println("\t-" + p9.determineRot());
        //p10 stats
        System.out.println("\nPlant ten:");
        System.out.println("Info: " + p10);
        System.out.println("\t-" + p10.determineSize());
        System.out.println("\t-" + p10.waterPlant());
        //System.out.println("\t-" + p10.determineRot());
    }
}