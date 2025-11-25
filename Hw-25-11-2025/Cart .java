class Cart 
{
    int p1, p2, p3;

    Cart(int p1, int p2, int p3)
	{
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    void showTotal()
	{
        int total = p1 + p2 + p3;
        System.out.println("Total Cart Value : Rs. " + total);
    }

    public static void main(String[] args)
	{
        Cart c = new Cart(199, 299, 499);
        c.showTotal();
    }
}