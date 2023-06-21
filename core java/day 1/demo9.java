import java.util.Scanner;
class clerk
{
	int uid;
	String name; 
	int age;
	int salary;
	String designation;
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

class dev
{

	int uid;
	String name; 
	int age;
	int salary;
	String designation;
	dev()
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

class manager
{
	int uid;
	String name; 
	int age;
	int salary;
	String designation;
	manager()
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

class tester
{
	int uid;
	String name; 
	int age;
	int salary;
	String designation;
	tester()
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

class demo9{

public static void main(String args[]){  
	     System.out.println("demo9");
	     Scanner sc = new Scanner(System.in);
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
