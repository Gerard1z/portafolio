package com.algoritmo1;

public class Cadenita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String cadenita="Una mañana, tras un sueño intranquilo, Gre" + 
				"gorio Samsa se despertó convertido en un" + 
				"monstruoso insecto. Estaba echado de espald" + 
				"as sobre un duro caparazón y, al alzar la" + 
				"cabeza, vio su vientre convexo y oscuro, surcado" + 
				"por curvadas callosidades, sobre el cual" + 
				"casi no se aguantaba la colcha, que estaba a pun" + 
				"to de escurrirse hasta el suelo. Numerosas" + 
				"patas, penosamente delgadas en comparación al" + 
				" grosor normal de sus piernas, se agitaban" + 
				"sin concierto.";
				
		String cadenita2="Gregorio miró hacia la ventana; estaba nubla\n" + 
				"do, y sobre el cinc del" + 
				"alféizar repiqueteaban" + 
				"las gotas de lluvia, lo que le hi" + 
				"zo sentir una gran melancolía.";
		
		System.out.println(cadenita);
		System.out.println(cadenita2);
		
		System.out.println("la cantidad de caracteres es:"+cadenita.length());
		System.out.println("la cantidad de caracteres es:"+cadenita2.length());
		System.out.println("esta la cacenita vacia:"+cadenita.isEmpty());
		System.out.println("caracter en la posicion 10:"+cadenita.charAt(10));
		System.out.println("cadenita en mayusculas:"+cadenita.toUpperCase());
		System.out.println("cadenita eb minuscula:"+cadenita.toLowerCase());
		System.out.println("la palabra melancolía de cadenita 2 comienza en :"+cadenita2.indexOf("miró"));
		
		//ejercico con vectores de cadena 
		int[] vectorNumeros = {45,32,67,81,24,1,7,85,23,18};
		int menor=vectorNumeros[0];
		int mayor=vectorNumeros[1];
		int temp=0;
		System.out.println("vector Desordenado");
		for (int i=0; i<vectorNumeros.length;i++)
		{
			System.out.print(vectorNumeros[i]+" ");
		}
		
		for (int i=0; i<vectorNumeros.length;i++)
			{
				for (int j=1; j<vectorNumeros.length;j++)
					{
						if(vectorNumeros[i]<vectorNumeros[j])
						{
							temp=vectorNumeros[j];
							vectorNumeros[j]=vectorNumeros[i];
							vectorNumeros[i]=temp;
						}
					}
				
			}
		System.out.println("vector ordenado");
		for (int i=0; i<vectorNumeros.length;i++)
			{
				System.out.print(vectorNumeros[i]+" ");
			}
	}

}
