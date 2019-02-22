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
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
