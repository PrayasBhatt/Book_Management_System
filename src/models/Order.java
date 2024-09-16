package models;

import java.util.List;

public class Order {
    private int id;
    private List<BookOrder> bookOrders;
    private Customer c1;

    public Order(List<BookOrder> bookOrders, int id, Customer c1) {
        this.bookOrders = bookOrders;
        this.id = id;
        this.c1 = c1;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<BookOrder> getBookOrders() {
        return bookOrders;
    }

    public void setBookOrders(List<BookOrder> bookOrders) {
        this.bookOrders = bookOrders;
    }

    public Customer getC1() {
        return c1;
    }

    public void setC1(Customer c1) {
        this.c1 = c1;
    }

    public int calculateTotalAmount() {


        for (BookOrder bookOrder : this.bookOrders) {
            Books book = bookOrder.getBook();

        }
        int totalAmount = 0;
        for (BookOrder bookOrder : this.bookOrders) {
            totalAmount += bookOrder.calculateTotalPrice();
        }


        return totalAmount;
    }






}