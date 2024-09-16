package models;

import java.util.List;

public class Books {

  String name;
  String author;
  Genre genre;
  String description;
  int price;



  public Books(String name, String author, Genre genre, String description, int price, boolean indiscount) {
    this.name = name;
    this.author = author;
    this.genre = genre;
    this.description = description;
    this.price = price;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public String getdescription() {
    return description;
  }

  public void setdescription(String description) {
    this.description = description;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }



  public List<Books> getBookDetails(){
    System.out.println("Name : (" + this.name + ") By : "+this.author );
    System.out.println("Genre : " + this.genre.name + " Description : " + this.description);
    System.out.println("Price : " + this.price);
    return null;
  }
}