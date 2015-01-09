
class ReverseDigits {
	public static int reverse(int x) {
		int flat = 1;
		int temp = 0;
		if(x < 0) {flat = -1; x = -x;}
		while(x > 0) {
			temp = temp * 10 + x % 10;
			x /= 10;
		}
		return temp * flat;
	}

	public static void main(String args[]) {
		System.out.println(reverse(123456));
		System.out.println(reverse(-123456));
		System.out.println(reverse(876543));
	}
}
