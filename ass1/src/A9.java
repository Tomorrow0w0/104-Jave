import java.util.Scanner;
public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入A值");
		Float A = scn.nextFloat();
		System.out.print("請輸入B值");
		Float B = scn.nextFloat();
		System.out.print("你要做的四則運算+,-,*或/?");
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
