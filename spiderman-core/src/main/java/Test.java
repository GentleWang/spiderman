import java.util.concurrent.Callable;


public abstract class Test {
	
	private double d = 34.4;
	long l = 4990;
	double t = 0.9f;
	public static void main(String[] args) {
		String str = "121212";
		changeStr(str);
		System.out.println(str);
	}
	public static void changeStr(String str){
		str = "wwww";
	}
}
