class Employee 
{
    String name;
    double salary;

    Employee(String n, double s) 
	{
        name = n;
        salary = s;
    }

    void showNetSalary() 
	{
        double tax = (salary /10);
        double netSalary = salary - tax;

        System.out.println("Name : " + name);
        System.out.println("Gross Salary : Rs. " + salary);
        System.out.println("Tax : Rs. " + tax);
        System.out.println("Net Salary : Rs. " + netSalary);
    }

    public static void main(String[] args)
	{
        Employee e = new Employee("Bala", 50000);
        e.showNetSalary();
    }
}