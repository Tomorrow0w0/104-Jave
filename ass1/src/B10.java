import java.util.Scanner;
public class B10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�A���ʧO(1)�k��or(2)�k��");
		int X = scn.nextInt();
		System.out.println("�п�J�A������");
		int H = scn.nextInt();
		
		if(X==1){
			double  B = (H-170)*0.6+62;
			
			System.out.println("�k�ͼз��魫�G"+ B);}

		if(X==2){
			double  G = (H-158)*0.5+52;
			
			System.out.println("�k�ͼз��魫�G"+ G);}
		
	}

}
