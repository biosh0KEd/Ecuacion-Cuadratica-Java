/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacioncuadratica;

import java.util.Scanner;
/**
 *
 * @author Efraín
 */
public class EcuacionCuadratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada;
        Entrada = new Scanner(System.in);
        double x, y, z;
        System.out.println("Resolucion de ecuaciones cuadraticas");
        System.out.println("Introduce X:");
        x = Entrada.nextDouble();
        System.out.println("Introduce Y:");
        y = Entrada.nextDouble();
        System.out.println("Introduce Z:");
        z = Entrada.nextDouble();    
        double bCuadrada = y * y;
        double ac4 = 4 * x * z;
        double determinante = bCuadrada - ac4;
        double numeradorP = -y + Math.sqrt(determinante);
        double numeradorN = -y - Math.sqrt(determinante);
        double denominador = 2 * x;
        double resultadoP = numeradorP / denominador;
        double resultadoN = numeradorN / denominador;
        if (determinante == 0){
            if (resultadoP < 1){
                System.out.println("El resultado es:");
                System.out.println(resultadoN);
            }
            else {
                System.out.println("El resultado es:");
                System.out.println(resultadoP);
            }
        }
        else if (determinante >= 1){
            System.out.println("Existen 2 resultados:");
            System.out.println(resultadoP);
            System.out.println(resultadoN);
        }
        else {
            System.out.println("El resultado es");
            double numReal = -y / denominador;
            double numImaginario = Math.sqrt(-determinante) / denominador;
            System.out.println(numReal + " +/- " + numImaginario + "i");
        }
    } 
}
