class Age 
{
    int birthYear;
    Age(int year)
	{
        birthYear = year;
    }
    void showAge() 
	{
        int age = 2025 - birthYear;
        System.out.println("Your age in 2025 is : " + age);
    }
    public static void main(String[] args)
	{
        Age a = new Age(2000);
        a.showAge();
    }
}
