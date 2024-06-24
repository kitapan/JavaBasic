package Ensyu;

import java.util.*;

public class Ensyu06_02a並べ替え {

    public static void main(String[] args) {
      // 元のMapを作成
      Map<Integer, String> studentList = Map.of(
          1, "佐藤", 2, "五十嵐", 3, "南", 4, "田中", 5, "佐々木",
          6, "渡辺", 7, "山本", 8, "大久保", 9, "林", 10, "加藤");

      // MapのキーをListに取り出す
      List<Integer> sortedKeys = new ArrayList<>(studentList.keySet());

      // キーをソート
      Collections.sort(sortedKeys);

      // ソートされたキーでMapから値を取り出して表示
      System.out.print("{");
      for (int i = 0; i < sortedKeys.size(); i++) {
        Integer key = sortedKeys.get(i);
        System.out.print(key + ": " + studentList.get(key));
        if (i < sortedKeys.size() - 1) {
          System.out.print(", ");
        }
      }
      System.out.println("}");
    }
  }
