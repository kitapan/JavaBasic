package Ensyu; // パッケージを指定する

// StreamAPIとラムダ式の課題課題１
// ◆文字列のリストを作成しましょう。要素数は10個にしましょう
// ◆その文字列に対して、文字数が2以上のものを抽出して、文字列に変換をしてください。
// 区切り文字はカンマ（，）で行いましょう
// ◆その文字列を出力しましょう

import java.util.List; // Listクラスをインポートする
import java.util.stream.Collectors; // Collectorsクラスをインポートする

public class Ensyu07_01 { // クラスEnsyu07_01を定義する
  public static void main(String[] args){ // メインメソッドを定義する
    List<String> strList = List.of( // strListという名前のList<String>を作成し、初期化する
        "佐藤","五十嵐","南","田中","佐々木",
        "渡辺","山本","大久保","林","加藤"
    );

    System.out.println(strList.stream() // strListの要素をストリームに変換する
        .filter(str -> str.length() >= 2) // 各要素の文字数が2以上のものを抽出するフィルタ操作を行う
        //.forEach(System.out::println) // 各要素を出力する (コメントアウトされている)
        // ※上記はメソッド参照と呼ばれる
        //.forEach(str -> System.out.println(str)); // 各要素を出力する (コメントアウトされている)
        .collect(Collectors.joining(",")) // フィルタした結果をカンマ区切りの文字列に結合する
    );
  }
}
