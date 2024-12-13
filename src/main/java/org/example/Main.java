package org.example;
import java.util.Scanner;
public class Main {
    static double calculo_area_circulo(double radio) {
        return (Math.PI * radio * radio);
    }
    static double calculo_area_cuadrado(double lado) {
        return (lado * lado);
    }
    static double calculo_area_rectangulo(double base, double altura) {
        return (base * altura);
    }
    static double calculo_area_triangulo(double base, double altura) {
        return (base * altura / 2);
    }
    static double calculo_area_trapecio(double base_mayor, double base_menor, double altura) {
        return ((base_mayor + base_menor) * altura /2);
    }
    public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);
    boolean salir = true;
    while (salir) {
        System.out.println("Elige 1, 2, 3, 4, 5 o 6 salir.");
        double respuesta = sca.nextDouble();
        switch ((int) respuesta) {
            case 1:
                System.out.print("Dime el radio: ");
                double radio = sca.nextDouble();
                System.out.println(calculo_area_circulo(radio));
                break;
            case 2:
                System.out.print("Dime el lado: ");
                double lado = sca.nextDouble();
                System.out.println(calculo_area_cuadrado(lado));
                break;
            case 3:
                System.out.print("Dime la base: ");
                double base = sca.nextDouble();
                System.out.print("Dime la altura: ");
                double altura = sca.nextDouble();
                System.out.println(calculo_area_rectangulo(base, altura));
                break;
            case 4:
                System.out.print("Dime la base: ");
                double base2 = sca.nextDouble();
                System.out.print("Dime la altura: ");
                double altura2 = sca.nextDouble();
                System.out.println(calculo_area_triangulo(base2, altura2));
                break;
            case 5:
                System.out.print("Dime la base mayor: ");
                double base_mayor = sca.nextDouble();
                System.out.print("Dime la base menor: ");
                double base_menor = sca.nextDouble();
                System.out.print("Dime la altura: ");
                double altura3 = sca.nextDouble();
                System.out.println(calculo_area_trapecio(base_mayor, base_menor, altura3));
                break;
            case 6:
                salir = false;
        }
    }
    }
}