import java.util.Scanner;
public class A12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入月份");
		int M = scn.nextInt();
		System.out.println("請輸入日期");
		int D = scn.nextInt();
		if(M<1 || M>12 || D<1 || D>31){
			System.out.println("輸入格式錯誤");
		}else{
			
		
		
		
		if(M==1 && D>=21 || M==2 && D<=19){
			System.out.println("水瓶座的人，個性溫和，面上常帶笑容，與人相處融洽。");}
		
		if(M==2 && D>=20 || M==3 && D<=20){
			System.out.println("牡羊座，富正義感，理想、抱負遠大。");}
		
		if(M==4 && D>=21 || M==5 && D<=21){
			System.out.println("金牛座，為人順從，堅守原則，待人純潔熱誠。");}
		
		if(M==5 && D>=22 || M==6 && D<=21){
			System.out.println("雙子座，多才多藝，機智，動作敏捷，且擅長交際。");}
		
		if(M==6 && D>=22 || M==7 && D<=23){
			System.out.println("巨蟹座，和藹可親，重視責任。關於個人的事，不願他人干涉。");}
		
		if(M==7 && D>=24 || M==8 && D<=23){
			System.out.println("獅子座，個性明朗，感情熱烈、勇敢、有俠義心。");}
		
		if(M==8 && D>=24 || M==9 && D<=23){
			System.out.println("處女座，為人仔細，作事認真，對於是非善惡，判斷分明。");}
		
		if(M==9 && D>=24 || M==10 && D<=23){
			System.out.println("天秤座，溫和，對任何事都保持中庸之道，冷靜而崇尚調和。");}
		
		if(M==10 && D>=24 || M==11 && D<=21){
			System.out.println("天蠍座，個性沉著，能吃苦耐勞，做事有持續性。");}
		
		if(M==11 && D>=23 || M==12 && D<=22){
			System.out.println("射手座，崇尚自由，意志力集中，態度冷靜。");}
		
		if(M==12 && D>=23 || M==1 && D<=20){
			System.out.println("魔羯座，個性保守，謹慎而馴良，具有強度忍耐力，能抵受任何困難。");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
		
	}

}
