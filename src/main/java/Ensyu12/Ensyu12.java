package Ensyu12;

//総集編の課題課題１
//図書管理システムを作成しましょう
//書籍(book)を管理する情報（タイトル、著書、番号）を持つオブジェクト（クラス）を作成し、そこに情報を格納しましょう
//複数のBookのオブジェクトを持つList形式で保持、管理する役割の図書館(Library)のオブジェクトを作成しましょう
//　mainメソッドから、Libraryクラスに対して検索ができるようにする。Libraryクラスは書籍検索の機能を持つ。
//　タイトル検索、著者検索、番号検索メソッドをLibraryに持たせる
//　それをmainメソッドから実行して、実行結果をコンソールに出力する


import java.util.List;

public class Ensyu12 {

  public static void main(String[] args) {
    Library library = new Library();
    List<Book> newBooks = List.of(
        new Book("プロになるJava","杉山貴章",1),
        new Book("スッキリわかるJava入門","中山清喬",2),
        new Book("スッキリわかるPython入門","国本大悟",3),
        new Book("GoogleAppsScript完全入門","髙橋宣成",4),
        new Book("Adobe Firefly完全ガイド","吉岡豊",5)
    );

    library.addBook(newBooks);

//    Book book1 = new Book("プロになるJava","杉山貴章",1);
//    Book book2 = new Book("スッキリわかるJava入門","中山清喬",2);
//    Book book3 = new Book("スッキリわかるPython入門","国本大悟",3);
//    Book book4 = new Book("GoogleAppsScript完全入門","髙橋宣成",4);
//    Book book5 = new Book("Adobe Firefly完全ガイド","吉岡豊",5);
//
//    library.addBook(book1);
//    library.addBook(book2);
//    library.addBook(book3);
//    library.addBook(book4);
//    library.addBook(book5);

    for (Book book : library.getBooks()) {
      System.out.println(book.getTitle());
    }
  }

}
