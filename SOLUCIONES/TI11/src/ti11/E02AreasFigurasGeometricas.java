
package ti11;
import java.util.Scanner;
public class E02AreasFigurasGeometricas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int seleccion;
        double a, b;
        double c[] = new double[1];
        System.out.println("Ingrese la operacion a hacer: 1. AreaCuadrado 2. AreaRectanculo 3. AreaTriangulo");
        seleccion = sc.nextInt();
        switch(seleccion) {
                case 1:System.out.println("-- AREA CUADRADO --");
                System.out.println("Ingrese el valor del lado");
                a = sc.nextDouble();
                obtenerAreaCuadrado(a,c);
                System.out.println( presentarAreas(c[0]));
                break;
                case 2: System.out.println("-- AREA RECTANGULO --");
                System.out.println("Ingrese el valor de la base y la altura");
                a = sc.nextDouble();
                b = sc.nextDouble();
                obtenerAreaRectangulo(a,b,c);
                System.out.println( presentarAreas(c[0]));
                break;
                case 3: System.out.println("-- AREA TRIANGULO --");
                System.out.println("Ingrese el valor de la base y la altura");
                a = sc.nextDouble();
                b = sc.nextDouble();
                obtenerAreaTriangulo(a,b,c);
                System.out.println( presentarAreas(c[0]));
                break;
                default: System.out.println("Operacion no valida, debe escribir entre el (1-3)");
                break;
        }
    }
   public static void obtenerAreaCuadrado(double a,double c[]) {
       c[0] = Math.pow(a,4);
   }
   public static void obtenerAreaRectangulo(double a, double b, double c[]) {
       c[0] = a*b;
   }
   public static void obtenerAreaTriangulo(double a, double b, double c[]) {
       c[0] = (a*b)/2;
   }
   public static String presentarAreas(double c) {
       String x = "";
       x+= String.format("El area de la figura seleccionada es:\n%.2f", c);
       return x;
   }
   
}

/*
Ingrese la operacion a hacer: 1. AreaCuadrado 2. AreaRectanculo 3. AreaTriangulo
2
-- AREA RECTANGULO --
Ingrese el valor de la base y la altura
15
65
El area de la figura seleccionada es:
975.00
*/