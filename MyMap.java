public class MyMap {

    private SimpleMap simpleMap;

    public MyMap() {
        this.simpleMap = new IntegerToStringMap();
    }

    public static void main(String[] args) {
        MyMap myLauncher = new MyMap();
        myLauncher.launch();
    }

    private void launch() {

        simpleMap.put(1, "one");
        simpleMap.put(2, "two");
        simpleMap.put(3, "three");

        System.out.println(simpleMap.get(1));
        System.out.println(simpleMap.get(2));
        System.out.println(simpleMap.get(3));


    }
}

