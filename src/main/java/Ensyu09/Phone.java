package Ensyu09;

// PhoneクラスはMailとAppインターフェースを実装
public class Phone implements Mail, App {
  // 電話をかけるメソッド
  public String call(String name) {
    return name + "へ電話をかけました";
  }

  // Mailインターフェースから継承したメソッドをオーバーライドしてメッセージを送信
  @Override
  public String send(String message) {
    return "「" + message + "」というメッセージを送信しました";
  }

  // Appインターフェースから継承したメソッドをオーバーライドしてアプリを起動
  @Override
  public String play(String name) {
    return name + "を起動しました";
  }
}

