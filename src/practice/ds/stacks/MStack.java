package practice.ds.stacks;

/**
 * Created by mahbubalam on 03.01.18.
 */
public interface MStack<E> {

    int size();
    boolean isEmpty();
    void push(E e);
    E pop();
    E top();

}
