import java.util.Scanner;
public class Date8017f {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int X,Y;
		 System.out.print("�п�JX= ");
		   X = scn.nextInt();
		  while(X!=999){
			  System.out.printf("�п�JY= ");
			   Y = scn.nextInt();
			  System.out.println("�̤p�����Ƭ� = " +(X*Y)/gcd(X,Y));
           break;
		  }
	     }

	   static int gcd(int X,int Y){
  	int R=X%Y;
	     if (R == 0) return Y;
	     else return gcd(Y, R);

	   }



	
	

}

