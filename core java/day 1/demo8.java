class parent
{

int site =5;
int money=90000;
String car="BMW";
}
class child extends parent
{

int money =1000;
void use()

{

System.out.println("site "+site);
System.out.println("money "+money);
System.out.println("parent money "+super.money);
System.out.println("both "+(super.money+money));
System.out.println("car "+car);
}
}
class demo8 {

   public static void main(String args[])
{

child c = new child();
c.use();
}
}