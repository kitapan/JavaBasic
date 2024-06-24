package Ensyu12;  // パッケージ名を指定

public class Book {  // Bookクラスの定義
  private String title;  // 本のタイトルを表すフィールド

  private String author;  // 著者を表すフィールド

  private int number;  // 本の番号を表すフィールド

  public Book(String title, String author, int number) {  // コンストラクタ
    this.title = title;  // titleフィールドに引数を設定
    this.author = author;  // authorフィールドに引数を設定
    this.number = number;  // numberフィールドに引数を設定
  }

  public String getTitle() {  // titleフィールドのゲッターメソッド
    return title;
  }

  public void setTitle(String title) {  // titleフィールドのセッターメソッド
    this.title = title;
  }

  public String getAuthor() {  // authorフィールドのゲッターメソッド
    return author;
  }

  public void setAuthor(String author) {  // authorフィールドのセッターメソッド
    this.author = author;
  }

  public int getNumber() {  // numberフィールドのゲッターメソッド
    return number;
  }

  public void setNumber(int number) {  // numberフィールドのセッターメソッド
    this.number = number;
  }
}
