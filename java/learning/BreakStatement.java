public class BreakStatement{
	public static void main(String[] args){
		for(int i = 1; i <= 20; i++){
			System.out.println("Testing the break statement");
			if(i == 15){
				System.out.println("The loop terminate here");
				break;
			}
		}
	}
}