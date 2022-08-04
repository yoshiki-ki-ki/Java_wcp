package test;

// 1～10までの偶数の合計を計算
public class Test2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1;i <= 10;i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
}
