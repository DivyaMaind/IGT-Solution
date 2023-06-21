import java.util.Scanner;
class clerk
{
	int uid;
	String name; 
	int age;
	int salary=80000;
	String designation="clerk";
	clerk()
	{

 Scanner sc = new Scanner(System.in);

	     System.out.println("Enter the ID ?"); 
             uid=sc.nextInt();

             System.out.println("Enter the name?"); 
             name=sc.next();

             System.out.println("Enter the salary?"); 
             salary=sc.nextInt();
            
             System.out.println("Enter the Age?"); 
             age=sc.nextInt();

             System.out.println("Enter the designation?"); 
             designation=sc.next();
}

 void display()
{
             System.out.println("ID : "+uid);
             System.out.println("Name : "+name);
             System.out.println("salary : "+salary);
             System.out.println("age : "+age);
             System.out.println("designation: "+designation);
}
           

}

class dev extends clerk
{

int salary=80000;
String designation="dev";	

void display()
{
             System.out.println("ID : "+uid);
             System.out.println("Name : "+name);
             System.out.println("salary : "+salary);
             System.out.println("age : "+age);
             System.out.println("designation: "+designation);
}
           

}

class manager extends clerk
{
int salary=90000;
String designation="manager";	
 void display()
{
             System.out.println("ID : "+uid);
             System.out.println("Name : "+name);
             System.out.println("salary : "+salary);
             System.out.println("age : "+age);
             System.out.println("designation: "+designation);
}
           

}

class tester extends clerk
{
int salary=70000;
String designation="tester";	
	
 
void display()
{
             System.out.println("ID : "+uid);
             System.out.println("Name : "+name);
             System.out.println("salary : "+salary);
             System.out.println("age : "+age);
             System.out.println("designation: "+designation);
}
           

}

class demo10{

public static void main(String args[]){  
	     System.out.println("demo10");
	     Scanner sc = new Scanner(System.in);
	     System.out.println("1 ) Clerk ");
	     System.out.println("2 ) Developer");
	     System.out.println("3 ) Tester ");
	     System.out.println("4 ) Manager");
             System.out.print("Enter your choice: ");
             int ch = sc.nextInt();
             
	     if(ch==1){
             clerk a =new clerk();
             a.display();
	     }
	     else if(ch==2){
	     dev b =new dev();
             b.display();
             }
             else if(ch==3){
             manager c=new manager();
             c.display();
	     }
             else{
             tester d =new tester();
             d.display();
             }		
	}
}
