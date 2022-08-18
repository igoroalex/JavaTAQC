package hm1;

import java.util.Scanner;

public class CountryCalls {

    public static void main(String[] args){

        int cost1, cost2, cost3;

        cost1 = calcCost("c1");
        cost2 = calcCost("c2");
        cost3 = calcCost("c3");

        int allCost = cost1 + cost2 + cost3;
        System.out.println("All costs of call is " + allCost);

    }

    private static int calcCost(String country){
        int tariff, talk;
        tariff = getTariff(country);
        talk = getTalk(country);

        int cost = tariff * talk;

        System.out.println("for c1 cost is " + cost);
        return cost;

    }
    private static int getTariff(String country){
        System.out.println("Tariff for " + country);

        Scanner sc = new Scanner(System.in);
        String a_line = sc.nextLine();

        int x = 0;
        try{
            x = Integer.parseInt(a_line);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        return x;

    }

    private static int getTalk(String country){
        System.out.println("Talk for " + country);

        Scanner sc = new Scanner(System.in);
        String a_line = sc.nextLine();

        int x = 0;
        try{
            x = Integer.parseInt(a_line);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        return x;

    }

}

