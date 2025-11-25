class Speed
 {
    double distance;
    double time;

    Speed(double distance, double time) 
	{
        this.distance = distance;
        this.time = time;
    }

    void printSpeed()
	{
        double speed = distance / time;
        System.out.println("Speed : " + speed + " Km / Hr");
    }

    public static void main(String[] args) 
	{
        Speed s = new Speed(100, 2);
        s.printSpeed();
    }
}