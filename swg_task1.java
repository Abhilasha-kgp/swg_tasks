package problem_1;

import java.util.Scanner;

public class student {
	
 
	
	
	public static void main(String args[]) {
	 
	 String name;
	 int roll_number;
	 float marks,final_mks;
	 int attendance;
	 student(){
			
			roll_number=0;
			marks=0.0f;
			attendance=0;
			
			
		}
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter your name");
	 name=sc.nextLine();
	 System.out.println("enter your roll number");
	 roll_number=sc.nextInt();
	 System.out.println("enter your marks");
	 marks=sc.nextFloat();
	 System.out.println("enter the number of days you were present in the class(out of 100)");
	 attendance=sc.nextInt();
	 
	 student ob1=new student();
	 student ob2=new student();
	  final_mks=ob1.StudentTest(attendance,marks);
	 System.out.println("your final marks are:"+final_mks);
	 
 }