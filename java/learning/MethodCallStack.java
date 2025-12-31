public class MethodCallStack{
	public static void main(String[] args){
		int y = 21;
		System.out.println(y);
		display();
		
	}
	public static void method1(){
		int x = 25;
		System.out.println("Miss Mercy is " + x);
	}
	public static boolean check(){
		boolean confirm = true;
		method1();
		return confirm;
	}
	public static void display(){
		boolean result = check();
		System.out.println(result);
	}
}