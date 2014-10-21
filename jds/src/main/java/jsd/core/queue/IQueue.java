package jsd.core.queue;

public interface IQueue<T> {

    void offer(T element);

    T peek();

    T poll();

    boolean isEmpty();

}
