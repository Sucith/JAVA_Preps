package classndobjects;

public class three {
	public static void main(String[] args) {
		Cars obj=new Cars();
		obj.model=19;
		obj.name="Porsche";
		obj.year=1985;
		
		System.out.println(obj.name+" "+obj.year+" "+obj.model);
		Cars obj2=obj;
		System.out.println(obj2.name ); 		// this is called calling constructor thro constructor
	}
	
	static class Cars{
		int model;
		String name;
		int year;
	
	}
}
