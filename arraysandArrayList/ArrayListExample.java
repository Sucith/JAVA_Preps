package arraysandArrayList;

import java.util.ArrayList;

import java.util.Scanner;
public class ArrayListExample {
	public static void main(String[] args) {
//		ArrayList <Integer> list = new ArrayList<>();  // Syntax if Arraylist
		
		ArrayList<Integer> list=new ArrayList<>(5);
		list.add(2);
		list.add(4);
		list.add(6);
		System.out.println(list);
//		
		System.out.println("User Input");
		Scanner in = new Scanner(System.in);
		for(int i=0 ; i < 5 ; i++) {
			list.add(in.nextInt());
		}
		for(int i=0;i<5;i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
	}
}
