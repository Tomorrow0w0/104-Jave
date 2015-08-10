import java.util.Scanner;

public class For8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤Jn­È");
		int n = scn.nextInt();

		 [a]=Math.ceil(n/2);
		  b=n-a;
		
		for(int i=0;i<a;i++){
			for(int j=0;j<a-i-1;j++){
				System.out.print(" ");
					
			}
		
					
		     for(int k=0;k<=i*2;k++){
			    System.out.print("*");
		   }		
					
					
		       System.out.println("");
					
		    }			
					
			
		
		
		for(int i=0;i<=b;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
					
			}
		
					
		     for(int k=0;k<(b-i)*2+1;k++){
			    System.out.print("*");
		   }		
					
					
		       System.out.println("");
					
		    }
		
		
		
		
		
		
	}

}
