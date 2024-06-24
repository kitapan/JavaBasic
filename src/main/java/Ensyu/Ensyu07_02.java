package Ensyu;

//StreamAPIとラムダ式の課題課題２
//数値のリストを作成しましょう。要素数は10個にしましょう
//その数値の中の奇数のものだけを抽出して、平均値を出しましょう
//その平均値を出力しましょう


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Ensyu07_02 {
  public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(12,34,25,67,51,2,64,81,47,24);

    double avg = numbers.stream()
        .filter(num -> num % 2 != 0)
        .mapToInt(num -> num)
        .average()
        .getAsDouble();

    if (avg!=0) {
      System.out.println("奇数の平均値：　" + avg);
    } else {
      System.out.println("リストに奇数はありません");
    }
  }

}
