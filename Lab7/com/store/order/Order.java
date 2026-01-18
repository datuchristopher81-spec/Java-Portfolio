package com.store.order;

public abstract class Order {

    private int orderId;
    private double amount;
    private OrderStatus status;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = OrderStatus.PENDING;
    }

    // Abstract method
    public abstract void processOrder();

    // Concrete method
    public String getOrderSummary() {
        return "Order ID: " + orderId +
               ", Amount: " + amount +
               ", Status: " + status;
    }

    // Getters
    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    // Setter with validation
    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        }
    }

    // Protected setter for status (used by subclasses)
    protected void setStatus(OrderStatus status) {
        this.status = status;
    }
}
