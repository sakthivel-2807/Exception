package exception;

public class arayoutofbounds {
	public static void main (String[]args) {
	    int[] a= {1,2,3,4,5,6,7};
	    System.out.println("welcome");
		
		try {
			System.out.println(a[9]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndex out of bounds");
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("heloo world");
		}
		System.out.println("thank u");
	
	}

}
