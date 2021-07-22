package com.pubsubpattern.app.model;

import java.util.concurrent.BlockingQueue;

public class Subscriber implements Runnable{
    BlockingQueue queue =null;

    public Subscriber(BlockingQueue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {

    }
}
