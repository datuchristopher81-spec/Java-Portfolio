package com.store.main;

import com.store.order.*;
import java.util.ArrayList;
import java.util.Iterator;

public class OrderApp {

    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        // Adding at least three OnlineOrder objects
        OnlineOrder order1 = new OnlineOrder(101, 500.00);
        OnlineOrder order2 = new OnlineOrder(102, 750.00);
        OnlineOrder order3 = new OnlineOrder(103, 300.00);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        // Process and pay orders
        order1.processOrder();
        order1.pay();

        order2.processOrder();
        order2.pay();

        // Manually cancel one order for testing
        order3.processOrder();

        // Traversing using Iterator (NO index-based access)
        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {
            Order order = iterator.next();

            System.out.println(order.getOrderSummary());

            if (order.getStatus() == OrderStatus.CANCELLED) {
                iterator.remove();
            }
        }
    }
}
