
import java.util.Scanner;
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Hello, 請問您是?");
		String name = scn.next();
		System.out.println("Hi, "+name+" 您好!");
		System.out.println(name+" 很高興認識你,請問您是哪所高中畢業?");
		String school = scn.next();
		System.out.println(name+"原來你是"+school+"畢業的。"); 
		System.out.println("你現在讀哪個科系?");
		String A = scn.next();
		System.out.println("哇~~"+A+"可是熱門科系耶，你實在是太厲害了! :)");
		System.out.println("你畢業後要從事什麼工作?");	
		String B = scn.next();
		System.out.println(B+" 是個不錯的工作，真是羨慕你! :)");		
	}

}
