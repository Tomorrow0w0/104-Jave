import java.util.Scanner;
public class Date8017d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int X,Y;
		 System.out.print("�п�JX= ");
		   X = scn.nextInt();
		  while(X!=999){
			  System.out.printf("�п�JY= ");
			   Y = scn.nextInt();
			  System.out.println("�̤j���]�Ƭ� = " + factorial(X,Y));
              break;
		  }
	     }
	
	   
	    static int factorial(int X,int Y){
	     if (Y == 0) return X;
	     else return factorial(Y, X % Y);

	}

}
