import java.util.Scanner;
public class Date81904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正數數值(不含零)");
		
		String a=scn.next();

		int i=Integer.parseInt(a);
		int j=0;
		System.out.println("回傳"+digits(i,j)+"位數");

	     }
		
		
		public static int digits(int m,int n){
		if(m!=0){
		n++;
		return digits(m/10,n);
		}
		else
		{
		return n;
		}
		
		
		
		
		
		
		
		  
	}

}
