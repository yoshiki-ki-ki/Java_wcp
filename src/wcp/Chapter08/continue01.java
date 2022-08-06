package wcp.Chapter08;

public class continue01 {
	public static void main(String[] args) {
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				// count が2の場合、この後の処理をスキップ。3以降が続けられる。
				continue;
			}
			System.out.println("Continue01 = " + count);
		}
	}
}
