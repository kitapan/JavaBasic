package Ensyu09;

//オブジェクト指向についての課題課題１
//この回で実践した内容を一通り実装してみましょう
//GreetingとSpeakingは使わずにinterfaceと実装を組み合わせて作成しましょう
//interfaceの実装を２つ以上作成してみましょう

public class Ensyu09 {
  public static void main(String[] args){
    Phone phone = new Phone();
    String message = phone.call("渡真利");
    System.out.println(message);

    String message2 = phone.send("こんにちは");
    System.out.println(message2);

    String message3 = phone.play("ニュースアプリ");
    System.out.println(message3);
  }

}
