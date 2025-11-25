class Discount
{
int price;
int dis;

Discount(int p,int d)
{
 price=p;
 dis= d;
}
 void printFinalPrice()
 {
	 int finalPrice =price-(price*dis/100);
 System.out.println("Original price: Rs. " +price);
 System.out.println("discont: "+ dis);
 System.out.println("final price:  " +finalPrice);
 
	 
 }
public static void main (String []args)
{
	Discount t=new Discount(1000,10);
	t.printFinalPrice();
}
}