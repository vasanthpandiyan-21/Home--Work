class PalindromLoops1
{
    public static void main(String[] args)
    {
        int a = 1441;
        int temp = a;
        int rem = 0;
        int sum = 0;

        while (a > 0)
        {
            rem = a % 10;          
            sum = (sum * 10) + rem; 
            a = a / 10;            
        }

        if (sum == temp)
        {
            System.out.println("It's a palindrome number");
        }
        else
        {
            System.out.println("It's not a palindrome number");
        }
    }
}
