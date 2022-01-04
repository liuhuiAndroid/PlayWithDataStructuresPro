/**
 * 用队列实现栈
 */
public class MyStack {

    private Queue<Integer> q;

    /** Initialize your data structure here. */
    public MyStack() {
        q = new LoopQueue<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q.enqueue(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

        // 创建另外一个队列 q2
        Queue<Integer> q2 = new LoopQueue<>();

        // 除了最后一个元素，将 q 中的所有元素放入 q2
        while (q.getSize() > 1)
            q2.enqueue(q.dequeue());

        // q 中剩下的最后一个元素就是“栈顶”元素
        int ret = q.dequeue();

        // 此时 q2 是整个数据结构存储的所有其他数据，赋值给 q
        q = q2;

        // 返回“栈顶元素”
        return ret;
    }

    /** Get the top element. */
    public int top() {

        int ret = pop();
        push(ret);
        return ret;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }

}
