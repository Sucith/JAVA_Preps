package classndobjects;

public class Final {
	public static void main(String[] args) {
		final A obj = new A("Adaar");
		System.out.println("BEFORE");
		System.out.println(obj.name);
		System.out.println("AFTER");
		obj.name="SUCITH";			// when primitive we can change the value
		System.out.println(obj.name);
	}
	
	static class A{
		final int num=10;
//		num=90;						//can't change the value
		String name;
		
		
		A(String name){
			this.name=name;
		}
	}
}
