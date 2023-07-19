package exception;

public class Demo {
	public static void main (String[]args) {
		System.out.println("welcome");
		String x="hello";
		System.out.println(x.indexOf("z"));
		int a=10;
		int b=5;
		int c=0;
		
		System.out.println(a+b+c);
		try {
		System.out.println(a/c);
		}
		catch(Exception e) {
			System.out.println("don't divide any num by 0");
		}
		System.out.println(a*b);
		System.out.println("thank you");
	}

}
