package Clase3;

import java.util.Scanner;

public class ejercicio3 {

    public static void main (String args[]) {

        int numero;
        int numeroDoble;

        Scanner input=new Scanner(System.in);

        System.out.println("Este programa le solicitara un numero para calcular su doble e imprimirlo");
        System.out.println("Por favor, ingrese un numero");

        numero=input.nextInt();

        numeroDoble=retornarDoble(numero);
        System.out.println("El doble del numero: " + numero + " es: " + numeroDoble);

    }

    //Declaro metodo publico s/retorno que me permita calcular el doble del numero ingresado
    public static int retornarDoble (int numero) {
        return numero*2;
    }
}