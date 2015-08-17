
import java.util.Scanner;

public class A5 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("阿勳畢業後奮鬥十年後買了一塊農地，據可靠消息指出阿勳買");
		System.out.println("的地有1000平方公尺， 每坪價格18000元，請間，阿勳買那塊");
		System.out.println("地花了多少錢？");
		Double A = 1000 / 3.3058 * 18000;
		System.out.println("答案: 阿勳買塊地這需花 "+A+" 元");
	}

}
