import java.util.Scanner;
public class Date8017d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int X,Y,Z;
		 System.out.print("�п�JX= ");
		   X = scn.nextInt();
		  while(X!=999){
			  System.out.printf("�п�JY= ");
			   Y = scn.nextInt();
			   System.out.printf("�п�JZ= ");
			   Z = scn.nextInt();
			  System.out.println("�̤j���]�Ƭ� = " + factorial(X,Y,Z));
             break;
		  }
	     }
	
	   
	    static int factorial(int X,int Y,int Z){
	     if (Y == 0) return X;
	     else return factorial(Y, X % Y, Z);

       }



	}


