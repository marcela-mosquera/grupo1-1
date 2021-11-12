/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Marcela
 */
public class TestRatonExc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Raton r1 = new Raton();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso ");
        Veterinario v1 = new Veterinario();
        r1.setEdad(10);
        try {
            //escenario normal
            double pesoIngresado = entrada.nextDouble(); //puede arrojar un obj InputMismatch
            r1.setPeso(pesoIngresado);
            System.out.println("Peso " + r1.getPeso());
            System.out.println("El diagnostico es: " + v1.diagnosticar(r1));
            int num1, num2;
            System.out.println("Ingrese el primer numero ");
            num1 = entrada.nextInt();
            System.out.println("Ingrese el segundo numero ");
            num2 = entrada.nextInt();
            if (num2 == 0) {
                System.out.println("NO PUEDE DIVIDIR PARA  0");
            } else {
                int resultado = num1 / num2;//ArithmeticException
                System.out.println("El resultado de dividir " + num1 + "/" + num2 + " es " + resultado);
            }
        } //Para manejar exc que puedan surgir
        catch (InputMismatchException miExcepcion) {
            System.out.println("EXCEPCION " + miExcepcion.toString());
        } catch (ArithmeticException e) {
            System.out.println("/ para cero ");
        } //bloque generico
        catch (Exception e) {
            System.out.println(e.toString());
            System.err.print(e);
        }
        //sentencias que deben ejecutarse SIEMPRE INDEPENDIENTE DEL BLOQUE TRY-CATCH QUE SE EJECUTE
        
        finally{
            System.out.println("FIN DE LA EJECUCION");
            //se liberan recursos - cnx
        }
        
        System.out.println("FUERA DE LOS BLOQUES");

    }

}
