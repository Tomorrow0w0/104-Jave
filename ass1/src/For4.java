import java.util.Scanner;
public class For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�Z�ŤH��");
		int S = scn.nextInt();
		int M= 0;
		int i2=0;
		for(int i=0;i<S;i=i+1){
			System.out.println("�п�J�C�ӤH������");
		    int H = scn.nextInt();
		    M=M+H;
		
		    System.out.println("�п�J�C�ӤH�魫");
		    int W = scn.nextInt();
		    i2=i2+W;
		}
		int A =M/S;
		int B =i2/S;
		System.out.println("���Z��������"+ A);
		System.out.println("���Z�����魫"+ B);
	     
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}

}
