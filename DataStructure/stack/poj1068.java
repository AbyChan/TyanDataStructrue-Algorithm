import java.util.Scanner;
public class poj1068{
//poj1068
 public static int[] p2w(int n, int[] ps){
  int[] ph = new int[n*2];
  int[] ws = new int[n];
  int index = 0;
  int ip = 0;
  for(int p : ps){
    ph[p+ip++] = 1;
  }
  for(int i : ph) System.out.print(i + " ");
  System.out.println();
  for(int i=0; i<n*2; i++){
    if(ph[i] == 1){
      int w = 1, c = 0;
      for(int j=i-1; j>0; j--){
	if(ph[j] == 1){
	  w++;
	} else { 
	  c++;
	  if(--w == 0) break;
	}
      }
    ws[index] = c;
    index++;
    }
  }
  return ws;
 }

 public static void main(String[] args){
  Scanner sn = new Scanner(System.in);
  System.out.println("please input case number");
  int n = sn.nextInt();
  for(int i=0; i<n; i++){
    System.out.println("please input input number");
    int m = sn.nextInt();
    int[] input = new int[m];
    for(int j=0; j<m; j++) input[j] = sn.nextInt();
    System.out.print("output: ");
    int[] output = p2w(m, input);
    for(int o : output) System.out.print(o + " ");
    System.out.println();
  }
 }
}
