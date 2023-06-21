
class A
{
int a1 =1000;
}
class B extends A
{
int a1=100;
void xyz(int a1)
{
System.out.println("hi B class "+this.a1);
System.out.println("hi B class "+a1);
System.out.println("hi A class "+super.a1);
}
}
class demo7 {

   public static void main(String args[])
{
    
         B a= new B();
	a.xyz(10);
   }
}