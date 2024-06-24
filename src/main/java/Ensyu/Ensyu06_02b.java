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
    // 1. 生徒名と番号の組み合わせを保持するHashMapを作成します。
    // Mapはキーとバリューのペアを保持するデータ構造です。
    Map<Integer, String> studentList = new HashMap<>();

    // 2. HashMapに生徒番号と名前のペアを追加します。
    // ここでは生徒の番号をキー、名前をバリューとして追加しています。
    studentList.put(1, "佐藤");
    studentList.put(2, "五十嵐");
    studentList.put(3, "南");
    studentList.put(4, "田中");
    studentList.put(5, "佐々木");
    studentList.put(6, "渡辺");
    studentList.put(7, "山本");
    studentList.put(8, "大久保");
    studentList.put(9, "林");
    studentList.put(10, "加藤");

    // 3. 現在のHashMapの内容を表示します。
    // これにより、削除処理前のリストが確認できます。
    System.out.println("元のリスト: " + studentList);

    // 4. HashMapのエントリセットを取得し、それに対するイテレータを作成します。
    // イテレータはコレクションの要素を反復処理するためのオブジェクトです。
    Iterator<Entry<Integer, String>> iterator = studentList.entrySet().iterator();

    // 5. イテレータを使用してHashMapのエントリを一つずつ処理します。
    // hasNext()で次の要素が存在するか確認し、存在する限りループします。
    while (iterator.hasNext()) {
      // 6. 次のエントリを取得します。
      // Entryはキーとバリューのペアを表します。
      Entry<Integer, String> entry = iterator.next();

      // 7. エントリのキー（生徒番号）が偶数かどうかを確認します。
      // 偶数の番号を持つエントリは削除対象です。
      if (entry.getKey() % 2 == 0) {
        // 8. キーが偶数の場合、イテレータのremove()メソッドを使ってエントリを削除します。
        // remove()メソッドはイテレータが指しているエントリをHashMapから削除します。
        iterator.remove();
      }
    }

    // 9. 偶数の番号を持つ生徒が削除された後のHashMapの内容を表示します。
    // これにより、削除処理が正しく行われたことが確認できます。
    System.out.println("削除後のリスト: " + studentList);
  }
}
