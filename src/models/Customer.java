package models;


import java.util.List;

public class Customer {
    private String name;
    private long phone;
    private List<Order> Orders;


    public Customer(String name, List<Order> orders, long phone) {
        this.name = name;
        Orders = orders;
        this.phone = phone;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return Orders;
    }

    public void setOrders(List<Order> orders) {
        Orders = orders;
    }
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void CusInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);

    }

    public void printAllOrders() {
        for (Order order : Orders) {
            System.out.println("Order ID: " + order.getId());
            for (BookOrder bookOrder : order.getBookOrders()) {
                Books book = bookOrder.getBook();
                System.out.println("  Book: " + book.getName() +
                        ", Quantity: " + bookOrder.getQuantity() +
                        ", Price per unit: " + book.getPrice());
            }


        }
    }
}