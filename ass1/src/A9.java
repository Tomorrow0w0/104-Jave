import java.util.Scanner;
public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�JA��");
		Float A = scn.nextFloat();
		System.out.print("�п�JB��");
		Float B = scn.nextFloat();
		System.out.print("�A�n�����|�h�B��+,-,*��/?");
		String str = scn.next();
		if(str.equals("+")){
			Float C =A+B;
			System.out.print(C);
		}else{
		if(str.equals("-")){
			Float C =A-B;
			
		}else{
		if(str.equals("*")){
				Float C =A*B;
				
		}else{
		if(str.equals("/")){
				Float C =A/B;
			
			
		}
		}
			
		}
		
		
		
		
	}

}
