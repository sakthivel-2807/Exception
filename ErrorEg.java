package exception;

public class ErrorEg {
	public void test1() {
		test2();
	}
	public void test2() {
		test1();
	}
	

}
