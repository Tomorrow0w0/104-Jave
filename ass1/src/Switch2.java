import java.util.Scanner;
public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身份證字號的英文");
       char AX =scn.next().charAt(0);
       
        String str="";
		
        int v1 = AX-'A' ;
    if(v1>=0 && v1<26){
		switch(AX){
			case 'A':
				str ="台北市"; break;
				
			case 'B':
				str ="台中市"; break;
				
			case 'C':
				str ="基隆市"; break;
				
			case 'D':
				str ="台南市"; break;
				
			case 'E':
				str ="高雄市"; break;
				
			case 'F':
				str ="台北縣"; break;
				
			case 'G':
				str ="宜蘭縣"; break;
				
			case 'H':
				str ="桃園縣"; break;
				
			case 'I':
				str ="嘉義市"; break;
				
			case 'J':
				str ="新竹縣"; break;
				
			case 'K':
				str ="苗栗縣"; break;
				
			case 'L':
				str ="台中縣"; break;
				
			case 'M':
				str ="南投縣"; break;
				
			case 'N':
				str ="彰化縣"; break;
				
			case 'O':
				str ="新竹市"; break;
				
			case 'P':
				str ="雲林縣"; break;
				
			case 'Q':
				str ="嘉義縣"; break;
				
			case 'R':
				str ="台南縣"; break;
				
			case 'S':
				str ="高雄縣"; break;
				
			case 'T':
				str ="屏東縣"; break;

				
			case 'U':
				str ="花蓮縣"; break;
				
			case 'V':
				str ="台東縣"; break;
				
			case 'X':
				str ="澎湖縣"; break;
				
			case 'Y':
				str ="陽明山"; break;
				
			case 'W':
				str ="金門"; break;
				
			case 'Z':
				str ="馬祖"; break;
	                }
		System.out.println(AX+" 縣市為"+str);
		
       }else{ 
    	 
    	System.out.println("錯誤");}
    
		   
		
		
		
		
	}

}
