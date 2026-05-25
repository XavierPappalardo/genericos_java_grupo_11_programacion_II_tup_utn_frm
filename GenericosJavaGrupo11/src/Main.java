import Ejercicio_03.*;
import Ejercicio_04.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Clase Main del proyecto

public class Main {

    //Método main

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Ejercicio 3

        System.out.println("Ingrese 2 numeros enteros: ");

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        //Instanciamos un nuevo par

        ParNumeros<Integer, Integer> parNumeros = new ParNumeros();

        //Setteamos ambos números

        parNumeros.setNumero1(numero1);

        parNumeros.setNumero2(numero2);

        //Mostramos el par ordenado

        parNumeros.mostrarPar(parNumeros.getNumero1(), parNumeros.getNumero2());

        //Invertimos el par

        parNumeros.invertir(parNumeros.getNumero1(), parNumeros.getNumero2());

        //Mostramos el par con el nuevo orden

        parNumeros.mostrarPar(parNumeros.getNumero1(), parNumeros.getNumero2());

        //  Ejercicio 4:


        // Menu
        System.out.println("Calculadora de Genericos");
        System.out.println("Que tipo de numeros vas a ingresar?");
        System.out.println("1- Numeros Enteros (int)");
        System.out.println("2- Numeros Decimales (Double)");

        int opcionElegida = sc.nextInt();
        System.out.println("Cuantos numeros quieres ingresar?: ");
        int cantidadNumeros = sc.nextInt();

        // Creador de Listas - Ejecucion de Metodos
        if (opcionElegida == 1) {
            // Lista de Enteros
            List<Integer> numerosEnteros = new ArrayList<>();
            for(int i = 0; i < cantidadNumeros; i++) {
                System.out.println("Ingrese un numero " + (i + 1) + ": ");
                numerosEnteros.add(sc.nextInt());
            }

            Calculadora<Integer> calc = new Calculadora<Integer>();
            System.out.println("\nLista ingresada: " + numerosEnteros);
            System.out.println("Promedio: " + calc.promedio(numerosEnteros));
            System.out.println("Maximo " + calc.maximo(numerosEnteros));
        } else if (opcionElegida == 2) {
            // Lista de Decimales
            List<Double> numerosDecimales = new ArrayList<>();
            for (int i = 0; i < cantidadNumeros; i++) {
                System.out.println("Ingrese un numero " + (i + 1) + ": ");
                numerosDecimales.add(sc.nextDouble());
            }

            Calculadora<Double> calc = new Calculadora<Double>();
            System.out.println("\nLista ingresada: " + numerosDecimales);
            System.out.println("Promedio: " + calc.promedio(numerosDecimales));
            System.out.println("Maximo: " + calc.maximo(numerosDecimales));
        } else {
            System.out.println("Opcion no valida");
        }

        sc.close();
    }
}
