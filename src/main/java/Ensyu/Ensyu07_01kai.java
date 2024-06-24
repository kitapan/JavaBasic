package Ensyu; // パッケージを指定する

import java.util.List; // Listクラスをインポートする

public class Ensyu07_01kai { // クラスEnsyu07_01kaiを定義する
  public static void main(String[] args){ // メインメソッドを定義する
    List<String> strList = List.of( // strListという名前のList<String>を作成し、初期化する
        "Sato","Igarashi","Minami","Tanaka","Sasaki",
        "Watanabe","Yamamoto","Ohkubo","Hayashi","Kato"
    );

    strList.stream() // strListの要素をストリームに変換する
        .map(String::length) // 各要素の文字数を取得するマップ操作を行う
        .forEach(System.out::println); // 各要素の文字数を出力する

    strList.stream() // 再度、strListの要素をストリームに変換する
        .sorted() // ストリームの要素を昇順で並べ替える (Unicode順)
        //.sorted(Comparator.reverseOrder()) // ストリームの要素を降順で並べ替える (Comparatorのインポートが必要)
        .forEach(System.out::println); // 並べ替えた結果を出力する
  }
}

