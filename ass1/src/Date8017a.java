import java.util.Scanner;
import java.util.Random;
public class Date8017a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int date[]  = new int[3];  
        System.out.println("商品價格");
        date[1]=rnd.nextInt(999)+1;
        System.out.println(date[1]);
        date[2]=1000-date[1];
        System.out.println("以1000元付款,找零"+date[2]+"元");
       // System.out.println("找回最少錢幣個數");
     int end,end2,end3,end4,end5,end6,end7,end8,end9,end10,end11;

          
           
           
        	end = date[2]/500;
        	end2= date[2]%500;
        	
        	end3= end2/100;
        	end4= end2%100;
        	
        	end5 = end4/50;
        	end6= end2%50;
        	
        	end7 = end6/10;
        	end8= end2%10;
        	
        	end9 = end8/5;
        	end10= end2%5;
        	
        	end11 = end10/1;
 
        	
        	 System.out.println("找"+end+"張500");
        	 System.out.println("找"+end3+"張100");
        	 System.out.println("找"+end5+"枚50");
        	 System.out.println("找"+end7+"枚10");
        	 System.out.println("找"+end9+"枚5");
        	 System.out.println("找"+end11+"枚1");
        

	}

}
