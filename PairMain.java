public class PairMain {

    public static void main(String[] args) {
		Pair<String, Integer> myPair1 = new Pair<>("Hello", 123); 
		System.out.println(myPair1.getItem1());
		System.out.println(myPair1.getItem2());
		
		Pair<String, Integer> myPair2 = new Pair<>(myPair1);
		System.out.println();
		System.out.println("myPair2:");
		System.out.println(myPair2.getItem1());
		System.out.println(myPair2.getItem2());
		
		Pair<Integer, String> myPair3 = myPair2.swap();
		System.out.println("myPair3: (swapped)");
		System.out.println(myPair3.getItem1());
		System.out.println(myPair3.getItem2());
		
	}
	
}