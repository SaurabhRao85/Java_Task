package Dailytask2;

import java.util.Scanner;

public class Total implements Retail {

    @Override
    public float getTotalcost(float tax, float cost, float number) {
        float Totalcost = (cost * (1 + (tax / 100))) * number;

        return (Totalcost);
    }

    @Override
    public float getTotalextendedcost(float cosmetic, float perfume, float clothes) {
        float Totalextendedcost = cosmetic + perfume + clothes;
        System.out.println("Total cost all item " + Totalextendedcost);
        return (Totalextendedcost);

    }

    @Override
    public void getTotaldiscount(float Totalcost, float discount) {
        double Totaldiscount = (Totalcost * (discount / 100));
        System.out.println("Total discount " + Totaldiscount);

    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the quantity of cosmetic  ");
        int cosmetic = Scan.nextInt();
        System.out.println("Enter the quantity of perfume ");
        int perfume = Scan.nextInt();
        System.out.println("Enter the quantity of clothes ");
        int clothes = Scan.nextInt();
        System.out.println("Enter the discount ");
        float discount = Scan.nextFloat();
        Total r = new Total();
        float cost1 = r.getTotalcost(7, 1000, cosmetic);
        System.out.println("Total cost of cosmetic " + cost1);
        float cost2 = r.getTotalcost(12, 5000, perfume);
        System.out.println("Total cost of perfume " + cost2);
        float cost3 = r.getTotalcost(4, 7000, clothes);
        System.out.println("Total cost of clothes " + cost3);
        float totalcost = r.getTotalextendedcost(cost1, cost2, cost3);
        r.getTotaldiscount(totalcost, discount);

    }

}
