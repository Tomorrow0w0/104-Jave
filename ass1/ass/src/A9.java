import java.util.Scanner;
public class A9 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);
	System.out.print("�п�JA�ȡG");
	float A = scn.nextFloat();
	System.out.print("�п�JB�ȡG");
	float B = scn.nextFloat();
	System.out.print("�A�n�����B��O + , - , * �� / �H");
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
		System.out.print("�A���/�B�⦡�A����B���ର�s");
	}

}
