import java.util.Scanner;
public class For5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�Jn��");
		int n = scn.nextInt();
		System.out.println("�п�Jm��");
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