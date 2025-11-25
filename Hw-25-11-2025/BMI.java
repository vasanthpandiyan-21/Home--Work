class Bill 
{

    int units;
    double cost;

    Bill(int units, double cost)
	{
        this.units = units;
        this.cost = cost;
    }

    void calculateBill() 
	{
        double total = units * cost;

        System.out.println("Total Units : " + units);
        System.out.println("Cost per Unit : Rs. " + cost);
        System.out.println("Total Bill : Rs. " + total);
    }


    public static void main(String[] args)
	{
        Bill b = new Bill(250, 5.5);
        b.calculateBill();
    }
}