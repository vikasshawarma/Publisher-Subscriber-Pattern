package com.pubsubpattern.app.model;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    MyBlockingQueue queue = null;

    public Producer(MyBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

    }
}
