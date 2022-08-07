package wcp.Chapter10;

public class Exception02 {
    public static void main(String[] args) {
        // try-catch-finally文の開始
        try {
            // tryブロック：例外が発生する可能性がある処理を記述
            System.out.println("100 ÷ 0 は？");
            // Exception01と同じく、例外が発生
            int result = 100 / 0;
            System.out.println("計算結果" + result);
        // ArithmeticExceptionクラスの例外が発生した場合の例外処理
        } catch (ArithmeticException e) {
            // 例外クラスが一致するので、例外処理が実行される
            System.out.println("例外が発生");
        } finally {
            // 例外発生しても処理を実行
            System.out.println("プログラム終了");
        }
    }
}
