package com.example.burgeerstore;

ppublic class BurgerStore
{
    private static final double TaxRate = 0.008;

    private static final String [] [] userPass = {{"Username","Password"},
            {"Wendy","\n1120 Flatbush"}};
    private static final String [] ItemNames = {"ChessesBurger\n", "BaconBurger", "ChickenBurger", "TurkeyBurger"};
    private static final double [] UnitCost = {10, 12, 16, 20};

    public static String getUsername()
    {
        return userPass [1][0];
    }

    public static String getPassword()
    {
        return userPass[1][1];
    }

    public static double [] getPrice(String [] items)
    {
        return UnitCost;
    }

    public static String [] getItems(String items)
    {
        return ItemNames;
    }

    public static double getCost(double [] pr)
    {
        double cost = 0;
        cost = cost + pr[0];
        return cost;
    }

    public static double getTax(double TaxRate)
    {
        double t = 0;
        t = t + TaxRate;
        return t;
    }

    public static double getTotalCost(double getCost, double getTax)
    {
        double totalC = getCost + getTax;
        return totalC;
    }

}
