package practice.ds.stacks;

import java.util.Arrays;

/**
 * Created by mahbubalam on 03.01.18.
 */
public class ArrayStack<E> implements MStack<E> {
    private int capacity;
    private E[] data;
    private int size = 0;

    public ArrayStack(int c) {
        capacity = c;
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(E e) {
        if (size == capacity){
            System.out.println("Sorry! Stack is full.");
            return;
        }
        data[size] = e;
        size++;
        debug();
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        E temp = data[size - 1];
        data[size - 1] = null;
        size--;
        debug();
        return temp;
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
        return data[size - 1];
    }

    private void debug() {
        System.out.println("Array = " + Arrays.toString(data));
    }

    public static void main(String[] args) {
        MStack<Integer> stack = new ArrayStack<>(5);

        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(1);

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.top());
        System.out.println(stack.size());

        stack.pop();
        stack.pop();

        System.out.println(stack.top());
        System.out.println(stack.size());
    }
}
