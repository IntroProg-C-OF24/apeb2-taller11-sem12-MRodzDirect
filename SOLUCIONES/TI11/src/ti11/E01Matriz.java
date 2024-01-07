
package ti11;
import java.util.Scanner;
public class E01Matriz {
    public static void main(String[] args) {
        int tam, tam2;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de las filas y columnas de las matrices (el mismo tamaño para ambas ;)");
        tam = sc.nextInt();
        tam2 = sc.nextInt();
        double[][] numPares = new double [tam][tam2];
        double[][] numImpares = new double [tam][tam2];
        double[][] promedios = new double [tam][tam2];
        generarPares(numPares);
        generarImpares(numImpares);
        System.out.printf("La matriz de pares es:\n%s",presentarMatrices(numPares));
        System.out.printf("La matriz de impares es:\n%s",presentarMatrices(numImpares));
        calcularPromedios(numPares, numImpares, promedios);
        System.out.printf("Los promedios de ambas matrices son:\n%s",presentarMatrices(promedios));

    }
    public static void generarPares(double numPares[][]) {
        for (int i = 0; i < numPares.length; i++) {
            for (int j = 0; j < numPares[i].length; j++) {
                numPares[i][j] = (i * numPares[i].length + j) * 2;
            }
        }
    }
      public static void generarImpares(double numImpares[][]) {
        for (int i = 0; i < numImpares.length; i++) {
            for (int j = 0; j < numImpares[i].length; j++) {
                numImpares[i][j] = (i * numImpares[i].length + j) * 2 + 1;
            }
        }
    }
    public static void calcularPromedios(double numPares[][], double numImpares[][], double [][]promedios) {
        for (int i = 0; i < numPares.length; i++) {
            for (int j = 0; j < numPares[i].length; j++) {
                promedios[i][j] = (numPares[i][j]+numImpares[i][j])/2;
            }
        }
    }
            
            public static String presentarMatrices(double numPares[][]) {
                String cadena = "";
                for (int i = 0; i < numPares.length; i++) {
                    for (int j = 0; j < numPares[i].length; j++) {
                        cadena += String.format ("%.2f\t",numPares[i][j]);
                    }
                    cadena += "\n";
                }
                return cadena;
            }
}

/*
Ingrese el tama�o de las filas y columnas de las matrices (el mismo tama�o para ambas ;)
5
3
La matriz de pares es:
0.00	2.00	4.00	
6.00	8.00	10.00	
12.00	14.00	16.00	
18.00	20.00	22.00	
24.00	26.00	28.00	
La matriz de impares es:
1.00	3.00	5.00	
7.00	9.00	11.00	
13.00	15.00	17.00	
19.00	21.00	23.00	
25.00	27.00	29.00	
Los promedios de ambas matrices son:
0.50	2.50	4.50	
6.50	8.50	10.50	
12.50	14.50	16.50	
18.50	20.50	22.50	
24.50	26.50	28.50	
*/