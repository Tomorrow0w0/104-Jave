import java.util.Scanner;
public class While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入每棵龍眼樹果實重量");
		

         int w=600;
         int m=0;
		while(w>0){
			
			int n = scn.nextInt();
			 w=w-n;
			 m=m+1;
		
			
		}
		
		    System.out.print(m+"棵龍眼樹");
		
		
		
		
	}

}
