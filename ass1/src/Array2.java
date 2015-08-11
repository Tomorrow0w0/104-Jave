import java.util.Scanner;
import java.util.Random;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int date[] = new int[10];

		int i = 0;
		int count = 0;
		boolean flag = false;

		while (i < 10) {
			date[i] = rnd.nextInt(100);

			flag = false;
			for (int a = 0; a < i; a++) {
				if (date[i] == date[a]) {
					flag = true;
				}

			}
			if (flag == false) {
				if (date[i] % 2 == 0) {
					count++;
				}
				i++;
			}
		}

		int	j = 0;
        while(j<3){
        	
         System.out.println("請猜有多少個偶數");
          int k=scn.nextInt();
          
         if(k==count){
        		System.out.println("恭喜你猜對了");  
        		for( i=0;i<10;i++){
        			System.out.println(date[i]+"\t");
        			}
              break;
         
         }else{
        	 
        	 System.out.println("你輸了");}	
              for( i=0;i<10;i++){
 			System.out.println(date[i]+"\t");
 			}
              j++;
              
        }

            System.out.println("遊戲結束");
            

	}

}
