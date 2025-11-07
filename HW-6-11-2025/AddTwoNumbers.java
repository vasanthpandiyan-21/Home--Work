 class AddTwoNumbers
 {
    public static int addNumbers(int a, int b) 
	{
        return a + b;
    }

  
    public static void main(String[] args)
	{
        int num1 = 10;  
        int num2 = 20;

        int sum = addNumbers(num1, num2);  
        System.out.println("The sum is: " + sum);  
    }
}