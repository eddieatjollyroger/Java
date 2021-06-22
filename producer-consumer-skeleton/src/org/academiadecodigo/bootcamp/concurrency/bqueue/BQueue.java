package org.academiadecodigo.bootcamp.concurrency.bqueue;

/**
 * Blocking Queue
 *
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {
    private int limit;
    private T data;
    private int[] queue;

    /**
     * Constructs a new queue with a maximum size
     *
     * @param limit the queue size
     */
    public BQueue(int limit) {
        this.limit = limit;
        queue = new int[limit];
    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     *
     * @param data the data to add to the queue
     */
    public synchronized void offer(int data) {
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == 0) {
                queue[i] = data;
                break;
            }
            if (i == queue.length - 1 && queue[i] == 1){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     *
     * @return the data from the head of the queue
     */
    public synchronized int poll() {
        int x = 0;
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == 1) {
                x = i;
                break;
            }
            if (i == queue.length - 1 && queue[i] == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return queue[x];
    }

    /**
     * Gets the number of elements in the queue
     *
     * @return the number of elements
     */
    public int getSize() {
        int counter = 0;
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] != 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     *
     * @return the maximum number of elements
     */
    public int getLimit() {

        return limit;
    }

}
