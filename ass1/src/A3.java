
import java.util.Scanner;
public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入梯形的上底?");
		Float L1 = scn.nextFloat();
		System.out.println("請輸入梯形的下底?");
		Float L2 = scn.nextFloat();
		System.out.println("請輸入梯形的高?");
		Float H = scn.nextFloat();
		Float A = (L1+L2)*H/2;
		System.out.println("梯形的面積 "+A);

	}

}
