import java.util.Scanner;
public class Array2D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�JA��MxP�x�}");
		int M=scn.nextInt();
		int P=scn.nextInt();
		System.out.println("�п�JB��PxN�x�}");
		int N=scn.nextInt();
        int a[][]= new int[M][P];
        int b[][]= new int[P][N];
        int c[][]= new int[M][N];
        int i =0; int j =0; int k =0;
        System.out.println("�п�JA�x�}���Ʀr");
        for(i=0;i<M;i++){
        	for(j=0;j<P;j++){
        		a[i][j] = scn.nextInt();
        	}
        }
        
        System.out.println("�п�JB�x�}���Ʀr");
        for(k=0;k<N;k++){
        	for(j=0;j<P;j++){
        		b[k][j] = scn.nextInt();
        	}
        }
        
        for(i=0;i<M;i++){
        	for(k=0;k<N;k++){
        		for(j=0;j<P;j++){
        			c[j][k]=c[j][k]+a[i][j]*b[j][k];
        		}
        		System.out.print(c[j][k]+"  ");
        	}
        	System.out.println(" ");
        }
        
        
        
        
        
        
        
        
        
	}

}
