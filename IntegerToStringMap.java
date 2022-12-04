public class IntegerToStringMap implements SimpleMap {
    //variables
    private int key;
    private String name;
    private IntegerToStringMap nextKey;
    private int mapSize; 

    //constructor
    public IntegerToStringMap() {
        //key = 0; //is this the compile problem?
        name = "";
        nextKey = null;
        mapSize = 0;

    }

    //lots wrong here...
    public void put(int key, String name) {
        if (this.key != key) {
            this.key = key;
            this.name = name;
        } else {
            nextKey.put(key, name);
        }
        mapSize++;
    }

    public String get(int key) {
        if (nextKey.key == key) {
            return nextKey.name;
        } else {
            nextKey.nextKey.get(key);
        }
        return nextKey.name;
    }

    public void remove(int key) {
        //code here
        //if not null
    }

    public boolean isEmpty() {
        return true;
    }
}