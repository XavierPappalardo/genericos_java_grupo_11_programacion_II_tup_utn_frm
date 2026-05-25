package Ejercicio_04;
import java.util.List;

public class Calculadora<T extends Number & Comparable<T>> {

    // Metodo Promedio

    public double promedio (List<T> numeros) {
        double total = 0;
        for (T num : numeros) {
            total += num.doubleValue();
        }
        return total / numeros.size();
    }

    // Metodo Maximo

    public T maximo(List<T> numeros) {
        T max = numeros.get(0);
        for (T num : numeros) {
            if (num.compareTo(max) > 0) {
                max = num;
            }
        }
        return max;
    }
}
