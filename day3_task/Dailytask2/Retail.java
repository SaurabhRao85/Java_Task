package Dailytask2;

public interface Retail {

    float getTotalcost(float tax, float cost, float number);

    float getTotalextendedcost(float cosmetic, float perfume, float clothes);

    void getTotaldiscount(float Totalcost, float discount);
}
