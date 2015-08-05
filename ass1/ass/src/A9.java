import java.util.Scanner;
public class A9 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);
	System.out.print("請輸入A值：");
	float A = scn.nextFloat();
	System.out.print("請輸入B值：");
	float B = scn.nextFloat();
	System.out.print("你要做的運算是 + , - , * 或 / ？");
	String S = scn.next();	
	if (S.equals("+")){
		float C=A+B;
		System.out.print(A+"+"+B+"="+C);
	}
	if (S.equals("-")){
		float C=A-B;
		System.out.print(A+"-"+B+"="+C);
	}	
	if (S.equals("*")){
		float C=A*B;
		System.out.print(A+"*"+B+"="+C);
	}		
	if ((int)B!=0){
		if (S.equals("/")){
			float C=A/B;
			System.out.print(A+"/"+B+"="+C);
		}
	}
	else
		System.out.print("你選擇/運算式，分母B不能為零");
	}

}
