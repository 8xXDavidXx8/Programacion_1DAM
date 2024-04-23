package ej2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Segunda explicacion de la lectura de ficheros
 * @author  Mparr
 */
public class Main {
    /**
     * Metodo que ejecuta el codigo
     * @param args Los argumentos de la linea de comandos
     */

    public static void main(String[] args) {
        //Array de objetos Alumnos
        ArrayList<Alumnos> alumnoDam= new ArrayList<Alumnos>();
        //Instacio el fichero donde se guardan los datos
        File fichero = new File(".\\src\\ejemplos\\prueba.txt");
        Scanner sc= null;
        try {
            sc=new Scanner(fichero);
            //Voy obteniendo los datos de cada alumno
            while (sc.hasNextLine()){
                String linea = sc.nextLine();//Obtiene una fila de un alumno
                String[] cortarString = linea.split("::");
                //Objeto clase alumnos con su atributos
                Alumnos alumno= new Alumnos();
                alumno.setNumero(Integer.parseInt(cortarString[0]));// Se tiene que trnsformar de String a entero
                alumno.setNombre(cortarString[1]);
                alumno.setApellido(cortarString[2]);
                //Añadir el alumnono a la lista
                alumnoDam.add(alumno);
            }//Fin while
        } catch (FileNotFoundException e) {
          e.printStackTrace();
        }finally {
            try {

                if (sc !=null){
                    sc.close();
                }
            }catch (Exception e){
                System.out.println("Error al cerrar el fichero");
                e.printStackTrace();
            }
        }//Fin try-catch-finally

        //Imprimir el fichero con un Iterador
        System.out.println("Alumnos de 1º de Dam: "+alumnoDam.size());
        Iterator<Alumnos> itAlumnos= alumnoDam.iterator();
        System.out.println("Numero  "+"Nombre  "+"Apellidos   ");
        System.out.println("---------------------------");
        while (itAlumnos.hasNext()){
           Alumnos alumnos2 =itAlumnos.next();
            System.out.println(" "+alumnos2.getNumero()+"     "+alumnos2.getNombre()+"      "+alumnos2.getApellido());
        }//Fin while

    }//Fin de main
}//Fin del Main
