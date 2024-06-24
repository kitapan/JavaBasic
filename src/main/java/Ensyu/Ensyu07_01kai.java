package Ensyu;

import java.util.List;

public class Ensyu07_01kai {
  public static void main(String[] args){
    List<String> strList = List.of(
        "Sato","Igarashi","Minami","Tanaka","Sasaki",
        "Watanabe","Yamamoto","Ohkubo","Hayashi","Kato"
    );

    strList.stream()
        .map(String::length)//各リストの文字数
        .forEach(System.out::println);

    strList.stream()
        .sorted()//昇順での並べ替え　Unicode順
        //.sorted(Comparator.reverseOrder())//降順での並べ替え　Compartorのインポート必要
        .forEach(System.out::println);
  }

}
