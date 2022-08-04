package RJC;

public class Q_0104 {
 public static void main(String[] args) {
	 // ①整数型の配列を宣言して下さい。要素数は20個。
	 int number[] = new int[20];
	 // ②宣言した配列に0から5ずつ加算して代入。{5,10,15...100}
	 for (int i = 0;i < number.length;i++) {
		 number[i] = (i + 1) * 5;
	 }
//	 // ①配列[ 0 ]～[ 10 ]の値の奇数をカンマ区切りで表示しなさい。 String join 奇数 
//	 System.out.print("奇数：");
//	 for (int i = 0;i <= 10;i++) {
//		 if (i <= 9) {
//			 if (number[i] % 2 == 1) {
//				 System.out.print(number[i] + ",");  
//			 } 
//		 } else if (i == 10) {
//			 System.out.println(number[i]);
//		 }
//	 }
//	 // ②配列[ 11]～[ 19 ]の値の偶数をカンマ区切りで表示しなさい。
//	 System.out.print("偶数：");
//	 for (int i = 11;i < number.length;i++) {
//		 if (i <= 18) {
//			 if (number[i] % 2 == 0) {
//				 System.out.print(number[i] + ",");  
//			 }
//		 } else if (i == 19) {
//			 System.out.println(number[i]);
//		 }
//	 }
	 
	 boolean flg = true;
	 String str = "奇数：";
	 for (int i = 0;i <= 10;i++) {
		 if (number[i] % 2 == 1) {
			 if (flg) {
				 str += number[i];
				 flg = false;
			 } else {
				 str += "," + number[i];
			 } 
		 }
	 }
	 System.out.println(str);
	 
	 flg = true;
	 String string = "偶数：";
	 for (int i = 11;i < number.length;i++) {
		 if (number[i] % 2 == 0) {
			 if (flg) {
				 string += number[i];
				 flg = false;
			 } else {
				 string += "," + number[i];
			 } 
		 }
	 }
	 System.out.println(string);
 }
}
