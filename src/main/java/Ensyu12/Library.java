package Ensyu12;  // パッケージ名を指定

import java.util.ArrayList;  // ArrayListを使用するためのインポート
import java.util.List;  // Listを使用するためのインポート

public class Library {  // Libraryクラスの定義
  private List<Book> books;  // 複数のBookオブジェクトを保持するリスト

  public Library() {  // コンストラクタ
    this.books = new ArrayList<>();  // booksフィールドを初期化
  }

  public void addBook(Book book) {  // 1冊ずつ本を追加するメソッド
    books.add(book);  // booksリストに本を追加
  }

  public void addBook(List<Book> book) {  // 複数の本をまとめて追加するメソッド
    books.addAll(book);  // booksリストに本をまとめて追加
  }

  public List<Book> getBooks() {  // 追加された本のリストを取得するメソッド
    return books;  // booksリストを返す
  }

  public String searchTitle(String title) {  // タイトルで検索するメソッド
    for (Book book : books) {  // booksリストの全ての本をチェック
      if (book.getTitle().equals(title)) {  // タイトルが一致する場合
        return book.getTitle();  // タイトルを返す
      }
    }
    return null;  // 見つからない場合はnullを返す
  }

  public String searchAuthor(String author) {  // 著者で検索するメソッド
    for (Book book : books) {  // booksリストの全ての本をチェック
      if (book.getAuthor().equals(author)) {  // 著者が一致する場合
        return book.getAuthor();  // 著者を返す
      }
    }
    return null;  // 見つからない場合はnullを返す
  }

  public int searchNumber(int number) {  // 番号で検索するメソッド
    for (Book book : books) {  // booksリストの全ての本をチェック
      if (book.getNumber() == number) {  // 番号が一致する場合
        return book.getNumber();  // 番号を返す
      }
    }
    return -1;  // 見つからない場合は-1を返す
  }
}
