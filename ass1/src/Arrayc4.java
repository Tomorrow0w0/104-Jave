import java.util.Scanner;
public class Arrayc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數"); 
		int n=scn.nextInt();
		int end=0;
	
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
			 end=i*(i+1)+end;
			}
		
		
		}  
		
System.out.println("1*(1+1)+...+n*(n+1)= "+end);
	

		
	}

}
