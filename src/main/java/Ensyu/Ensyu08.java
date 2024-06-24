package Ensyu;

// 入出力処理と例外処理の課題
// ・入出力処理を実装し、作ったファイルに文章を追加してみましょう
// ・作ったファイルを削除して、もう一度実行すると例外になるためその例外をキャッチして、例外処理を行いましょう
// ・catchした中でさらにファイルに書き込もうして例外になった場合、どうなるのかを確認しましょう

import java.io.IOException;  // 入出力処理で発生する可能性のある例外を扱うためのクラス
import java.nio.file.Files;  // ファイルの読み書き操作を行うためのクラス
import java.nio.file.Path;    // ファイルシステム内のパスを表現するためのクラス
import java.nio.file.StandardOpenOption; // ファイル操作のオプションを指定するための列挙型

public class Ensyu08 {  // クラス定義開始
  public static void main(String[] args) throws IOException {  // プログラムのエントリーポイント。IOExceptionがスローされる可能性があるため throws IOException を指定
    try {  // 例外が発生する可能性のあるコードを実行するためのブロック開始
      Path path = Path.of("JavaCourse.txt");  // 書き込み対象のファイルパスを指定。ここでは「JavaCourse.txt」というファイルを指す

      // ファイルが存在しない場合に新しく作成し、存在する場合はその末尾に指定した文字列を追記
      // StandardOpenOption.CREATE オプションが指定されているため、ファイルが存在しない場合には新しく作成されます。
      // StandardOpenOption.APPEND オプションが指定されているため、ファイルが既に存在する場合には、そのファイルの末尾に文字列が追加されます。

      Files.writeString(path, "Javaコース楽しい！", StandardOpenOption.CREATE, StandardOpenOption.APPEND);

      // 以下の行はコメントアウトされていますが、もし有効化すると、ファイルが存在しない場合に新しく作成し、存在する場合はその末尾に追記します。
      // Files.writeString(path, "Javaコース楽しい！", StandardOpenOption.APPEND);

    } catch (IOException e) {  // 入出力操作中に例外が発生した場合に実行されるブロック
      System.out.println("例外が発生しました。");  // 例外が発生したことを示すメッセージを表示
    } finally {  // 例外の有無にかかわらず必ず実行されるブロック
      System.out.println("無事に処理が終了しました。");  // 処理の終了メッセージを表示
    }
  }
}
