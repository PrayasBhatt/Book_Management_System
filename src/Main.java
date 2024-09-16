import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Please enter your phone number:");
        Long phone = sc.nextLong();

        Customer customer = new Customer("Alex", new ArrayList<>(), phone);

        Genre genre1 = new Genre("Adventure", "Exciting");
        Genre genre2 = new Genre("Mystery", "Intriguing");
        Genre genre3 = new Genre("Biography", "Enlightening");

        Books book1 = new Books("The Lost City", "James Hunter", genre1, "Thrilling read", 450, true);
        Books book2 = new Books("Shadow Secrets", "Lily Green", genre2, "Gripping and mysterious", 750, true);
        Books book3 = new Books("Life of Legends", "Maria Lopez", genre3, "Inspirational", 600, false);

        List<Books> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        availableBooks.add(book3);
        List<BookOrder> ordersList = new ArrayList<>();

        System.out.println("Would you like to order books? (true or false)");
        boolean orderBooks = sc.nextBoolean();

        if (orderBooks) {
            System.out.println("Books available for purchase:");
            for (int i = 0; i < availableBooks.size(); i++) {
                Books book = availableBooks.get(i);
                System.out.println("Book No " + (i + 1) + ": " + book.getName());
            }

            System.out.println("To view book details, press 1. Otherwise, press 2.");
            int choice = sc.nextInt();
            if (choice == 1) {
                book1.getBookDetails();
                System.out.println();
                book2.getBookDetails();
                System.out.println();
                book3.getBookDetails();
                System.out.println();
            } else {
                System.out.println();
            }

            boolean continueOrdering = true;
            while (continueOrdering) {
                System.out.println("Which book would you like to order? Enter the number:");
                int bookChoice = sc.nextInt();
                System.out.println("How many copies would you like to order?");
                int quantity = sc.nextInt();
                if (bookChoice == 1) {
                    BookOrder order1 = new BookOrder(1, book1, quantity);
                    ordersList.add(order1);
                } else if (bookChoice == 2) {
                    BookOrder order2 = new BookOrder(2, book2, quantity);
                    ordersList.add(order2);
                } else if (bookChoice == 3) {
                    BookOrder order3 = new BookOrder(3, book3, quantity);
                    ordersList.add(order3);
                } else {
                    System.out.println("Invalid book number. Please try again.");
                }

                System.out.println("Would you like to order more books? (true or false)");
                boolean moreBooks = sc.nextBoolean();
                if (!moreBooks) {
                    continueOrdering = false;
                }
            }

            Order order = new Order(ordersList, 1, customer);
            int totalAmount = order.calculateTotalAmount();
            System.out.println("Total amount for your order: " + totalAmount);

            int payment = 0;
            boolean sufficientFunds = false;
            while (!sufficientFunds) {
                System.out.println("Please enter the amount of money:");
                payment = sc.nextInt();
                if (payment >= totalAmount) {
                    sufficientFunds = true;
                } else {
                    System.out.println("Insufficient funds. Please enter more money.");
                }
            }

            int change = payment - totalAmount;
            if (change >= 1000) {
                int notes = change / 1000;
                System.out.println("1000 * " + notes);
                change -= 1000 * notes;
            }

            if (change >= 500) {
                int notes = change / 500;
                System.out.println("500 * " + notes);
                change -= 500 * notes;
            }

            if (change >= 100) {
                int notes = change / 100;
                System.out.println("100 * " + notes);
                change -= 100 * notes;
            }

            if (change >= 50) {
                int notes = change / 50;
                System.out.println("50 * " + notes);
                change -= 50 * notes;
            }

            if (change >= 20) {
                int notes = change / 20;
                System.out.println("20 * " + notes);
                change -= 20 * notes;
            }

            if (change >= 10) {
                int notes = change / 10;
                System.out.println("10 * " + notes);
                change -= 10 * notes;
            }

            if (change >= 5) {
                int notes = change / 5;
                System.out.println("5 * " + notes);
                change -= 5 * notes;
            }

            customer.getOrders().add(order);
            customer.printAllOrders();

        } else {
            System.out.println("No books were ordered.");
        }
    }
}
