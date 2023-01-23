public class Pair<T, U>{
	private T item1;
	private U item2;
	
	public Pair(T item1, U item2){
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public Pair(Pair<T,U> pairToClone){ 
		this.item1 = pairToClone.item1;
		this.item2 = pairToClone.item2;
	}
	
	public T getItem1(){
		return item1;
	}
	
	public U getItem2(){
		return item2;
	}
	
	public Pair<U,T> swap(){
		return new Pair<U,T>(item2, item1);
	}
	
}