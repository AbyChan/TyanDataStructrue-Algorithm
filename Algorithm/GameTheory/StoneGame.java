import java.util.Scanner;

public class StoneGame{
		  
	public static void main(String args[]){
		System.out.println("Hello, please Input:");
		Scanner si = new Scanner(System.in);
		int i = si.nextInt();
		System.out.println("Heap of stones is " + i);
		int xor = 0;
		for(int j=0; j<i; j++){
			xor ^= si.nextInt();
		}
		System.out.println(xor);
		if(xor != 0)
			System.out.println("Congratulation! You will win!");
		else
			System.out.println("Sorry! You will lose!");
	}		  

}
