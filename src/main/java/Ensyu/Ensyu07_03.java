package Ensyu;

//StreamAPIとラムダ式の課題課題３
//時間がある方は、以下の課題に挑戦してみましょう
//ChatGPTなどの生成AIを使って、「Stream APIの基礎的な課題を作成してください」と入力しましょう
//作成された課題を実践してみましょう
//課題が終わりましたら、1on1の予約を行いましょう


import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ensyu07_03 {
  public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(12,34,25,67,51,2,64,81,47,24);

    OptionalDouble avg = numbers.stream()
        .filter(num -> num % 2 != 0)
        .mapToInt(num -> num)
        .average();

    if (avg.isPresent()) {
      System.out.println("奇数の平均知：　" + avg.getAsDouble());
    } else {
      System.out.println("リストに奇数はありません");
    }
  }

}
