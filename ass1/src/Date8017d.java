import java.util.Scanner;
public class Date8017d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int X,Y;
		 System.out.print("請輸入X= ");
		   X = scn.nextInt();
		  while(X!=999){
			  System.out.printf("請輸入Y= ");
			   Y = scn.nextInt();
			  System.out.println("最大公因數為 = " + factorial(X,Y));
              break;
		  }
	     }
	
	   
	    static int factorial(int X,int Y){
	     if (Y == 0) return X;
	     else return factorial(Y, X % Y);

	}

}
