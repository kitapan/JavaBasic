package Ensyu;

//正規表現の課題課題１
//Listにランダムな文字列を30個程度入れましょう（ご自身で作成しても、生成AIに作成させても構いません）
//作成したリストに対して、「数字だけを抜き出す正規表現」「文字だけを抜き出す正規表現」を試してみましょう
//実際にあっているかを確認しましょう

import java.util.List;
import java.util.stream.Collectors;

public class Ensyu10 {
  public static void main(String[] args){
    List<String> strList = List.of(
        "M6MOp","czdtqJxI","1m3sAQ8","bN02evy","T5Mnb8k4",
        "VJg2JeX","678","viJHH5VL","VFXbb","PnfPw",
        "Jjfl1c1","SrCmG4NJ","zEyKeIXu","8z","EGuyg5",
        "HVc65mz","El","b1HaT","UD","p4JN",
        "LnJN8IDy","mBH5t","FFzw","rykpz","77",
        "TI0E","DS8nUdL","Java","RXEiX7Qw","zi0Py"
    );
    System.out.println("元のリスト：" + strList);

    List<String> filterList = strList.stream()
        .filter(n -> n.matches("\\d+"))
//        .filter(n -> n.matches("[a-zA-Z]+"))
        .collect(Collectors.toList());

    System.out.println("数字のみ：" + filterList);
//    System.out.println("文字のみ：" + filterList);

//    Pattern pattern = Pattern.compile("\\d+");//数字だけ
//    Pattern pattern = Pattern.compile("[a-zA-Z]+");//文字だけ

//    for (String str : strList) {
//      Matcher matcher = pattern.matcher(str);
//      while (matcher.find()) {
//        System.out.println(matcher.group());
//      }
//    }


  }

}
