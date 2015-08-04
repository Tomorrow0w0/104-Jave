
import java.util.Scanner;
public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入身高？");
		int H = scn.nextInt();		
		System.out.print("請輸入體重？");
		int W = scn.nextInt();			
		if (H>165 && W<45)
			System.out.print("條件合格！可追求！");	
		else
			System.out.print("條件不合格！淘汰！");
	}

}
