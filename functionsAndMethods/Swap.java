package functionsAndMethods;
import java.util.Arrays;
public class Swap {
	public static void main(String[] args) {
		// This is normal swapping method
		int a =10;
		int b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		swap(3,5);						// this doesnt't work => check explanation in notes.
		int [] arr= {1,2,3,4,5};
		change(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void swap(int x , int y) {
		int tem = x;
		x=y;
		 y=x;
	}
	static void change(int []  nums) {
		nums[0]=45;                   // If any change is made to the object via this reference object then the same change is made to the main original object.
	}
}
