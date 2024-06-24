package Ensyu;

//繰り返し処理の課題課題１
//生徒名のような文字列のリストを作成しましょう
//リストの数は10以上
//リストに入っている文字数が3文字以上のものを表示しましょう
//このリストをループさせて繰り返し処理を実施し、その中で上記の条件を満たすものだけを表示しましょう

import java.util.Arrays;
import java.util.List;

public class Ensyu06_01a {
  public static void main(String[] args){
    List<String> studentList = Arrays.asList(
        "佐藤","五十嵐","南","田中","佐々木",
        "渡辺","山本","大久保","林","加藤");

    for (String name : studentList){
      if (name.length()>=3) {
        System.out.println(name);
      }
    }
  }
}
