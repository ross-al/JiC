import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class myHashSet{
	
	public static void main(String[] args){
		
		System.out.println("HashSet:"); 
		
		HashSet<String> myHash = new HashSet<>();
		myHash.add("Java");
		myHash.add("C");
		myHash.add("PHP");
		myHash.add("JavaScript");
		myHash.add("Python");
		
		for(String hash : myHash){
			System.out.println(hash);
		}
		System.out.println();
		System.out.println("LinkedHashSet:");
		
		LinkedHashSet<String> myList = new LinkedHashSet<>();
		myList.add("Java");
		myList.add("C");
		myList.add("PHP");
		myList.add("JavaScript");
		myList.add("Python");
		
		for(String list : myList){
			System.out.println(list);
		}
		
		System.out.println();
		System.out.println("TreeSet:");
		TreeSet<String> myTree = new TreeSet<>();
		myTree.add("Java");
		myTree.add("C");
		myTree.add("PHP");
		myTree.add("JavaScript");
		myTree.add("Python");
		
		for(String tree : myTree){
			System.out.println(tree);
		}
	}
}


