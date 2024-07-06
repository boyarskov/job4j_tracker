package ru.job4j.queue;

import java.util.LinkedList;
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

    public static void main(String[] args) {
        Queue<Customer> customers2 = new LinkedList<>();
        customers2.add(new Customer("Petr", 1000));
        customers2.add(new Customer("Stas", 1500));
        customers2.add(new Customer("Andrey", 850));
        customers2.add(new Customer("Alexei", 900));
        customers2.add(new Customer("Iryna", 1250));
        customers2.add(new Customer("Elena", 750));
        customers2.add(new Customer("Rail", 950));
        int count2 = 4;
        AppleStore appleStore2 = new AppleStore(customers2, count2);
        String customer2 = appleStore2.getLastHappyCustomer();
        System.out.println("getLastHappyCustomer");
        System.out.println(customer2);
        //Alexei

        Queue<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Petr", 1000));
        customers.add(new Customer("Stas", 1500));
        customers.add(new Customer("Andrey", 850));
        customers.add(new Customer("Alexei", 900));
        customers.add(new Customer("Iryna", 1250));
        customers.add(new Customer("Elena", 750));
        customers.add(new Customer("Rail", 950));
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getFirstUpsetCustomer();
        System.out.println("getFirstUpsetCustomer");
        System.out.println(customer);
        //Iryna

    }
}
