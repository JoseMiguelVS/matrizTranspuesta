import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matrizTranspuesta {
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    // metodo para llenar datos del array
    public static int[][] llenarDatos(int[][] A) throws IOException {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println("Escribe el valor [" + i + "]" + "[" + j + "]");
                entrada = bufer.readLine();
                A[i][j] = Integer.parseInt(entrada);
            }
        }
        return A;
    }

    // metodo para hacer transponer
    public static int[][] transponer(int[][] A) {
        int[][] T = new int[A[0].length][A.length]; // SE DECLARA T CON LO INVERSO DE A
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                T[j][i] = A[i][j]; // SE PONE EL VALOR AL CONTRARIO == T[1][2] = A[2][1]
            }
        }
        return T; // Se regresa la matriz transpuesta
    }

    public static void imprimirA(int[][] A) {
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void imprimirT(int[][] T) {
        System.out.println();
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // metodo main
    public static void main(String[] args) throws IOException {
        int r, c;
        int[][] A;
        int[][] T;
        System.out.println("Contruccion de la Matriz A");
        System.out.println("Escribe el num de renglones");
        entrada = bufer.readLine();
        r = Integer.parseInt(entrada);

        System.out.println("Escribe el num de columnas");
        entrada = bufer.readLine();
        c = Integer.parseInt(entrada);

        A = new int[r][c];

        A = llenarDatos(A);
        T = transponer(A);

        System.out.println("Matriz A:");
        imprimirA(A);
        System.out.println();
        System.out.println("Matriz T:");
        imprimirT(T);
    }
}