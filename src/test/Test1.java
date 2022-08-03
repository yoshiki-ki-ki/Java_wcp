package test;

// 1～10までの数字のうち偶数のみを昇順で表示

public class Test1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
