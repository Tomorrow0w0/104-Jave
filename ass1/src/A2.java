
import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三角形的底?");
		Float L = scn.nextFloat();		
		System.out.println("請輸入三角形的高?");
		Float H = scn.nextFloat();			
		Float A = L*H/2;
		System.out.println("三角形的面積 "+A);		
	}

}
