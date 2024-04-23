package Tema11.ej3;
import java.io.*;
import java.util.*;

public class LecturaEscritura {

	public static void main(String[] args) {
		//Primera parte
		String rutaFichero=".\\src\\Tema11.ejemplos\\prueba.txt";
		System.out.println("Contenido del fichero: ");
		ArrayList<String> lista = new ArrayList<>();
		
		File fichero = new File(rutaFichero);
		try(BufferedReader br = new BufferedReader(new FileReader(fichero))){
			String linea;
			while((linea = br.readLine()) !=null) {
				System.out.println(linea);
				lista.add(linea);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		//Pedir datos
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el dato que desea introducir: ");
		String dato = sc.nextLine();
		añadirDato(lista, dato);
		imprimirLista(lista);
		
	
		sc.close();
	}
	public static void añadirDato (ArrayList<String> lista,String dato) {
		lista.add(dato);		
	}
	public static void imprimirLista(ArrayList<String> lista) {
		Iterator<String> imprimir = lista.iterator();
		while(imprimir.hasNext()) {	
			imprimir.next();			
		}
		System.out.println(lista);
	}

}
