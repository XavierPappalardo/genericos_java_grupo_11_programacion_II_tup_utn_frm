import Ejercicio_03.*;

//Clase Main del proyecto

public class Main {

    //Método main

    public static void main(String[] args){

        //Ejercicio 3

        //Instanciamos un nuevo par

        ParNumeros<Integer, Integer> parNumeros = new ParNumeros();

        //Setteamos ambos números

        parNumeros.setNumero1(33);

        parNumeros.setNumero2(22);

        //Mostramos el par ordenado

        parNumeros.mostrarPar(parNumeros.getNumero1(), parNumeros.getNumero2());

        //Invertimos el par

        parNumeros.invertir(parNumeros.getNumero1(), parNumeros.getNumero2());

        //Mostramos el par con el nuevo orden

        parNumeros.mostrarPar(parNumeros.getNumero1(), parNumeros.getNumero2());

    }

}
