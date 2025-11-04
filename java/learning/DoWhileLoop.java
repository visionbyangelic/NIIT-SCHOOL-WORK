public class DoWhileLoop{
	public static void main(String[] args){
		int i = 1;
		
		do{
			System.out.println("This is a post test loop");
			i++;
		} while (i <=0);  
		
		//while =as long as the condition is true, do this
		//DO while; do this as long as the condition is true
		
		i = 1;
		while (i <=0) {
			System.out.println("This is a pre-test loop");
			i++;
		}
	}
}