
import java.util.Scanner;
public class A13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入傾角？");
		int A = scn.nextInt();		
		System.out.print("請輸入軸距？");
		int W = scn.nextInt();			
		System.out.print("請輸入輪胎尺寸？");
		int R = scn.nextInt();			
		if (A>43 && W>130 && R==12)
			System.out.print("條件合格！可買！");	
		else
			System.out.print("條件不合格！不要買！");
	}

}
