import java.util.Scanner;
public class For5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n值");
		int n = scn.nextInt();
		System.out.println("請輸入m值");
		int m = scn.nextInt();
		int k = 1;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				
				 System.out.print(k+"\t");
				 k=k+1;
		   }
			    System.out.println();
		 }
		
		}

}