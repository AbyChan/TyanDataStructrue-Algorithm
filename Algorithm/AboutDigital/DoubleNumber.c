public static int findLost(int a[]){ 
        int result=0; 
        for(int i=0;i<a.length;i++) { 
            result^=a[i]; 
        } 
        return result; 
}  
