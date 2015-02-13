

public class ReverseString{
    //异或交换 java not allow 
    public static String reverse2(String str) {
	char[] ca = str.toCharArray();
	int len = ca.length; 

	for(int i=0; i<len/2; i++){
	    ca[i] = (char) ca[i] ^ ca[len - i - 1];
	    ca[len - i - 1] = (char) ca[len - i - 1] ^ ca[i];
	    ca[i] = (char) ca[len - i - 1] ^ ca[i];
	}
	return new String(ca);
    }

    //对称交换
    public static String reverse1(String str) {
	char[] ca = str.toCharArray();
	int len = ca.length;
	
	for(int i=0; i<len/2; i++){
	    char temp = ca[i];
	    ca[i] = ca[len - i -1];
	    ca[len - i -1] = temp;
	}
	return new String(ca);
    }

    public static void main(String[] args){
	String s = "abcde";
	System.out.println(reverse1(s));
	System.out.println(reverse2(s));
    }
}
