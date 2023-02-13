public class Reverse {

	
	public static String reverse(String s){
		if (s.length() <=1){
			return s;
		}
		char firstChar = s.charAt(0);
		String sub = s.substring(1);
		reverse(sub);
		String result = sub + firstChar;
		return result;
	} 
	
	
	public static void printNumbers(int n) {
		if (n <= 0) {
			return;
		}
		System.out.println(n);
		printNumbers(n-2);
		printNumbers(n-3);
		System.out.println(n);
	}
	
	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = fib(n-1) + fib(n-2);
			return result;
		}
	}

	
	public static void main(String[] args) {
		//String word = "abcdefg";
		//System.out.println("Word: " + word);
		//System.out.println("Word reversed: " + reverse(word));
		//System.out.println();
		//System.out.println("Next method");
		//System.out.println();
		//printNumbers(6);
		fib(9);
		
	}
}




/* abcdefg < start
gfedcba < goal

first > a
sub > bcdefg

first > b
sub > cdefg

first > c
sub > defg

first > d
sub > efg

first > e
sub > fg

first > f
sub > g

first > g
sub > g


g,f,e,d,c,b,a */
