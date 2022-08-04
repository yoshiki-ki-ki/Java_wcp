package RJC;

public class Q_0102 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		for (int i = 1;i <= 10;i++) {
			if (i % 2 == 0) {
				num += 1;
				sum += i;
			}
		}
		System.out.println("偶数の個数は、" + num + "個です。");
		System.out.println("偶数の合計値は、" + sum + "です。");
	}
}
