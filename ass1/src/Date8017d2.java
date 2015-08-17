import java.util.Scanner;
public class Date8017d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int X,Y;
		 System.out.print("請輸入X= ");
		   X = scn.nextInt();
		  while(X!=999){
			  System.out.printf("請輸入Y= ");
			   Y = scn.nextInt();
			  System.out.println("最大公因數為 = " + gcd(X,Y));
            break;
		  }
	     }

	   static int gcd(int X,int Y){
   	int R=X%Y;
	     if (R == 0) return Y;
	     else return gcd(Y, R);

	   }
	   }


