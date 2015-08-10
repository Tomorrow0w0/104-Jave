import java.util.Scanner;
public class For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入班級人數");
		int S = scn.nextInt();
		int M= 0;
		int i2=0;
		for(int i=0;i<S;i=i+1){
			System.out.println("此人的身高");
		    int H = scn.nextInt();
		    M=M+H;
		
		    System.out.println("此人的體重");
		    int W = scn.nextInt();
		    i2=i2+W;
		}
		int A =M/S;
		int B =i2/S;
		System.out.println("平均身高"+ A);
		System.out.println("平均體重"+ B);
}
	}