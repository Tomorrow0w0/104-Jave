import java.util.Scanner;
public class B10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入你的性別(1)男生or(2)女生");
		int X = scn.nextInt();
		System.out.println("請輸入你的身高");
		int H = scn.nextInt();
		
		if(X==1){
			double  B = (H-170)*0.6+62;
			
			System.out.println("男生標準體重："+ B);}

		if(X==2){
			double  G = (H-158)*0.5+52;
			
			System.out.println("女生標準體重："+ G);}
		
	}

}
