package semana3;
import java.util.*;
public class FigurasApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("0 circulo - 1 rectangulo - 2 cuadrado - 3 trapecio - 4 rombo");
		int opc = sc.nextInt();
		
		switch(opc)
		{
			case 0: Circulo fig = new Circulo();
					System.out.println("Ingresa el radio del circulo");
					fig.setRadio(sc.nextInt());
					fig.calculaAreaCirculo();
					fig.calculaPerimetroCirculo();
					System.out.println("El area del circulo es "+fig.getArea());
					System.out.println( "El perimetro del circulo es "+fig.getPerimetro());
					break;
			
			case 1: Rectangulo fig1 = new Rectangulo();
					System.out.println("Ingresa la altura del rectangulo");
					fig1.setAlturaRectangulo(sc.nextInt());
					System.out.println("Ingresa la base del rectangulo");
				    fig1.setBaseRectangulo(sc.nextInt());	
					fig1.calcularAreaRectangulo();
					fig1.calcularPerimetroRectangulo();
					System.out.println("El area del rectangulo es "+fig1.getArea());
					System.out.println("El perimetro del rectangulo es "+fig1.getPerimetro());
					break;
					
			case 2: Cuadro fig2 = new Cuadro();
					System.out.println("Ingrese lado del cuadro");
                    	fig2.setLadoCuadro(sc.nextInt());
					fig2.calcularAreaCuadro();
					fig2.calcularPerimetroCuadro();
					System.out.println("El area del cuadro es "+fig2.getArea());
					System.out.println("El perimetro del cuadro es "+fig2.getPerimetro());
					break;
					
			case 3: Trapecio fig3 = new Trapecio();
			        System.out.println("Ingresa base mayor");
					fig3.setBaseMayor(sc.nextInt());
					System.out.println("Ingrese base menor");
					fig3.setBaseMenor(sc.nextInt());
					System.out.println("Ingrese altura");
					fig3.setAlturaTrapecio(sc.nextInt());
					System.out.println("Ingrese lado");
					fig3.setLadoTrapecio(sc.nextInt());
					fig3.calcularAreaTrapecio();
					fig3.calcularPerimetroTrapecio();
					System.out.println("El area del trapecio es "+fig3.getArea());
					System.out.println("El perimetro del trapecio es "+fig3.getPerimetro());
					break;
		
			case 4:	Rombo fig4 = new Rombo();
			 		System.out.println("Ingresa diagonal mayor");
					fig4.setDiagonalMayor(sc.nextInt());
					System.out.println("Ingresa diagonal menor");
					fig4.setDiagonalMenor(sc.nextInt());
					System.out.println("Ingresa lado del rombo");
					fig4.setLadoRombo(sc.nextInt());
					fig4.calcularAreaRombo();
					fig4.calcularPerimetroRombo();
					System.out.println("El area del rombo es "+fig4.getArea());
					System.out.println("El perimetro del rombo es "+fig4.getPerimetro());
					break;
		}
	}

}
