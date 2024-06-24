package Ensyu;

//正規表現の課題課題１
//Listにランダムな文字列を30個程度入れましょう（ご自身で作成しても、生成AIに作成させても構いません）
//作成したリストに対して、「数字だけを抜き出す正規表現」「文字だけを抜き出す正規表現」を試してみましょう
//実際にあっているかを確認しましょう

import java.util.List;
import java.util.stream.Collectors;

public class Ensyu10 {

  public static void main(String[] args) {
    // 文字列のリストを作成
    List<String> strList = List.of(
        "M6MOp", "czdtqJxI", "1m3sAQ8", "bN02evy", "T5Mnb8k4",
        "VJg2JeX", "678", "viJHH5VL", "VFXbb", "PnfPw",
        "Jjfl1c1", "SrCmG4NJ", "zEyKeIXu", "8z", "EGuyg5",
        "HVc65mz", "El", "b1HaT", "UD", "p4JN",
        "LnJN8IDy", "mBH5t", "FFzw", "rykpz", "77",
        "TI0E", "DS8nUdL", "Java", "RXEiX7Qw", "zi0Py"
    );

    // 元のリストを出力
    System.out.println("元のリスト：" + strList);

    // 文字列リストから数字のみを含む要素をフィルタリング
    List<String> filterList = strList.stream()
        .filter(n -> n.matches("\\d+")) // 正規表現 "\\d+" は数字のみの文字列にマッチ
        .collect(Collectors.toList()); // フィルタリングした結果をリストに収集

    // 数字のみのリストを出力
    System.out.println("数字のみ：" + filterList);

    // 文字列リストから文字のみを含む要素をフィルタリング
    List<String> filterListLetters = strList.stream()
        .filter(n -> n.matches("[a-zA-Z]+")) // 正規表現 "[a-zA-Z]+" は英字のみの文字列にマッチ
        .collect(Collectors.toList());

    // 文字のみのリストを出力
    System.out.println("文字のみ：" + filterListLetters);

    // コメントアウトされた部分: 正規表現による数字と文字のマッチングの例
    // Pattern pattern = Pattern.compile("\\d+"); // 数字のみの正規表現パターン
    // Pattern pattern = Pattern.compile("[a-zA-Z]+"); // 文字のみの正規表現パターン

    // コメントアウトされた部分: 正規表現を使ってリストの要素をマッチングする例
    // for (String str : strList) {
    //   Matcher matcher = pattern.matcher(str); // 正規表現パターンを使ってマッチング
    //   while (matcher.find()) { // マッチする部分を見つける
    //     System.out.println(matcher.group()); // マッチした部分を出力
    //   }
    // }
  }
}
