package Ensyu12;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private List<Book> books;

  public Library(){
    this.books = new ArrayList<>();
  }

  public void addBook(Book book) { //1冊ずつ追加するメソッド
    books.add(book);
  }

  public void addBook(List<Book> book) { //書籍をまとめて追加
    books.addAll(book);
  }
  public List<Book> getBooks() {
    return books;
  }



  public String searchTilte(String title){
    return title;
  }

  public String searchAuthor(String author){
    return author;
  }

  public int searchNumber(int number){
    return number;
  }



}
