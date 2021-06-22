package org.academiadecodigo.bootcamp.concurrency;

import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;

/**
 * Consumer of integers from a blocking queue
 */
public class Consumer implements Runnable {

    private final BQueue<Integer> queue;
    private int elementNum;

    /**
     * @param queue      the blocking queue to consume elements from
     * @param elementNum the number of elements to consume
     */
    public Consumer(BQueue queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;
    }

    @Override
    public void run() {
        synchronized (queue) {
                for (int i = 0; i < queue.getLimit(); i++) {

                    if (queue.getSize() == 0) {
                        try {
                            System.out.println("----------------------");
                            System.out.println(Thread.currentThread().getName() + " is waiting...");
                            System.out.println("----------------------");
                            queue.wait();
                            i = -1;
                            System.out.println("----------------------");
                            System.out.println(Thread.currentThread().getName() + " is done waiting");
                            System.out.println("----------------------");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println(Thread.currentThread().getName() + " is consuming...");
                        queue.poll();
                    }
                }
        }
    }
}