import java.util.Scanner;
public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�����Ҧr�����^��");
       char AX =scn.next().charAt(0);
       
        String str="";
		
        int v1 = AX-'A' ;
    if(v1>=0 && v1<26){
		switch(AX){
			case 'A':
				str ="�x�_��"; break;
				
			case 'B':
				str ="�x����"; break;
				
			case 'C':
				str ="�򶩥�"; break;
				
			case 'D':
				str ="�x�n��"; break;
				
			case 'E':
				str ="������"; break;
				
			case 'F':
				str ="�x�_��"; break;
				
			case 'G':
				str ="�y����"; break;
				
			case 'H':
				str ="��鿤"; break;
				
			case 'I':
				str ="�Ÿq��"; break;
				
			case 'J':
				str ="�s�˿�"; break;
				
			case 'K':
				str ="�]�߿�"; break;
				
			case 'L':
				str ="�x����"; break;
				
			case 'M':
				str ="�n�뿤"; break;
				
			case 'N':
				str ="���ƿ�"; break;
				
			case 'O':
				str ="�s�˥�"; break;
				
			case 'P':
				str ="���L��"; break;
				
			case 'Q':
				str ="�Ÿq��"; break;
				
			case 'R':
				str ="�x�n��"; break;
				
			case 'S':
				str ="������"; break;
				
			case 'T':
				str ="�̪F��"; break;

				
			case 'U':
				str ="�Ὤ��"; break;
				
			case 'V':
				str ="�x�F��"; break;
				
			case 'X':
				str ="���"; break;
				
			case 'Y':
				str ="�����s"; break;
				
			case 'W':
				str ="����"; break;
				
			case 'Z':
				str ="����"; break;
	                }
		System.out.println(AX+" ������"+str);
		
       }else{ 
    	 
    	System.out.println("���~");}
    
		   
		
		
		
		
	}

}
