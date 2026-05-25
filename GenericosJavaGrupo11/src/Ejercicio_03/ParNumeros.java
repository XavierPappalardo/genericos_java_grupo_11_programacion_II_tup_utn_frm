package Ejercicio_03;

public class ParNumeros<A,B> {

    private A numero1;

    private B numero2;

    public ParNumeros(A numero1, B numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public A getNumero1() {
        return numero1;
    }

    public B getNumero2() {
        return numero2;
    }

    public void mostrarPar(A numero1, B numero2) {

        if (this.numero1 != null && this.numero2 != null) {

            System.out.println("-------PAR DE NÚMEROS--------");
            System.out.println("Número 1: " + this.numero1 + "  |  Número 2: " + this.numero2 + "\n");

        } else {

            System.out.println("No se pueden invertir los números si el par está incompleto.\n");


        }

    }

    public void invertir(A numero1, B numero2){

        if (this.numero1 != null && this.numero2 != null){

            A aux_num1 = this.numero1;
            this.numero1 = (A) this.numero2;
            this.numero2 = (B) aux_num1;

        } else {

            System.out.println("No se pueden invertir los números si el par está incompleto.\n");

        }

    }

}