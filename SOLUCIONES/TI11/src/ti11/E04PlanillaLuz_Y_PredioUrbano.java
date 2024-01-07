
package ti11;
import java.util.Scanner;
public class E04PlanillaLuz_Y_PredioUrbano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operacion;
        float costKw, spentKw, houseValue;
        String nombre, cedula;
        String report[] = new String[1];
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
                calcularPlanillaLuz(costKw, spentKw,nombre,cedula,report);
                System.out.println(report[0]);
                break;
            case 2: 
                System.out.println("==Calcular su Predio Urbano==");
                System.out.println("Ingrese el valor de su inmueble");
                houseValue = sc.nextFloat();
                calcularPredioUrbano(houseValue,nombre,cedula,report);
                System.out.println(report[0]);
                break;
            default:
                System.out.println("Operacion no valida, debe estar entre (1-2)");
        }
    }
    public static void calcularPlanillaLuz(float costKw,float spentKw, String nombre, String cedula, String report[]) {
        float valorPlanilla;
        
        valorPlanilla = costKw * spentKw;
        report[0] = String.format("Cliente %s con cédula %s debe cancelar el valor de %.2f",nombre,cedula,valorPlanilla);
}
        public static void calcularPredioUrbano(float houseValue,String nombre, String cedula, String report[]) {
        float valorPredio;
        
        valorPredio = (float) (houseValue * 0.02);
        report[0] = String.format("Cliente %s con cédula %s  tiene un bien inmueble valorado en %d $ y tiene que pagar de predio de %.2f $",nombre,cedula,(int)houseValue,valorPredio);
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