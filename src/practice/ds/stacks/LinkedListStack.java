package practice.ds.stacks;

import java.util.LinkedList;

/**
 * Created by mahbubalam on 03.01.18.
 */
public class LinkedListStack<E> implements MStack<E> {

    /**
     * This is an example of ADAPTER PATTERN.
     * Here we modify an existing class so that it's methods match those of different, but related class.
     * One general way, we have a hidden instance of a class and then we implement each method using
     * methods of the hidden instance.
     */

    private LinkedList<E> data;

    public LinkedListStack() {
        data = new LinkedList<>();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.size() == 0;
    }

    @Override
    public void push(E e) {
        data.add(e);
        debug();
    }

    @Override
    public E pop() {
        E temp = data.removeLast();
        debug();
        return temp;
    }

    @Override
    public E top() {
        return data.getLast();
    }

    public void debug() {
        System.out.println("List = " + data.toString());
    }

    public static void main(String[] args) {
        MStack<String> stack = new LinkedListStack<>();

        stack.push("me");
        stack.push("myself");
        stack.push("irene");

        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());
    }
}
