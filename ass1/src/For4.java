import java.util.Scanner;
public class For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("��J�Z�ŤH��");
		int S = scn.nextInt();
		int M= 0;
		int i2=0;
		for(int i=0;i<S;i=i+1){
			System.out.println("���H������");
		    int H = scn.nextInt();
		    M=M+H;
		
		    System.out.println("���H���魫");
		    int W = scn.nextInt();
		    i2=i2+W;
		}
		int A =M/S;
		int B =i2/S;
		System.out.println("��������"+ A);
		System.out.println("�����魫"+ B);
}
	}