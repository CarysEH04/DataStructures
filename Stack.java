public class Stack {
    private int[] stack = new int[5];
    private int last;
    private int pointer;

    public Stack() {
        last = stack[0];
        pointer = 0;
    }

    public String toString() {
        String str = "bottom <";
        for (int index = 0; index < pointer - 1; index++) {
            str += stack[index];
            str += ", ";
        }
        str += stack[pointer - 1];
        str += "> top";
        return str;
    }

    public void push(int value) {
        if (stack[stack.length - 1] != 0) {
            int[] temp = stack;
            stack = new int[temp.length + 5];
            int index = 0;
            for (int item : temp) {
                stack[index++] = item;
            }
        }
        stack[pointer] = value;
        last = stack[pointer];
        pointer += 1;
    }

    public void pop() {
        pointer -= 1;
        stack[pointer] = 0;
        last = stack[pointer - 1];

    }

    public int top() {
        return last;
    }

    public int depth() {
        return pointer;
    }
}
