package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class triangle {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		while(true){
			System.out.println("Enter the number:");
			System.out.println("Trianle = " + triangleFunction(getInt()));
		}
	}
	
	public static int triangleFunction(int n){
		if(n == 1)
			return 1;
		else
			return (n + triangleFunction(n - 1));
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	public static int getInt() throws NumberFormatException, IOException{
		return Integer.parseInt(getString());
	}
}
