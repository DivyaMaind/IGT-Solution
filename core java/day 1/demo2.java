import java.util.Scanner;

class demo2 {
	public static void main(String args[])
{ 
 	     Scanner sc = new Scanner(System.in);

	     System.out.println("Enter the ID ?"); 
             int uid=sc.nextInt();

             System.out.println("Enter the name?"); 
             String name=sc.next();

             System.out.println("Enter the salary?"); 
             String salary=sc.next();
            
             System.out.println("Enter the Age?"); 
             int age=sc.nextInt();

             System.out.println("Enter the designation?"); 
             String designation=sc.next();

             System.out.println("ID : "+uid);
             System.out.println("Name : "+name);
             System.out.println("salary : "+salary);
             System.out.println("age : "+age);
             System.out.println("designation: "+designation);
	}
}