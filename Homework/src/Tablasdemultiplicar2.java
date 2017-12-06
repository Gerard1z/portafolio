import java.util.*;

public class Tablasdemultiplicar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Hasta que tabla de  multiplica quieres: ");
        n = sc.nextInt();
        System.out.println("ESTAS SON LAS TABLAS:  ");
        
       
        for(int a = 1; a<=n; a++){
        
        	for(int i = 1; i<=12; i++){
             System.out.println(a +" * "+i+" = " +a*i);
        }
        	  System.out.println();
	    }
	}

}
