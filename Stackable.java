public class Stackable {

    public static void main(String[] args) {
        Stackable launcher = new Stackable();
        launcher.launch();
    }

    public void launch() {
        Stack<Number> myStack = new Stack<Number>();
        System.out.println("Stack is empty: "+myStack.isEmpty());

        myStack.push(9.99);
        myStack.push(5.0);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8.5);
        myStack.push(9.6);
        myStack.push(9.7);
        myStack.push(9.77);
        myStack.push(9.888);
        myStack.push(9.5);
        myStack.push(9);
        myStack.push(999);

        myStack.getMax();

        myStack.pop();
        myStack.pop();
        myStack.getMax();
        myStack.pop();
        myStack.pop();
        myStack.getMax();
        myStack.pop();
        myStack.pop();
        myStack.getMax();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.getMax();
        myStack.pop();
        myStack.pop();
        myStack.pop();
       
        System.out.println("Stack is empty: "+myStack.isEmpty());
    }
}