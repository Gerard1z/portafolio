package com.algoritmo1;

import java.util.Scanner;

public class Algoritmo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarando variables primitivas
		byte numero1;
		int numero2;
		short numero3;
		long numero4;
		float numero5;
		double numero6;
		boolean isVariable;
		char letra;
		final int  numero7= 10;
		
		//inicializamnos objetos 
		numero1= 127;
		numero2= 128;
		numero3= 129;
		numero4= 200;
		numero5= 0.200f;
		numero6= 3.1416;
		isVariable= true;
		letra= 'X';
		
		//mostrar el valor de las variables primitivas
		System.out.println("El valor de la vatriable byte es:"+ numero1+" que chido");
		System.out.println("El valor de la vatriable int es:"+ numero2+" que chido");
		System.out.println("El valor de la vatriable short es:"+ numero3+" que chido");
		System.out.println("El valor de la vatriable long es:"+ numero4+" que chido");
		System.out.println("El valor de la vatriable float es:"+ numero5+" que chido");
		System.out.println("El valor de la vatriable double es:"+ numero6+" que chido");
		System.out.println("El valor de la vatriable boolean es:"+ isVariable+" que chido");
		System.out.println("El valor de la vatriable char es:"+ letra+" que chido");
		System.out.println("El valor de la vatriable char es:"+ numero7+" que chido");
		
		
				
		
		//declarando objetos
		String cadena;
		
		//inizializamos objetos 
		cadena = new String();
		cadena = "chido";
		
		System.out.println("el valor del objeto String es"+cadena+ "que chido");
		
		int operaciones1 = numero1+numero2;
		System.out.println("el valor de la suma es"+operaciones1);
		
		//-------------------------
		Scanner teclado = new Scanner (System.in);
		System.out.println("ingresa la cantidad de numeros a sumar:");
		int numero=0;
		numero = teclado.nextInt();
		System.out.println("la cantidad de numeros a sumar es:"+ numero);
		int suma=0;
		int numeroIntroducido=0;
		
		for (int i=0;i<numero;i++) 
		{
			System.out.println("digita el numero:");
			numeroIntroducido= teclado.nextInt();
			suma=suma+numeroIntroducido;
		}
		
		System.out.println(" la sumatoria de  los numero es: "+ suma);
		suma=0;
		numeroIntroducido=0;
		isVariable=true;
		int contador=1;
		int vueltas=0;
		System.out.println("ingrese la cantidad de numeros a sumar: ");
		vueltas = teclado.nextInt();
		while(isVariable)
		{
			System.out.println("digita el numero: ");
			numeroIntroducido=teclado.nextInt();
			suma=suma+numeroIntroducido;
			contador++;
			if(contador>=vueltas)
			{
				isVariable=false;
			}
		}
		System.out.println("la sumatoria de los numeros es: "+suma);
		
		suma=0;
		numeroIntroducido=0;
		isVariable=true;
		contador=0;
		vueltas=0;
		System.out.println("ingresa la cantidad de numero a sumar: ");
		vueltas = teclado.nextInt();
		do 
		{
			System.out.println("digita numero: ");
			numeroIntroducido = teclado.nextInt();
			suma=suma+numeroIntroducido;
			contador++;
			if(contador>=vueltas)
			{
				isVariable=false;
			}
				
		}while(isVariable);
		System.out.println("el resultado de la suma es : "+suma);
		
		suma=0;
		int cantidadCincos=0;
		System.out.println("sumar los multiplos del 5 desde el 0 hasta el 100");
		for(int i=0;i<=1530;i++)
		{
			if(i%5==0)
			{
				suma=suma+i;
				cantidadCincos=cantidadCincos+1;
			}
		}
		System.out.println("la suma de los cincos es:"+ suma);
		System.out.println("la cantidad de cinco es:"+ cantidadCincos); 
	
		//algoritmo de los numeros primos 
		
		boolean isPrimo=false;
		System.out.println("Introduce un numero y te dire si es primo:");
		numeroIntroducido=teclado.nextInt();
		for(int i=2;i<numeroIntroducido;i++)
		{
			if(numeroIntroducido%i==0)
			{
				isPrimo=false;
			}
		}
		System.out.println("el numero es primo?: "+isPrimo);
		
		//algoritmo para pedir un numero al usuario y preguntar 
		char respuesta ='s';
		double numeroIntroducidoDouble;
		do
		{
			System.out.println("introduce un numero:");
			numeroIntroducidoDouble=teclado.nextInt();
			System.out.println("la raiz cuadrada es: "+Math.sqrt(numeroIntroducidoDouble));
			System.out.println("el cuadrado es:"+Math.pow(numeroIntroducido,2));
			System.out.println("el cuadrado es:"+Math.pow(numeroIntroducido,3));
			System.out.println("el redondeo hacia arriba es:"+Math.ceil(numeroIntroducidoDouble));
			System.out.println("el redondeo hacia abajo es:"+Math.floor(numeroIntroducidoDouble));
			System.out.println("el redondeo :"+Math.round(numeroIntroducidoDouble));
			System.out.println("el absoluto es:"+Math.abs(numeroIntroducidoDouble));
			
			
			System.out.println("desea ingresar otro numero s o n ?:");
			respuesta=teclado.next().charAt(0);
			
			
		}while (respuesta=='s');
		
		
		
		}


}
