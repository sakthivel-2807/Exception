package exception;

public class stroutofbounds {
	public static void main (String[]args) {
		String a=("sakthi");
	
		try {
			System.out.println(a.charAt(7));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("out of bounds");
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("thank u");
	}

}
