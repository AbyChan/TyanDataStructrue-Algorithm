import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class expensiveDowry {//poj 1062
/* class A{
 private int id;
 private int price;

 public A(int id, int price){this.id = id; this.price = price;}
 public int getId(){return id;}
 public int getPrice(){return price;}
 }

 class Item{
 private int id;
 private int price;
 private int level;
 private int an;//alternative number
 private List<A> as;
 
 public Item(int id, int price, int level, int an){
  this.id = id;
  this.price = price;
  this.level = level;
  this.an = an;
 }
 
 public void addA(A a){
  if(as == null) as = new ArrayList<A>();
  as.add(a);
 }
 
 public List<A> getAs(){return as;}
 public int getId(){return id;}
 public int getPrice(){return price;}
 public int getLevel(){return level;}
 public int getAn(){return an;}
 }*/

final static private int MAX = 99999999;
final static private int MAXN = 10;
private static int itemn;
private static int[][] A = new int[MAXN][MAXN];
static{
 for(int i=0; i<A.length; i++)
  for(int j=0; j<A[i].length; j++)
   A[i][j] = MAX;
}
private static void input(){
 int levell;
 int[] levelr = new int[MAXN];
 for(int l : levelr)
  l = MAX;
 Scanner in = new Scanner(System.in);
 System.out.println("please input level-limit and item number");
 levell = in.nextInt();
 itemn = in.nextInt();
 for(int i=1; i<=itemn; i++){
  System.out.println("please input item: price level, alternative number");
  int price = in.nextInt();
  int level = in.nextInt();
  int an = in.nextInt();
  A[0][i] = price;
  levelr[i] = level;
  for(int j=0; j<an; j++){
   System.out.println("please input alternative info: id and price");
   int aid = in.nextInt();
   int aprice = in.nextInt();
   A[i][aid] = aprice;
  }
/*  for(int ii=1; ii<itemn; ii++){
   for(int jj=1; jj<itemn; jj++){
    if(Math.abs(levelr[ii] - levelr[jj]) > levell+1)
     A[ii][jj] = A[jj][ii] = MAX;}}*/
 }
}

private static void showMap(){
 for(int i=0; i<=itemn; i++){
  for(int j=1; j<=itemn; j++)
   System.out.print(A[i][j] + "\t");
 System.out.println();
 }
}

private static int dijkstra(){
 int node;
 int mind = MAX;
 int[] dist = new int[itemn+1];
 
 for(int i=1; i<=itemn; i++)
  dist[i] = A[0][i];
boolean[] vist = new boolean[itemn+1];
 for(int i=1; i<=itemn; i++){
    System.out.print("hi");
   //boolean[] vist = new boolean[itemn+1];
   node = 0;
   mind = MAX;
   for(int j=1; j<=itemn; j++){
    if(!vist[j] && mind>dist[j]){
     mind = dist[j];
     node = j;
    }
   }

 if(node==0)
   break;
 
 vist[node] = true;

 for(int ii=1; ii<=itemn; ii++){
  if(!vist[ii] && A[node][ii] < MAX && dist[ii] > dist[node] + A[node][ii]){
   dist[ii] = dist[node] + A[node][ii]; 
  }
  }
 }

 for(int x : dist) System.out.print(x+" ");
 return dist[1];
}

public static void main(String[] args){
 input();
 showMap();
 int mind = dijkstra();
 System.out.println(mind);
}



}
