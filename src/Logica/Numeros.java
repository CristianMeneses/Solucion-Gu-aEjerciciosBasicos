/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

public class Numeros {

    // Ejercicio 18
    public void HHMMSS() {
        int h, m, s;
        s = 3700;
        h = s / 3600;
        s = s % 3600;
        m = s / 60;
        s = s % 60;
        System.out.println("El tiempo en formato HHMMSS es:  " + h + ":" + m + ":" + s);
    }

    // Ejercicio 20
    public float metros(float x) {
        return (float) (x * 3.28);
    }

    //Ejercicio 24
    public String positivoNegativo(int a) {
        if (a < 0) {
            return "Es negativo";
        } else if (a > 0) {
            return "Es Positivo";
        } else {
            return "El numero es 0";
        }
    }

    // Ejercicio 28
    public void DSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Es lunes!");
                break;
            case 2:
                System.out.println("Es martes!");
                break;
            case 3:
                System.out.println("Es miercoles!");
                break;
            case 4:
                System.out.println("Es jueves!");
                break;
            case 5:
                System.out.println("Es viernes!");
                break;
            case 6:
                System.out.println("Es sabado!");
                break;
            case 7:
                System.out.println("Es domingo!");
                break;

        }
    }

    // Ejercicio 30
    public float[] mayorMenor(float x, float y) {
        float A[] = new float[2];
        if (x < y) {
            A[0] = x;
            A[1] = y;
        } else {
            A[0] = y;
            A[1] = x;
        }

        return A;
    }

    //Ejercicio 32
    public String siguienteSegundo(int a, int b, int c) {

        c = c + 1;
        if (c > 59) {
            c = 0;
            b = b + 1;
            if (b > 59) {
                b = 0;
                a = a + 1;
                if (a > 23) {
                    a = 0;
                    b = 0;
                    c = 0;
                }
            }
        }
        return Integer.toString(a) + ":" + Integer.toString(b) + ":" + Integer.toString(c);
    }

    // Ejercicio 34
    public void cicloDoWhile() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 11);
    }

    // Ejercicio 38
    public int sumatoria() {
        int k;
        k = (10 * (10 + 1));
        k /= 2;

        return k;
    }

    // Ejercicio 42
    public int sumaNumeros(int a) {
        int x = 0;
        for (int i = 0; i <= a; i++) {
            x = x + i;
        }
        return x;
    }

    // Ejercicio 44
    public int factorial(int a) {
        int x = 1;
        for (int i = 1; i <= a; i++) {
            x = x * i;
        }
        return x;
    }

    // Ejercicio 48
    public boolean NumerosPrimos(int num) {

        if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
            return false;
        } else {
            return true;
        }
    }

    //Ejercicio 88
    public int Pow(int a, int b) {
        int pow = a;
        for (int i = 1; i < b; i++) {
            pow *= a;
        }
        return pow;
    }

    // Ejercicio 90
    public boolean validar(char p) {

        return (p == '0' || p == '1' || p == '2' || p == '3'
                || p == '4' || p == '5' || p == '6'
                || p == '7' || p == '8' || p == '9');

    }
    
    // Ejercicio 92
    public double descuento(int a, float b) {
        
        double total = 0;
        if (a > 6) {
            total = ((b * a) * (0.96));
        }
        if (a > 12) {
            total = ((b * a) * (0.90));
        }
        return total;
    }

}
