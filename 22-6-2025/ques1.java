class StackArray {
    int top = -1;
    int[] stack = new int[5];

    void push(int val) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = val;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10); s.push(20); s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
