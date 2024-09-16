package models;

public class BookOrder {
    private int id;
    private Books book;
    private int quantity;

    public BookOrder(int id, Books book, int quantity) {
        this.id = id;
        this.book = book;
        this.quantity = quantity;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int calculateTotalPrice() {
        return this.book.getPrice() * this.quantity;
    }
}