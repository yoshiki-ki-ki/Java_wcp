
public class Chapter07_02 {
	public static void main(String[] args) {
		String coloer = "yellow";
		
		switch(coloer) {
		case "red" :
			System.out.println("赤信号です");
			break;
		case "yellow" :
			System.out.println("黄信号です");
			break;
		case "blue" :
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}

}
