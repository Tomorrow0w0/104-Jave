import java.util.Scanner;
public class Arrayc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數"); 
		int n=scn.nextInt();
		
		int sum = 1;
		int i=1;
		
		
		while( i<=n){
			
			sum=sum*i ;
			
			i++;
			
		}
		
		System.out.println("n!= "+sum);
		
		
		
	}

}
