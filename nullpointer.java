package exception;

public class nullpointer {
	public static void main (String[]args) {
		System.out.println("welcome");
		String name=null;
		System.out.println(name);
		//single try multi catch.......
		try {
		System.out.println(name.toUpperCase());
		}
		catch (ArithmeticException e) {
			System.out.println("cannot able to done");
		}
		catch (NumberFormatException e) {
			System.out.println("num format cannot be acceptable");
		}
		catch (NullPointerException e ) {
			System.out.println(e);
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Exception occurs");
		}
		System.out.println("thank you");
		
	}

}
