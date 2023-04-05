public class Queue {
    private int[] queue = new int[5];
    private int first;
    private int pointer;

    public Queue() {
        first = queue[0];
        pointer = 0;
    }

    public String toString() {
        String str = "end <";
        for (int index = 0; index < pointer - 1; index++) {
            str += queue[index];
            str += ", ";
        }
        str += queue[pointer - 1];
        str += "> start";
        return str;
    }

    public void enqueue(int value) {
        // add an extra 5 empty spaces to the queue if the array is full
        if (queue[queue.length - 1] != 0) {
            int[] temp = queue;
            queue = new int[temp.length + 5];
            int index = 0;
            for (int item : temp) {
                queue[index++] = item;
            }
        }
        queue[pointer] = value;
        pointer += 1;
        first = queue[0];
    }

    public void pop() {
        pointer -= 1;
        for (int index = 1; index < queue.length; index++) {
            queue[index - 1] = queue[index];
        }
        first = queue[0];

    }

    public int peek() {
        return first;
    }

    public int length() {
        return pointer;
    }

}
