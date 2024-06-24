package Ensyu09;

public class Phone implements Mail,App {
  public String call(String name){
    return name + "へ電話をかけました";
  }


  @Override
  public String send(String message) {
    return "「" + message + "」というメッセージを送信しました";
  }

  @Override
  public String play(String name) {
    return name + "を起動しました";
  }
}
