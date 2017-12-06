package pruebaNombres.Sinmetodos;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cuantasVeces;
		cuantasVeces = new Scanner (System.in);
		int nNames=0;
		
		System.out.println("how many names do you want to capture:");
		nNames=cuantasVeces.nextInt();
		
		
		ArrayList<String> lstNames = new ArrayList<String>();
		for(int i=0;i<nNames;i++)
		{
				System.out.println("input a name:");
				lstNames.add(cuantasVeces.next());
		}
		
		Iterator contador = lstNames.iterator();
		while(contador.hasNext())
		{
			System.out.print(contador.next()+"   ");
		}
		
		
		
		cuantasVeces.close();
		contador=null;
		lstNames = null;
		
	}

}
