package Ensyu;

//繰り返し処理の課題課題2
//MAPを作成しましょう生徒名と番号の組み合わせ（1,”田中")
//MAPの要素は10個以上
//Mapの中の番号が偶数のものをMAPから削除しましょう
//上記の処理の繰り返し処理を実装しましょう
//削除した状態のものを出力して表示しましょう

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ensyu06_02b {
  public static void main(String[] args){
    Map<Integer, String> studentList = new HashMap<>();
    studentList.put(1, "佐藤");
    studentList.put(2,"五十嵐");
    studentList.put(3,"南");
    studentList.put(4,"田中");
    studentList.put(5,"佐々木");
    studentList.put(6,"渡辺");
    studentList.put(7,"山本");
    studentList.put(8,"大久保");
    studentList.put(9,"林");
    studentList.put(10,"加藤");

    System.out.println("元のリスト: " + studentList);

    Iterator<Entry<Integer, String>> iterator = studentList.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<Integer, String> entry = iterator.next();
      if (entry.getKey() % 2 == 0) {
        iterator.remove();
      }
    }

    System.out.println("削除後のリスト：　" + studentList);


  }

}