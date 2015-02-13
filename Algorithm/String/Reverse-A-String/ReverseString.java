
//对称交换
public class ReverseString{
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
    }
}
