import java.util.Scanner;
public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入A值：");
		int A = scn.nextInt();
		System.out.print("請輸入B值：");
		int B = scn.nextInt();
		if(A!=B){
          if(A<B)
            System.out.print(A+"<"+B);
		  else
            System.out.print(A+">"+B);
                }
		else
		  System.out.print(A+"="+B);


	}
}
