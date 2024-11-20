package arraysandArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayofPrimitives {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String[] str= new String[4];		// array creation
		for(int i=0;i<str.length;i++) {		// initially i=0 ends when i<lenght ie i<4
			str[i]=in.next();				// str[0]= out input || str[1]=our input * 2x
		}
		System.out.println(Arrays.toString(str)); // prints the result
		
		str[1]="empty";
		
	}
}
