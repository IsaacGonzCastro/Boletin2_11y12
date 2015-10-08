
package boletin2_11y12;

import java.util.Scanner;

public class Boletin2_11y12 {

    public static void main(String[] args) {
     //entrada por teclado
  double sueldoFijo,comision,quilometraje,dietas,totalVentas,km,desplazamientos,sueldoLiquido;
        double seguridadSocial=36;
        double resultado;
        Scanner obx=new Scanner(System.in);
        System.out.print("Introducir sueldo fijo : ");
        sueldoFijo=obx.nextFloat();
        System.out.print("Introducir importe total de ventas : ");
        totalVentas=obx.nextFloat();
        comision =0.05*totalVentas;
        System.out.print("Introducir quilometros percorridos :");
        km=obx.nextDouble();
        quilometraje = 2*km;
        System.out.print("Introducir dias de desplazamiento :");
        desplazamientos=obx.nextDouble();
        dietas= 30* desplazamientos;
        sueldoLiquido=(sueldoFijo+comision+quilometraje+dietas)/0.18;
        resultado=sueldoLiquido-seguridadSocial;
        System.out.print("Sueldo liquido = "+resultado);
        
    }
    
}
