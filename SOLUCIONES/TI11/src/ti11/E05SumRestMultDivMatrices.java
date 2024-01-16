
package ti11;
import java.util.Scanner;
public class E05SumRestMultDivMatrices {    

/**
Desarrolla una solución en pseudocódigo que permita mediante un menú (al estilo calculadora matemática), facilitar las operaciones de suma, resta de dos matrices.
Considerar la validación de las reglas para realizar estas operaciones.
Nota: Las matrices se deben llenar con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9).
 * 
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int limitMt;
        System.out.println("Ingrese el limite de la matriz");
        limitMt= sc.nextInt();
        int mt1[][] = new int[limitMt][limitMt];
        int mt2[][] = new int[limitMt][limitMt];
        int matrizResultado[][] = new int[limitMt][limitMt];
        generarMatriz(mt1);                
        generarMatriz(mt2);
        System.out.printf("La matriz 1 generada es:\n%s", presentarMatrices(mt1)) ;
        System.out.printf("La matriz 2 generada es:\n%s", presentarMatrices(mt2));
        sumarMatrices(mt1,mt2,matrizResultado);
        System.out.printf("La suma de matrices es:\n%s", presentarMatrices(matrizResultado)) ;
        restarMatrices(mt1,mt2,matrizResultado);
        System.out.printf("La resta de matrices es:\n%s", presentarMatrices(matrizResultado)) ;
        multiplicarMatrices(mt1,mt2,matrizResultado);
        System.out.printf("La multiplicacion de matrices es:\n%s", presentarMatrices(matrizResultado)) ;
        // Para la division, converti las matrices-de-enteros generadas en matrices-de-reales
        double [][]mtdouble = new double[mt1.length][mt1.length];
        double [][]mtdouble2 = new double[mt2.length][mt2.length];
        double [][]mtResultadodouble = new double[matrizResultado.length][matrizResultado.length];
        matrizInt_a_MatrizDouble(mt1,mtdouble);
        matrizInt_a_MatrizDouble(mt2,mtdouble2);
        dividirMatrices(mtdouble,mtdouble2,mtResultadodouble);
        System.out.printf("La division de matrices es:\n%s", presentarMatrices(mtResultadodouble)) ; // Este metodo "presentarMatrices" esta Sobrecargado, lo use para poder presentar un double en la division, en cambio en los demas solo presente Integers (es decir use el metodo sin sobrecarga)


    }
        //Generar la matriz 1:
        public static void generarMatriz(int mt1[][]) {
        
        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1.length; j++) {
                mt1[i][j] = (int) (Math.random() * (10 - (-9) + 1) + (-9));
            }
        }
}
        public static String presentarMatrices(int mt1[][]) {
            String cadena = "";
            for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1.length; j++) {
                
                cadena += String.format ("%d\t",mt1[i][j]);
                 
            // Para tab, el ASCII es (char)9
            }
            cadena += "\n"; // (char)13 = Caracter 13 de la tabla ASCII. Es lo mismo que \n (salto de linea)
            }
            return cadena;
        }
        // LEEME: Este metodo es el que decidi ponerlo sobrecargado
        public static String presentarMatrices(double mt1[][]) {
            String cadena = "";
            for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1.length; j++) {
                
                cadena += String.format ("%.2f\t",mt1[i][j]);
                 
           
            }
            cadena += "\n"; 
            }
            return cadena;
        }

        public static void sumarMatrices(int mt1[][], int mt2[][], int matrizResultado[][]) {
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado.length; j++) {
                    matrizResultado[i][j] = mt1[i][j] + mt2[i][j];
                }
            }
        }
           public static void restarMatrices(int mt1[][], int mt2[][], int matrizResultado[][]) { 
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado.length; j++) {
                    matrizResultado[i][j] = mt1[i][j] - mt2[i][j];
                }
            }

        }
           public static void multiplicarMatrices(int mt1[][], int mt2[][], int matrizResultado[][]) { 
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado.length; j++) {
                    matrizResultado[i][j] = mt1[i][j] * mt2[i][j];
                }
            }

        }
           
           public static void matrizInt_a_MatrizDouble(int[][]mt1, double [][]mtdouble) {
               
               for (int i = 0; i < mt1.length; i++) {
                   for (int j = 0; j < mt1.length; j++) {
                       mtdouble[i][j] = mt1[i][j];
                       
                   }
               }
           }

           public static void dividirMatrices(double mtdouble[][], double mtdouble2[][], double mtResultadodouble[][]) { 
            for (int i = 0; i < mtResultadodouble.length; i++) {
                for (int j = 0; j < mtResultadodouble.length; j++) {
                    mtResultadodouble[i][j] = mtdouble[i][j] / mtdouble2[i][j];
                }
            }

        }
           
    }

/*
La matriz 1 generada es:
8	2	6	
9	0	7	
-3	-3	3	
La matriz 2 generada es:
6	3	9	
-6	5	7	
1	6	-5	
La suma de matrices es:
14	5	15	
3	5	14	
-2	3	-2	
La resta de matrices es:
2	-1	-3	
15	-5	0	
-4	-9	8	
La multiplicacion de matrices es:
48	6	54	
-54	0	49	
-3	-18	-15	
La division de matrices es:
1.33	0.67	0.67	
-1.50	0.00	1.00	
-3.00	-0.50	-0.60	
Nota: Funcion presentarMatrices esta sobrecargada.
*/
