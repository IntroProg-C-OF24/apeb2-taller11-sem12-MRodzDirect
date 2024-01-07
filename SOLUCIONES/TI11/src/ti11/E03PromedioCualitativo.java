
package ti11;

import java.util.Scanner;
public class E03PromedioCualitativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double nota, nota2, nota3, nota4;
        System.out.println("Ingrese las 4 notas del estudiante");
        nota = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        nota4 = sc.nextDouble();
        System.out.println(promCualitativo(nota, nota2, nota3, nota4));
    }
    public static String promCualitativo(double nota,double nota2,double nota3,double nota4){
        String mensaje;
        double prom;
        prom = (nota+nota2+nota3+nota4)/4;
        if (prom>0&&prom<=5){
            mensaje= String.format("Estudiante con promedio final %.2f es Regular", prom);
        }
        else if(prom>5&&prom<=8){
            mensaje= String.format("Estudiante con promedio final %.2f es Bueno", prom);
        }
        else if (prom>8&&prom<=9) {
            mensaje= String.format("Estudiante con promedio final %.2f es Muy Bueno", prom);
        }
        else if (prom>9&&prom<=10) {
            mensaje= String.format("Estudiante con promedio final %.2f es Sobresaliente", prom);
        }
        else if (prom==0) {
            mensaje= String.format("Estudiante con promedio final %.2f perdio el año, que sad :L", prom);
        }
        else {
            mensaje= String.format("Por favor ingrese notas validas, pues las notas %.2f, %.2f, %.2f y %.2f no son validas dentro del sistema (0.00-10)", nota, nota2, nota3, nota4);
        }
        return mensaje;
}
}

/*
Ingrese las 4 notas del estudiante
5
9
8
9.9
Estudiante con promedio final 7.98 es Bueno

*/
