package Ensyu;

//入出力処理と例外処理の課題
//入出力処理を実装し、作ったファイルに文章を追加してみましょう
//作ったファイルを削除して、もう一度実行すると例外になるためその例外をキャッチして、例外処理を行いましょう
//catchした中でさらにファイルに書き込もうして例外になった場合、どうなるのかを確認しましょう

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ensyu08 {
  public static void main(String[] args) throws IOException {
    try {
      Path path = Path.of("JavaCourse.txt");
      Files.writeString(path, "Javaコース楽しい！", StandardOpenOption.APPEND);
    } catch (IOException e) {
      System.out.println("例外が発生しました。");
    } finally {
      System.out.println("無事に処理が終了しました。");
    }
  }

}
