package com.pubsubpattern.app.model;

import java.util.LinkedList;
import java.util.Queue;

public class MyBlockingQueue<E> {
    private int max;
    private Queue<E> queue = new LinkedList<>();
    private Object notEmpty = new Object();
    private Object notFull = new Object();


    public MyBlockingQueue(int max) {
        this.queue = new LinkedList<>();
        this.max = max;

    }

    public synchronized void put(E e) throws InterruptedException {
        while(queue.size() == max){
                notFull.wait();
        }
        queue.add(e);
        notEmpty.notifyAll();
    }

    public synchronized E take() throws InterruptedException {
        if(queue.size() == 0){
            notEmpty.wait();
        }
        E item = queue.remove();
        notFull.notifyAll();
        return item;

    }
}
