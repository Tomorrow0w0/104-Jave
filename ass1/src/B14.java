import java.util.Scanner;
public class B14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身高(cm)");
		Double H = scn.nextDouble();
		System.out.println("請輸入體重(kg)");
		Double W = scn.nextDouble();
		
		double I = H / 2.54;
		double S = W / 0.454;
		
		System.out.println("你的身高(英吋)"+I);
		System.out.println("你的體重(磅)"+S);
		
				
		
		
		
		
		
		
		
		
	}

}
