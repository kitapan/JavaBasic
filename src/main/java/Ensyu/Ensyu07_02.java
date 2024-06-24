package Ensyu;

// StreamAPIとラムダ式の課題
// 数値のリストを作成しましょう。要素数は10個にしましょう
// その数値の中の奇数のものだけを抽出して、平均値を出しましょう
// その平均値を出力しましょう

import java.util.Arrays;            // 配列を操作するためのユーティリティクラスをインポート
import java.util.List;              // リストを扱うためのクラスをインポート
import java.util.OptionalDouble;    // 結果が存在するかどうかを扱うクラスをインポート

public class Ensyu07_02 {           // メインクラスの宣言
  public static void main(String[] args) {  // メインメソッドの宣言。プログラムのエントリーポイント
    List<Integer> numbers = Arrays.asList(12, 34, 25, 67, 51, 2, 64, 81, 47, 24);  // 10個の整数を含むリストを作成

    double avg = numbers.stream()  // numbersリストをストリームに変換
        .filter(num -> num % 2 != 0)  // 奇数だけを抽出
        .mapToInt(num -> num)         // Stream<Integer> を IntStream に変換
        .average()                    // IntStream の平均値を計算
        .getAsDouble();               // OptionalDouble から double を取得

    if (avg != 0) {                   // 平均値が0でないかをチェック
      System.out.println("奇数の平均値：　" + avg);  // 平均値を出力
    } else {
      System.out.println("リストに奇数はありません");  // 奇数が一つもなかった場合のメッセージ
    }
  }
}
