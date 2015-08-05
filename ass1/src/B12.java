import java.util.Scanner;
public class B12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn = new Scanner(System.in);
        System.out.print("請輸入國文成績");
		int Ch = scn.nextInt();
		System.out.print("請輸入英文成績");
		int E = scn.nextInt();
		System.out.print("請輸入數學成績");
		int C = scn.nextInt();
		
		int End=Ch+E+C;
		int End2=(Ch+E+C)/3;
		
		System.out.println("總成績為"+End);
		System.out.println("每科平均"+End2);
		
		
     
     
     

		
		
		
		
		
		
	}

}
