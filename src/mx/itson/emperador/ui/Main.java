
package mx.itson.emperador.ui;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        System.out.println("Ingrese los alumnos");
        Scanner entrada = new Scanner(System.in);
        String alumnos = entrada.nextLine();
        
        String[] resultado =  alumnos.split(",");
        
        for(String r : resultado){
            String [] alumno = r.split("");
            System.out.println("ID: "+ alumno[0] + " - " + alumno [3] + " " + alumno [1]);
        }
            
        }
        
    
}
 