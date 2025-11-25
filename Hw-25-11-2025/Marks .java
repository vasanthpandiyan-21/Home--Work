class Marks 
{
    int m1, m2, m3;

    Marks(int a, int b, int c) 
	{
        m1 = a;
        m2 = b;
        m3 = c;
    }

    void printGrade()
	{
        double average = (m1 + m2 + m3) / 3.0;
        System.out.println("Average : " + average);

        char grade;

        if (average >= 90)
			{
            grade = 'A';
        } 
		else if (average >= 80) 
		{
            grade = 'B';
        } 
		else if (average >= 70)
			{
            grade = 'C';
        } 
		else if (average >= 60) 
		{
            grade = 'D';
        }
		else
			{
            grade = 'F';
        }

        System.out.println("Grade : " + grade);
	}
    public static void main(String[] args)
	{
        Marks m = new Marks(85, 90, 95);
        m.printGrade();
    }
}