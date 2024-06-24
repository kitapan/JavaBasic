package Ensyu;

//条件式を使った課題
//文字列型を使って、変数を２つ用意しますその変数には名字と名前を入れてください
//条件は名字の文字数が２文字以上の場合かつ名前の文字数が２文字以上の場合はtrue
//条件がtrueの場合は、その名前を表示します
//条件がfalseの場合は、条件に一致しませんでした。と表示します

public class Ensyu05 {
  public static void main(String[] args){
    String firstName="大吾郎";
    String lastName="渡真利";

    if (firstName.length() >= 2 && lastName.length() >= 2) {
      System.out.println(lastName + "　" + firstName);
    } else {
      System.out.println("条件に一致しませんでした。");
    }
  }
}
