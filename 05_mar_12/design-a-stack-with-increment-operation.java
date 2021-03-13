# https://leetcode.com/problems/design-a-stack-with-increment-operation

class CustomStack {
    private int maxSize;
    private int[] stack;
    private int tailIndex;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.tailIndex = 0;
    }

    public void push(int x) {
        if (tailIndex < maxSize) {
            stack[tailIndex] = x;
            tailIndex++;
        }
    }

    public int pop() {
        int val = -1;

        if (tailIndex > 0) {
            tailIndex--;
            val = stack[tailIndex];

        }

        return val;
    }

    public void increment(int k, int val) {
        int loopIndex = 0;

        if (k > maxSize) {
            k = maxSize;
        }

        while (loopIndex < k) {
            stack[loopIndex] = stack[loopIndex] + val;
            loopIndex++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */