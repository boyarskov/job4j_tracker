package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Customer lastHappyCustomer = null;
        for (int i = 0; i < count && !queue.isEmpty(); i++) {
            lastHappyCustomer = queue.poll();
        }
        return lastHappyCustomer.name();
    }

    public String getFirstUpsetCustomer() {
        Customer currentCustomer = null;
        for (int i = 0; i < count + 1 && !queue.isEmpty(); i++) {
            currentCustomer = queue.poll();
        }
        return currentCustomer.name();
    }
}
