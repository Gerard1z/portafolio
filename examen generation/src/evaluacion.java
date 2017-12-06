import java.util.Scanner;
public class evaluacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String snombre;
		System.out.println("ingresa tu nombre");
		snombre=sc.nextLine();
		
		byte bmen;
		byte bper;
		byte bres;
		byte bori;
		byte bcom;
		byte btra;
		byte bges;
		byte bdet;
		
		
		System.out.println("calificaion mentalidad de crecimiento");
		bmen=sc.nextByte();
		while (bmen !=1 && bmen !=2 && bmen !=3 && bmen !=4) {
			System.out.println("Escribe solo del 1 al 4");
			bmen= sc.nextByte();	
		}
		if(bmen==1)
		{ System.out.println("rojo");
		}
		if(bmen==2)
		{ System.out.println("amarillo");
		}
		if(bmen==3)
		{ System.out.println("verde");
		}
		if(bmen==4)
		{ System.out.println("azul");
		}	
		
		System.out.println("calificaion persistencia");
		bper=sc.nextByte();
		while (bper !=1 && bper !=2 && bper !=3 && bper !=4) {
			System.out.println("Escribe solo del 1 al 4");
			bper= sc.nextByte();	
		if(bper==1)
		{ System.out.println("rojo");
		}
		if(bper==2)
		{ System.out.println("amarillo");
		}
		if(bper==3)
		{ System.out.println("verde");
		}
		if(bper==4)
		{ System.out.println("azul");
		}	
		
		System.out.println("calificaion resposabilidad personal");
		bres=sc.nextByte();
		while (bres !=1 && bres !=2 && bres !=3 && bres !=4) {
			System.out.println("Escribe solo del 1 al 4");
			bres= sc.nextByte();	
		if(bres==1)
		{ System.out.println("rojo");
		}
		if(bres==2)
		{ System.out.println("amarillo");
		}
		if(bres==3)
		{ System.out.println("verde");
		}
		if(bres==4)
		{ System.out.println("azul");
		}	
		
		System.out.println("calificaion orientacion al futuro");
		bori=sc.nextByte();
		while (bori !=1 && bori !=2 && bori !=3 && bori !=4) {
			System.out.println("Escribe solo del 1 al 4");
			bori= sc.nextByte();	
		}
		if(bori==1)
		{ System.out.println("rojo");
		}
		if(bori==2)
		{ System.out.println("amarillo");
		}
		if(bori==3)
		{ System.out.println("verde");
		}
		if(bori==4)
		{ System.out.println("azul");
		}	
		
		System.out.println("calificaion comunicacion");
		bcom=sc.nextByte();
		while (bcom !=1 && bcom !=2 && bcom !=3 && bcom !=4) {
			System.out.println("Escribe solo del 1 al 4");
			bcom= sc.nextByte();	
		}
		if(bcom==1)
		{ System.out.println("rojo");
		}
		if(bcom==2)
		{ System.out.println("amarillo");
		}
		if(bcom==3)
		{ System.out.println("verde");
		}
		if(bcom==4)
		{ System.out.println("azul");
		}	
		
		System.out.println("calificaion trabajo en equipo");
		btra=sc.nextByte();
		while (btra !=1 && btra !=2 && btra !=3 && btra !=4) {
			System.out.println("Escribe solo del 1 al 4");
			btra= sc.nextByte();	
		}
		if(btra==1)
		{ System.out.println("rojo");
		}
		if(btra==2)
		{ System.out.println("amarillo");
		}
		if(btra==3)
		{ System.out.println("verde");
		}
		if(btra==4)
		{ System.out.println("azul");
		}	
		
		System.out.println("calificaion gestion de tiempo");
		bges=sc.nextByte();
		while (bges !=1 && bges !=2 && bges !=3 && bges !=4) {
			System.out.println("Escribe solo del 1 al 4");
			bges= sc.nextByte();	
		if(bges==1)
		{ System.out.println("rojo");
		}
		if(bges==2)
		{ System.out.println("amarillo");
		}
		if(bges==3)
		{ System.out.println("verde");
		}
		if(bges==4)
		{ System.out.println("azul");
		}	
		
		System.out.println("calificaion orientacion al detalle");
		bdet=sc.nextByte();
		while (bdet !=1 && bdet !=2 && bdet !=3 && bdet !=4) {
			System.out.println("Escribe solo del 1 al 4");
			bdet= sc.nextByte();	
		if(bdet==1)
		{ System.out.println("rojo");
		}
		if(bdet==2)
		{ System.out.println("amarillo");
		}
		if(bdet==3)
		{ System.out.println("verde");
		}
		if(bdet==4)
		{ System.out.println("azul");
		}	
		
		
		System.out.println("calificaion General");
		int suma;
		suma=(bmen+bper+bres+bori+bcom+btra+bges+bdet);
		System.out.println(suma);
		
		System.out.println("calificaion de mentalidades generation");
		int suma1=bmen+bper+bres+bori;
		double suma1f=Double.parseDouble(Integer.toString(suma1));
		System.out.println(suma1f/4);
		
		System.out.println("calificaion de mentalidades backend");
		int suma2=bcom+btra+bges+bdet;
		double suma2f=Double.parseDouble(Integer.toString(suma2));
		System.out.println(suma2f/4);
		
		
		}
		}
		}
		}
		}
	}

