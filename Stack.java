public class Stack<T extends Number> {
    private Stack<T> previous;
    private T value;
    private double maxValue;

    public Stack() {
    }

    public Stack(T value) {
        this.value = value;
    }

    public Stack(Stack<T> previous, T value) {
        this.previous = previous;
        this.value = value;
    }

    public void pop() { //do we need peek? 
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            T topOfStack = this.value;
            this.value = this.previous.value;
            this.previous = this.previous.previous;
            System.out.println(topOfStack);
        }
    }

    public void push(T value) {
        this.previous = new Stack<T>(this.previous, this.value);
        this.value = value;
        setMax(value);
    }

    public boolean isEmpty() {
        if (this.previous != null) {
            return false;
        }
        return true;
    }

    public void getMax() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Max value in stack: " + maxValue);
        }
    }

    public void setMax(T value) { //this won't update if we remove items from stack
        double newValue;
        if (!(value instanceof Double)) {
            int i = (int) value;
            newValue = (double) i;
        } else {
            newValue = (double) value;
        }
        if (newValue > maxValue) {
            maxValue = newValue;
        }
    }


}




