package exception;

public class facebooktask {
	public static void main (String[]args) throws InvalidIDException {
		String a="name";
		String b="loocked";
		System.out.println("welcome");
		if((b.equals("locked")==true)&&(a.equals("name")==true)) {
		 System.out.println("login");
		}
		else {
			throw new InvalidIDException("password not matched");
		}
		System.out.println("try again");
	}

}
