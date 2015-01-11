/** 
 * Unique Binary Search Trees  
 *  
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n? 
 
For example, 
Given n = 3, there are a total of 5 unique BST's. 
 
   1         3     3      2      1 
    \       /     /      / \      \ 
     3     2     1      1   3      2 
    /     /       \                 \ 
   2     1         2                 3 
 * 
 */  
public clss UniqueBinarySearchTrees{
    public static void main(String args[]){
	System.out.println(numTrees(3));  
    }
    public static int numTrees(int n) {  
        int[] cnt = new int[n+1];  
        cnt[0] = 1;  
        cnt[1] = 1;  
        for(int i=2; i<=n; i++){  
            for(int j=0; j<=i-1; j++){  
                cnt[i] += cnt[j] * cnt[i-1-j];  
            }  
        }  
          
        return cnt[n];  
    }
}
