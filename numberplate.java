package exception;

public class numberplate {
	public static void main (String[]args) {
		System.out.println("welcome");
		String noplate="TN28BY1069";
		try {
		int y=Integer.parseInt(noplate);
		}
		catch (NumberFormatException e) {
			System.out.println("cannot handled null pointer exception");
		}
		catch (Exception e) {
			System.out.println();
		}
		//System.out.println(y);
		System.out.println("thank u");
	}

}
