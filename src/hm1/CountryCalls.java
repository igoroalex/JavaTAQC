package hm1;

import java.util.Scanner;

public class CountryCalls {

    public static void main(String... args){

        System.out.println("Tariff for c1");
        int cost1 = calcCost("c1");
        int cost2 = calcCost("c2");
        int cost3 = calcCost("c3");

        int allCost = cost1 + cost2 + cost3;
        System.out.println("All costs of call is " + allCost);
    }

    private static int calcCost(String country){
        int tariff, talk;
        tariff = getTariff(country);
        talk = getTalk(country);

        int cost = tariff * talk;

        System.out.println("for " + country + " cost is " + cost);
        return cost;

    }
    private static int getTariff(String country){

        Scanner sc = new Scanner(System.in);
        String xLine = sc.nextLine();

        int x = 0;
        try{
            x = Integer.parseInt(xLine);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        return x;

    }

    private static int getTalk(String country){
        System.out.println("Talk for " + country);

        Scanner sc = new Scanner(System.in);
        String xLine = sc.nextLine();

        return Integer.parseInt(xLine);
    }

}

