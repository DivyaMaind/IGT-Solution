import java.util.Scanner;
class A
{
             int uid;
	     String name; 
	     int age;
	     int salary;
	     String designation;
             A(){  
        
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

class demo4
{
            public static void main(String args[]){  
	    System.out.println("demo3");  
             A a =new A();
             a.display();
	}
}