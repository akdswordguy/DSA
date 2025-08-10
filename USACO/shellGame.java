package USACO;
import java.util.*;


public class shellGame{
    	public static int swapGame(int a, int b , int g) {
			if(a == g || b == g) {
				return 1;
			}
			return 0;
	}
	
    public static void main(String[] args) {
        int a,b,g;
		int res = 0;
		System.out.println("Enter the number of iteration N");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N ;  i++ ) {
			    System.out.println("Enter a");
			 a = sc.nextInt();
				System.out.println("Enter b");
			 b = sc.nextInt();
				System.out.println("Enter g");
			 g = sc.nextInt();
			 res =  res + swapGame(a,b,g);
			 
		}
		System.out.println(res);
        
    }
}