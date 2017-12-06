package pruebaNombres.conmetodos;
import java.util.*;


public class nombre {
	public static Scanner entrada= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nNames=0;
		ArrayList<String> lstNames = new ArrayList<String>();
		
		System.out.println("how many names do you want to capture:");
		nNames=entrada.nextInt();
		
		
		
		captureNames(nNames,lstNames);
		
		System.out.println(lstNames);
		
	}
		public static void captureNames(int quantityNames,
				ArrayList<String> lista)
		{
			for(int i=0;i<quantityNames;i++)
			{
					System.out.println("input a name:");
			        lista.add(entrada.next());
			}
		}

}
