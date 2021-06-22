package org.academiadecodigo.bootcamp.concurrency;

import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;

/**
 * Produces and stores integers into a blocking queue
 */
public class Producer implements Runnable {

    private final BQueue<Integer> queue;
    private int elementNum;

    /**
     * @param queue      the blocking queue to add elements to
     * @param elementNum the number of elements to produce
     */
    public Producer(BQueue queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;
    }

    @Override
    public void run() {
        synchronized (queue) {
                for (int i = 0; i < queue.getLimit(); i++) {

                    if (queue.getSize() == queue.getLimit()) {
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
                        queue.offer(elementNum);
                        System.out.println(Thread.currentThread().getName() + " is producing");
                    }
                }
        }
    }
}

