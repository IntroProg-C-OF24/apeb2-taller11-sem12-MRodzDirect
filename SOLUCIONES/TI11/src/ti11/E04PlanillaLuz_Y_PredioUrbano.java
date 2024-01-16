
package ti11;
import java.util.Scanner;
public class E04PlanillaLuz_Y_PredioUrbano {
    static String report;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operacion;
        float costKw, spentKw, houseValue;
        String nombre, cedula;
        System.out.println("Ingrese la operacion que desea hacer");
        operacion = sc.nextInt();
        System.out.println("Ingrese su nombre y cedula");
        nombre = sc.next();
        cedula = sc.next();
        switch (operacion) {
            case 1: 
                System.out.println("==Calcular su Planilla de Luz==");
                System.out.println("Ingrese el costo de Kilovation mensual en su localidad");
                costKw = sc.nextFloat();
                System.out.println("Ingrese cuantas Kilovatios usted gasto en este mes");
                spentKw = sc.nextFloat();
                calcularPlanillaLuz(costKw, spentKw,nombre,cedula);
                System.out.println(report);
                break;
            case 2: 
                System.out.println("==Calcular su Predio Urbano==");
                System.out.println("Ingrese el valor de su inmueble");
                houseValue = sc.nextFloat();
                System.out.println(calcularPredioUrbano(houseValue,nombre,cedula));
                break;
            default:
                System.out.println("Operacion no valida, debe estar entre (1-2)");
        }
    }
    public static void calcularPlanillaLuz(float costKw,float spentKw, String nombre, String cedula) {
        float valorPlanilla;
        
        valorPlanilla = costKw * spentKw;
        report = String.format("Cliente %s con cédula %s debe cancelar el valor de %.2f",nombre,cedula,valorPlanilla);
}
    public static String calcularPredioUrbano(float houseValue,String nombre, String cedula) {
        float valorPredio;
        String report2;
        valorPredio = (float) (houseValue * 0.02);
        report2 = String.format("Cliente %s con cédula %s  tiene un bien inmueble valorado en %d $ y tiene que pagar de predio de %.2f $",nombre,cedula,(int)houseValue,valorPredio);
        return report2;
    }
}

/*
Ingrese la operacion que desea hacer
2
Ingrese su nombre y cedula
Señor Miyagi
==Calcular su Predio Urbano==
Ingrese el valor de su inmueble
1500000
Cliente Se�or con c�dula Miyagi  tiene un bien inmueble valorado en 1500000 $ y tiene que pagar de predio de 30000.00 $
*/