package Ensyu; // パッケージ名の宣言

//正規表現の課題課題１
//Listにランダムな文字列を30個程度入れましょう（ご自身で作成しても、生成AIに作成させても構いません）
//作成したリストに対して、「数字だけを抜き出す正規表現」「文字だけを抜き出す正規表現」を試してみましょう
//実際にあっているかを確認しましょう

import java.util.ArrayList; // ArrayListクラスをインポート
import java.util.List; // Listインターフェースをインポート
import java.util.Random; // Randomクラスをインポート
import java.util.regex.Matcher; // Matcherクラスをインポート
import java.util.regex.Pattern; // Patternクラスをインポート

public class Ensyu10_High { // Ensyu10_Highクラスの宣言
  public static void main(String[] args) { // mainメソッドの宣言
    List<String> randomStrings = generateRandomStrings(30); // ランダムな文字列を30個生成するメソッドを呼び出し
    System.out.println("元のリスト：" + randomStrings); // 生成された文字列のリストを表示

    Pattern digitsPattern = Pattern.compile("\\d+"); // 数字だけを抜き出す正規表現パターンをコンパイル
    Pattern lettersPattern = Pattern.compile("[a-zA-Z]+"); // 文字だけを抜き出す正規表現パターンをコンパイル

    List<String> digitOnlyList = new ArrayList<>(); // 数字のみを格納するリストを初期化
    List<String> letterOnlyList = new ArrayList<>(); // 文字のみを格納するリストを初期化

    for (String str : randomStrings) { // 生成された文字列リストをループ
      Matcher digitMatcher = digitsPattern.matcher(str); // 現在の文字列に対して数字の正規表現を適用
      if (digitMatcher.find()) { // マッチが見つかった場合
        digitOnlyList.add(digitMatcher.group()); // マッチした部分文字列を数字リストに追加
      }

      Matcher letterMatcher = lettersPattern.matcher(str); // 現在の文字列に対して文字の正規表現を適用
      if (letterMatcher.find()) { // マッチが見つかった場合
        letterOnlyList.add(letterMatcher.group()); // マッチした部分文字列を文字リストに追加
      }
    }

    System.out.println("数字のみのリスト：" + digitOnlyList); // 数字のみのリストを表示
    System.out.println("文字のみのリスト：" + letterOnlyList); // 文字のみのリストを表示
  }

  private static List<String> generateRandomStrings(int count) { // 指定された数のランダムな文字列を生成するメソッド
    List<String> strings = new ArrayList<>(); // ランダム文字列を格納するリストを初期化
    String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // 使用する文字のセット
    Random random = new Random(); // Randomクラスのインスタンスを生成

    for (int i = 0; i < count; i++) { // 指定された回数だけループ
      StringBuilder sb = new StringBuilder(); // 新しい文字列を構築するためのStringBuilderを初期化
      int length = random.nextInt(10) + 1; // ランダムな長さ（1から10まで）を生成
      for (int j = 0; j < length; j++) { // ランダムな長さ分ループ
        sb.append(characters.charAt(random.nextInt(characters.length()))); // ランダムに選ばれた文字を追加
      }
      strings.add(sb.toString()); // 完成した文字列をリストに追加
    }

    return strings; // 完成したリストを返す
  }
}
