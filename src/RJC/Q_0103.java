package RJC;

public class Q_0103 {
	public static void main(String[] args) {
//		String numbers = "1,2,3,4,5,6,7,8,9,10";
//		System.out.println(numbers);
//		for (int i = 1;i <= 10;i++) {
//			if(i <= 9) {
//				System.out.print(i + ",");
//			} else if(i == 10) {
//				System.out.print(i);
//			}
//		}

		boolean flg = true;
		String str = "";
		
		for (int i = 1;i <= 10;i++) {
			if(flg) {
				str += i;
				flg = false;
			} else {
				str += "," + i;
			}
		}
		System.out.print(str);
	
	
	}
}
// 修正必要