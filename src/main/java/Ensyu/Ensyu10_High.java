package Ensyu;

//正規表現の課題課題１
//Listにランダムな文字列を30個程度入れましょう（ご自身で作成しても、生成AIに作成させても構いません）
//作成したリストに対して、「数字だけを抜き出す正規表現」「文字だけを抜き出す正規表現」を試してみましょう
//実際にあっているかを確認しましょう

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ensyu10_High {
  public static void main(String[] args){
    List<String> randomStrings = generateRandomStrings(30);
    System.out.println("元のリスト：" + randomStrings);

    Pattern digitsPattern = Pattern.compile("\\d+");
    //数字だけを抜き出す正規表現
    Pattern lettersPattern = Pattern.compile("[a-zA-Z]+");
    //文字だけを抜き出す正規表現

    List<String> digitOnlyList = new ArrayList<>();
    List<String> letterOnlyList = new ArrayList<>();

    for (String str : randomStrings){
      Matcher digitMatcher = digitsPattern.matcher(str);
      if (digitMatcher.find()) {
        digitOnlyList.add(digitMatcher.group());
      }

      Matcher letterMatcher = lettersPattern.matcher(str);
      if (letterMatcher.find()) {
        letterOnlyList.add(letterMatcher.group());
      }

    }

    System.out.println("数字のみのリスト：" + digitOnlyList);
    System.out.println("文字のみのリスト：" + letterOnlyList);

  }

  private static List<String> generateRandomStrings(int count) {
    List<String> strings = new ArrayList<>();
    String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random random = new Random();

    for (int i = 0; i < count; i++){
      StringBuilder sb = new StringBuilder();
      int length = random.nextInt(10) + 1;
      for (int j = 0; j < length; j++) {
        sb.append(characters.charAt(random.nextInt(characters.length())));
      }
      strings.add(sb.toString());
    }

    return strings;
  }

}
