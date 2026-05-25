package Ejercicio_03;

//Clase genérica ParNumeros

public class ParNumeros<A,B> {

    //Atributos (Los números del par)

    private A numero1;

    private B numero2;

    //Getters

    public A getNumero1() {
        return numero1;
    }

    public B getNumero2() {
        return numero2;
    }

    //Setters

    public void setNumero1(A numero1) {

        //Condición de que sea un Integer para que sea setteado

        if (numero1 instanceof Integer){

            this.numero1 = numero1;

        } else{

            //Excepción en caso de que no cumpla la condición

            throw new IllegalArgumentException("El dato ingresado debe ser un número entero.");

        }
    }

    public void setNumero2(B numero2) {

        //Condición de que sea un Integer para que sea setteado

        if (numero2 instanceof Integer){

            this.numero2 = numero2;

        } else{

            //Excepción en caso de que no cumpla la condición

            throw new IllegalArgumentException("El dato ingresado debe ser un número entero.");

        }
    }

    //Método mostrarPar

    public void mostrarPar(A numero1, B numero2) {

        //Condición de que el usuario haya ingresado ambos números del par para mostrarlo

        if (this.numero1 != null && this.numero2 != null) {

            //Muestra el par ordenado

            System.out.println("-------PAR DE NÚMEROS--------");
            System.out.println("Número 1: " + this.numero1 + "  |  Número 2: " + this.numero2 + "\n");

        } else {

            //Excepción en caso de que no cumpla la condición

            throw new IllegalArgumentException("El par debe estar completo para mostrarlo");

        }

    }

    //Método invertir

    public void invertir(A numero1, B numero2){

        //Condición de que el usuario haya ingresado ambos números del par para invertirlo

        if (this.numero1 != null && this.numero2 != null){

            A aux_num1 = this.numero1;
            this.numero1 = (A) this.numero2;
            this.numero2 = (B) aux_num1;

        } else {

            //Excepción en caso de que no cumpla la condición

            throw new IllegalArgumentException("El par debe estar completo para mostrarlo");

        }

    }

}