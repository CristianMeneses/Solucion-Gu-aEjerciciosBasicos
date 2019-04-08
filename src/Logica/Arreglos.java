/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Scanner;

public class Arreglos {

    Scanner num = new Scanner(System.in);

    //Ejercicio 26
    public void ParImpar(int a) {

        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    // Ejercicio 36
    public int Pares() {
        for (int a = 1; a <= 25; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
        return 0;
    }

    // Ejercicio 46
    public float Media() {
        float a, x, aux = 0;
        System.out.println("Ingrese la cantidad de numeros a evaluar");
        a = num.nextFloat();
        for (int i = 0; i < a; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            x = num.nextFloat();
            aux += x;
        }
        x = aux / a;

        return x;
    }

    // Ejercicio 50
    public float[][] sumaMedia() {
        float M[][] = {{0, 0}, {0, 0}};
        int contadorPar = 0, contadorImpar = 0;
        for (int i = 1; i < 200; i++) {
            if (i % 2 == 0) {
                M[0][0] += i;
                contadorPar++;
            } else {
                M[1][0] += i;
                contadorImpar++;
            }
        }
        M[0][1] = M[0][0] / contadorPar;
        M[1][1] = M[1][0] / contadorImpar;
        return M;
    }

    // Ejercicio 52
    public float sumaNegativos(float a[]) {
        float x = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] < 0) {
                x = (x + a[i]);
            }
        }
        return x;
    }

    // Ejercicio 54
    public void arregloPares() {
        int[] a = new int[50];
        int i = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                a[i] = j;
                i++;
            }
        }
        for (i = 0; i < 50; i++) {
            System.out.println(a[i]);

        }
    }

    // Ejercicio 56
    public void CopiaConsecutivos(int a) {
        int arrayX[] = new int[5];
        int arrayY[] = new int[5];
        a += 1;
        for (int i = 0; i < 5; i++) {
            arrayX[i] = a;
            a++;
        }
        for (int i = 0; i < 5; i++) {
            arrayY[i] = arrayX[i];
            System.out.println("a+" + (i + 1) + "= " + arrayX[i]);
        }

    }

    //Ejercicio 58
    public int[] SumArreglo() {
        int a, b, array[] = new int[20];
        a = 2;
        b = 0;
        for (int i = 0; i < 20; i++) {
            array[i] = a;
            b += a;
            a += 2;
        }
        return array;
    }

    // Ejercicio 60 a
    public int posicionMayor(int a[], int n) {
        int cont = 0, base = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > base) {
                cont = i;
                base = a[i];
            }
        }
        return cont + 1;
    }

    // Ejercicio 60 b (62)
    public int posicionMenor(int[] b) {
        int cont = 0, base = b[0];

        for (int i = 1; i < 10; i++) {
            if (b[i] < base) {
                cont = i;
                base = b[i];
            }
        }
        return cont + 1;
    }

    //Ejercicio 64
    public String posicionMayorMatriz(int[][] a) {
        int mayor = 0;
        int columna = 0;
        int fila = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] > mayor) {
                    mayor = (a[i][j]);
                    columna = i + 1;
                    fila = j + 1;
                }
            }
        }
        String texto = Integer.toString(columna);
        String texto1 = Integer.toString(fila);
        String textoFinal = texto + "," + texto1;
        return textoFinal;
    }

    //Ejercicio 66
    public int[][] MultMatriz() {

        int array[][] = new int[3][3];
        array[0][0] = 5;
        array[0][1] = 6;
        array[0][2] = 13;
        array[1][0] = 14;
        array[1][1] = 2;
        array[1][2] = 4;
        array[2][0] = 21;
        array[2][1] = 7;
        array[2][2] = 6;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] *= 2;
            }
        }
        return array;
    }

    //Ejercicio 68
    public void SumMatriz() {
        int a, b, array[][] = new int[2][5];

        array[0][0] = 5;
        array[0][1] = 6;
        array[0][2] = 7;
        array[0][3] = 9;
        array[0][4] = 0;
        array[1][0] = 11;
        array[1][1] = 8;
        array[1][2] = 2;
        array[1][3] = 0;
        array[1][4] = 0;
        for (int i = 0; i < 4; i++) {
            array[0][4] += array[0][i];
        }
        for (int i = 0; i < 4; i++) {
            array[1][4] += array[1][i];
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Ejercicio 70
    public float[][] sumaMatriz(float M[][]) {
        M[0][0] = 2;
        M[0][1] = 9;
        M[0][2] = 11;
        M[0][3] = 0;

        M[1][0] = 1;
        M[1][1] = 12;
        M[1][2] = 4;
        M[1][3] = 0;

        M[2][0] = 21;
        M[2][1] = 17;
        M[2][2] = 8;
        M[2][3] = 0;

        M[3][0] = 2;
        M[3][1] = 39;
        M[3][2] = 5;
        M[3][3] = 0;

        M[4][0] = 0;
        M[4][1] = 0;
        M[4][2] = 0;
        M[4][3] = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                M[i][3] += M[i][j];
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                M[4][j] += M[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            M[4][3] += M[4][i];
        }
        for (int i = 0; i < 4; i++) {
            M[4][3] += M[i][3];
        }
        return M;
    }

    // Ejercicio 72
    public void arregloPrimos() {
        int[] a = new int[100];
        int divisores = 0;
        int primos = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores = divisores + 1;
                }
            }
            if (divisores == 2) {
                primos = primos + 1;
                a[primos] = i;
            }
            divisores = 0;
        }
        for (int i = 1; i <= 25; i++) {
            System.out.println(a[i]);
        }
    }

    //ejercicio 74
    public String cadenaInvertida(String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida + cadena.charAt(i);
        }
        return cadenaInvertida;
    }

    // Ejercicio 76
    public char[] sinEspacios(String palabra) {
        char[] A = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != ' ') {
                A[i] = palabra.charAt(i);
            }
        }

        return A;
    }

    //Ejercicio 78
    public char[] MayMin(String a) {
        char A[] = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(A[i])) {
                A[i] = Character.toLowerCase(A[i]);
            } else {
                A[i] = Character.toUpperCase(A[i]);
            }

        }
        return A;
    }

    //Ejercicio 80
    public void encriptacion(String A) {
        char c;
        int p;
        for (int i = 0; i < A.length(); i++) {
            c = A.charAt(i);
            if (i % 2 == 0) {
                p = (int) c + 2;
            } else {
                p = (int) c + 3;
            }
            c = (char) p;
            System.out.print(c);
        }
        System.out.println();
    }

    //Ejercicio 84
    public boolean compararFrase(String a, String b) {
        return a.equals(b);
    }

    //Ejercicio 82
    public int[] fraseAbecedario(String cadena) {
        char A[] = cadena.toCharArray();
        for (int i = 0; i < cadena.length() - 1; i++) {
            System.out.print(A[i]);
        }

        int Valor[] = new int[26];
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;
        for (int itera = 0; itera < cadena.length() - 1; itera++) {
            if (A[itera] == 'a' || A[itera] == 'A') {
                a++;
            } else if (A[itera] == 'b' || A[itera] == 'B') {
                b++;
            } else if (A[itera] == 'c' || A[itera] == 'C') {
                c++;
            } else if (A[itera] == 'd' || A[itera] == 'D') {
                d++;
            } else if (A[itera] == 'e' || A[itera] == 'D') {
                e++;
            } else if (A[itera] == 'f' || A[itera] == 'F') {
                f++;
            } else if (A[itera] == 'g' || A[itera] == 'G') {
                g++;
            } else if (A[itera] == 'h' || A[itera] == 'H') {
                h++;
            } else if (A[itera] == 'i' || A[itera] == 'I') {
                i++;
            } else if (A[itera] == 'j' || A[itera] == 'J') {
                j++;
            } else if (A[itera] == 'k' || A[itera] == 'K') {
                k++;
            } else if (A[itera] == 'l' || A[itera] == 'L') {
                l++;
            } else if (A[itera] == 'm' || A[itera] == 'M') {
                m++;
            } else if (A[itera] == 'n' || A[itera] == 'N') {
                n++;
            } else if (A[itera] == 'o' || A[itera] == 'O') {
                o++;
            } else if (A[itera] == 'p' || A[itera] == 'P') {
                p++;
            } else if (A[itera] == 'q' || A[itera] == 'Q') {
                q++;
            } else if (A[itera] == 'r' || A[itera] == 'R') {
                r++;
            } else if (A[itera] == 's' || A[itera] == 'S') {
                s++;
            } else if (A[itera] == 't' || A[itera] == 'T') {
                t++;
            } else if (A[itera] == 'u' || A[itera] == 'U') {
                u++;
            } else if (A[itera] == 'v' || A[itera] == 'V') {
                v++;
            } else if (A[itera] == 'w' || A[itera] == 'W') {
                w++;
            } else if (A[itera] == 'x' || A[itera] == 'X') {
                x++;
            } else if (A[itera] == 'y' || A[itera] == 'Y') {
                y++;
            } else if (A[itera] == 'z' || A[itera] == 'Z') {
                z++;
            }
        }
        System.out.println("B: "+b);
        Valor[0] = a;
        Valor[1] = b;
        Valor[2] = c;
        Valor[3] = d;
        Valor[4] = e;
        Valor[5] = f;
        Valor[6] = g;
        Valor[7] = h;
        Valor[8] = i;
        Valor[9] = j;
        Valor[10] = k;
        Valor[11] = l;
        Valor[12] = m;
        Valor[13] = n;
        Valor[14] = o;
        Valor[15] = p;
        Valor[16] = q;
        Valor[17] = r;
        Valor[18] = s;
        Valor[19] = t;
        Valor[20] = u;
        Valor[21] = v;
        Valor[22] = w;
        Valor[23] = x;
        Valor[24] = y;
        Valor[25] = z;

        return Valor;
    }

    // Ejercicio 86
    public boolean Palind(String palabra) {
        char[] A = palabra.toCharArray();
        char[] B = new char[palabra.length()];
        int k = palabra.length(), cont = 0;
        boolean pal = true;

        for (int i = 0; i < palabra.length(); i++) {
            if (A[i] != ' ') {
                B[k - 1] = A[i];
                k--;
                cont++;
            }
        }
        for (int i = 0; i < cont; i++) {
            if (A[i] == B[i]) {
                pal = true;
            } else {
                pal = false;
            }
        }
        return pal;
    }

}
