class Tea
{
 String name;
 int id;
 int amount;
 
 Tea(String name,int id,int amount)
 {
  this. name=name;
  this. id =id;
  this .amount=amount;
  
 }
 void disply (){
 System.out.println(name + "," +id + ","+ amount);
 }

public static void main (String []args)
{
Tea vs1 =new Tea("tea",1,15);
Tea vs2 =new Tea("coffe",2,20);
Tea vs3 =new Tea("blackcoffe",3,25);
vs1.disply();
vs2.disply();
vs3.disply();

}
}