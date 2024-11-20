package classndobjects;

public class Intro1 {
	public static void main(String [] args) {
		Student stu1=new Student();
		stu1.rno=712;
		stu1.name="Adaar";
		stu1.marks=87.9f;					// Basic method of assigning values
		System.out.println(stu1.rno);
		System.out.println(stu1.name);
		System.out.println(stu1.marks);
		
		Stucons stu=new Stucons();
		System.out.println();
		System.out.println("This is normal method using constructors");		// Using Constructors
		System.out.println(stu.name);					
		System.out.println(stu.rno);
		System.out.println(stu.marks);
		
		Stucons stu2=new Stucons(12,"SUCI",45.9f);
		System.out.println();
		System.out.println("This is thro' putting valus in arguments");		// Constructors and arguments
		System.out.println(stu2.name);
		System.out.println(stu2.marks);
		System.out.println(stu2.rno);
		
		
	}
	// creating a class // for every single student
	static class Student{
		int rno;
		String name;
		float marks;
	}
	
	static class Stucons{
		int rno;
		String name;
		float marks;
		
		Stucons(){
			this.rno=4;				// here the reference variable may change or there may be many referenece variables.
			this.name="Sucith";		// we cant create that much constructore time to time . So in order to denote the value of the object we use this keyword 
			this.marks=90.8f;
		}
		
		Stucons(int roll, String naam, float avg){
			this.rno=roll;
			this.name=naam;
			this.marks=avg;
		}
		
	
	}
}
