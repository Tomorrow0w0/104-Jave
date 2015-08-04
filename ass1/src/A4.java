
import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入圓的半徑?");
		Float R = scn.nextFloat();		
		Double A = R * R * 3.14159;
		System.out.println("圓形的面積 "+A);		
	}

}
