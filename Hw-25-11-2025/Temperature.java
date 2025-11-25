class Temperature
{ int c;
 
 
 Temperature(int a)
 {
  c=a;
  
 }
 void displyFrhrenheit ()
 {
	 double frhrenheit =(c*9/5)+32;
 System.out.println(c +"C="+(int)frhrenheit+"F");
 }

public static void main (String []args)
{
Temperature vs =new Temperature(25);
vs.displyFrhrenheit();

}
} 