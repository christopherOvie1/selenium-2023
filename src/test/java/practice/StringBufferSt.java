package practice;

public class StringBufferSt {

	
	
	public static void AreaTriangle(int b, int h) {
		int Area = b*h/2;
		System.out.println(Area);
	}
	public static void main(String[] args) {
		
		String  x="johnny";
		StringBuffer  b = new StringBuffer(x);
		b.reverse();
		System.out.println(b);
		System.out.println("xxxxxxxxxxxxxxxxxx");
		AreaTriangle(7,8);
		
	}

}
