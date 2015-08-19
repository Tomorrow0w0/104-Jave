import java.util.Scanner;
public class Date81908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double end = 0;
		System.out.println("請輸入單月使用使間(分鐘)");
		int n=scn.nextInt();
		
		if(n<=600){
			 end = n*0.5;
		}
	
		if(n>600 && n<=1200){
			 end = n*0.5*0.9;
		}
		
		if(n>1200){
			 end = n*0.5*0.79;
		}
	
		System.out.println("電話費"+end+"元");
	}

}
