package PracticaEvaluable.tema10;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.*;
import java.time.DateTimeException;

/**
 * Clase principal que gestiona la lista de empleados y proporciona métodos para interactuar con ella. 
 */
public class Main {
	  /** Lista de empleados */
	public static ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	/**
     * Inicializa la lista de empleados con datos predefinidos.
     */
	    public static void inicializarDatos() {
	    	Empleado empleado1 = new Empleado("Juan", "Torres", LocalDate.parse("1960-01-01"),	LocalDate.parse("1980-05-25"),	"Jefe",	60000);
	        Empleado empleado2 = new Empleado("Sara", "Gonzalez", LocalDate.parse("1980-05-02"), LocalDate.parse("1999-06-03"), "Secretaria",	25000);
	        Empleado empleado3 = new Empleado("Elena", "Sanchez", LocalDate.parse("1990-09-03"),LocalDate.parse("2010-11-02"), "TecnicoFP", 30000);
	        Empleado empleado4 = new Empleado("Pepe", "Uriel", LocalDate.parse("1991-10-04"), LocalDate.parse("2015-10-01"), "Administrativo", 24000);
	        Empleado empleado5 = new Empleado("David", "Merchan", LocalDate.parse("2004-08-22"), LocalDate.parse("2020-05-05"), "Programador", 40000);

	        empleados.add(empleado1);
	        empleados.add(empleado2);
	        empleados.add(empleado3);
	        empleados.add(empleado4);
	        empleados.add(empleado5);
	    }

	    
	    /**
	     * Método para añadir un empleado a la lista.
	     */
	    public static void añadirEmpleado() {	 
	    	 String nombre="", apellidos=""; // Declaración fuera del bloque try
	         double salario = 0; // Declaración fuera del bloque try
	         LocalDate fechaNacimiento = null; // Declaración fuera del bloque try
	         LocalDate fechaIngreso = null; // Declaración fuera del bloque try
	         boolean valido = false; 
	      do {
	      try {
	    	 String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
	    	 nombre = nombre1;
	    	 valido = true;
	    } catch (InputMismatchException a) {
            JOptionPane.showMessageDialog(null, "Error: no puedes poner otra cosa que no sea un nombre");
            return;
        }//Fin try-catch
	         }while(!valido);
	      valido = false;
	      try {
	         String apellidos1 = JOptionPane.showInputDialog("Ingrese el apellido del empleado: ");	  
	         apellidos = apellidos1;
	    } catch (InputMismatchException b) {
            JOptionPane.showMessageDialog(null, "Error: no puedes poner otra cosa que no sea un apellido");
            return;
        }//Fin try-catch
	         valido = false;
	         do {
	         try {	    
	        	 String fechaNacimiento2  = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento: ");
	             fechaNacimiento = LocalDate.parse(fechaNacimiento2);	
	             valido = true;
	         }catch (DateTimeException e2) {
	        	    JOptionPane.showMessageDialog(null, "Error: El formato de fecha ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
	         }//Fin try-catch
	         }while(!valido);
	         
	         valido = false;
	         do {
	         try {	    	        	 
		         String fechaIngreso2  = JOptionPane.showInputDialog("Ingrese la fecha de ingreso a la empresa: ");	             
	             fechaIngreso = LocalDate.parse(fechaIngreso2);	
	             valido = true;
	         }catch (DateTimeException e2) {
	        	    JOptionPane.showMessageDialog(null, "Error: El formato de fecha ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
	         }//Fin try-catch
	         }while(!valido);
	         
	         String puesto  = JOptionPane.showInputDialog("Ingrese el puesto del empleado: ");	   
	         valido = false;
	         do {
	         try {
	         salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado: "));
	         valido = true;
	         }catch (NumberFormatException e) {
	             JOptionPane.showMessageDialog(null, "Error: El salario debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
	         } //Fin try-catch
	         }while(!valido);
	        
	         JOptionPane.showMessageDialog(null, "Empleado agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
             Empleado empleado2 = new Empleado(nombre, apellidos, fechaNacimiento, fechaIngreso, puesto, salario);
             empleados.add(empleado2);
	    }

	    
	    /**
	     * Método para eliminar un empleado de la lista.
	     * @param empleados La lista de empleados.
	     * @param nombre El nombre del empleado a eliminar.
	     */
	    public static void eliminarEmpleado(ArrayList<Empleado> empleados, String nombre) {
	        Iterator<Empleado> eliminar = empleados.iterator();
	        while (eliminar.hasNext()){
	            Empleado empleado = eliminar.next();
	            if (empleado.getNombre().equals(nombre)){
	            	JOptionPane.showMessageDialog(null,nombre+" eliminado correctamente.");
	                eliminar.remove();	                
	                return;
	            }//Fin if
	        }//Fin while
	        JOptionPane.showMessageDialog(null,"No se encontro ningun empleado con el nombre introducido");//Muestra el mensaje en caso de no encontrarse al empleado  
	    }//Fin del metodo

	    /**
	     * Método para buscar un empleado por apellido.
	     */
	    public static void buscarEmpleados() {
	    	 try {
	             String empleadoBuscado = JOptionPane.showInputDialog("¿A que empleado buscas?");
	             boolean valido = false;
	             for (Empleado empleado : empleados) {
	                 if (empleado.getApellidos().equalsIgnoreCase(empleadoBuscado)) {
	                     JOptionPane.showMessageDialog(null, empleado);
	                     valido = true;
	                     break;
	                 }//Fin if
	             }//Fin for
	             if (!valido) {
	                 JOptionPane.showMessageDialog(null, "No se encontró ese empleado");
	             }//Fin if
	         } catch (InputMismatchException e) {
	             JOptionPane.showMessageDialog(null, "ERROR: No se puede poner algo que no sea una cadena de caracteres");
	         }//Fin try-catch
	    }//Fin de la funcion

	    /**
	     * Método para imprimir la lista de empleados ordenada según la opción seleccionada.
	     */
	    public static void imprimirEmpleados() {
	    	int opcion;
	    	boolean valido = false;
	    	do {
	    	try {	    	    
	    	    int enumeracion = 1;
	            String informacionFinal = " ";
	            String[] options = {"Por antigüedad", "Por salario", "Por apellido"};
	            opcion = JOptionPane.showOptionDialog(null, "Elige una opción para ordenar la lista:", "Ordenar Lista", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]) + 1;
	    	    switch (opcion){
	            case 1://Ordenado por antiguedad
	            	 empleados.sort(Comparator.comparing(Empleado::getFechaIngreso));
	                    for (Empleado empleados1 : empleados) {
	                        informacionFinal += enumeracion + "-" + empleados1.getNombre() + " " + empleados1.getApellidos() + "  Fecha de nacimiento: " + empleados1.getFechaNacimiento() + "  Fecha de ingreso: " + empleados1.getFechaIngreso() + "  Puesto de trabajo: " + empleados1.getPuesto() + "  Salario: " + empleados1.getSalario()+" Euros";
	                        informacionFinal += "\n";
	                        enumeracion++;
	                    }//Fin for
	                    JOptionPane.showMessageDialog(null, informacionFinal);
	                    enumeracion = 1;
	                    informacionFinal += " ";	                    
	                    break;
	            case 2://Ordenado por salario
	            	  empleados.sort(Comparator.comparingDouble(Empleado::getSalario));
	                    for (Empleado empleados2 : empleados) {
	                        informacionFinal += enumeracion + "-" + empleados2.getNombre() + " " + empleados2.getApellidos() + "  Fecha de nacimiento: " + empleados2.getFechaNacimiento() + "  Fecha de ingreso: " + empleados2.getFechaIngreso() + "  Puesto de trabajo: " + empleados2.getPuesto() + "  Salario: " + empleados2.getSalario()+" Euros";
	                        informacionFinal += "\n";
	                        enumeracion++;
	                    }//Fin for
	                    JOptionPane.showMessageDialog(null, informacionFinal);
	                    enumeracion = 1;
	                    informacionFinal += " ";	                   
	                    break;
	            case 3://Ordenado por apellido
	            	empleados.sort(Comparator.comparing(Empleado::getApellidos));
                    for (Empleado empleados3 : empleados) {
                        informacionFinal += enumeracion + "-" + empleados3.getNombre() + " " + empleados3.getApellidos() + "  Fecha de nacimiento: " + empleados3.getFechaNacimiento() + "  Fecha de ingreso: " + empleados3.getFechaIngreso() + "  Puesto de trabajo: " + empleados3.getPuesto() + "  Salario: " + empleados3.getSalario()+" Euros";
                        informacionFinal += "\n";
                        enumeracion++;
                    }//Fin for
                    JOptionPane.showMessageDialog(null, informacionFinal);
                    enumeracion = 1;
                    informacionFinal += " ";                    
                    break;
	            default:
	            	JOptionPane.showMessageDialog(null, "Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
	                break;
	        }//Fin switch
	    	    valido = true;	    	    
	    	} catch (NumberFormatException e1)	{
	    		JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número del 1 al 3.", "Error", JOptionPane.ERROR_MESSAGE);
	    	}//Fin try-catch
	    	}while(!valido);
	       
	    }//Fin de la funcion

	    /**
	     * Método para calcular el gasto total de los empleados.
	     */
    public static void gastoTotal() {
        double total = 0;
        Iterator<Empleado> salarios = empleados.iterator();
        while (salarios.hasNext()){
            Empleado empleado = salarios.next();
            total += empleado.getSalario();
        }
        JOptionPane.showMessageDialog(null, "El gasto total de todos los empleados de la empresa es: "+total+" Euros");
    }//Fin de la funcion
  
    /**
     * Método principal que inicializa los datos y gestiona el menú de la aplicación.
     */
    public static void Inicializar() {
    	int opcion = 0;
    	do {
    	try {       
          opcion = Integer.parseInt(JOptionPane.showInputDialog(
                  "Menú:\n" +
                		  "\n1. agregar un empleado"+
                          "\n2. eliminar un empleado"+
                          "\n3. buscar un empleado"+
                          "\n4. Imprimir empleados ordenados por:"+
                          "\n   a) Antiguedad"+
                          "\n   b) Salario"+
                          "\n   c) Apellido"+
                          "\n5. Calcular gasto total de los empleados"+
                          "\n6. Salir"));
            switch (opcion) {
                case 1:
                	añadirEmpleado();
                    break;
                case 2:                	
                	String eliminarE = JOptionPane.showInputDialog("Introduce el nombre del empleado a despedir: ");                    
                    eliminarEmpleado(empleados, eliminarE);
                    break;
                case 3:               	                  
                    buscarEmpleados();
                    break;
                case 4:
                    imprimirEmpleados();                    
                    break;                                                              
                case 5:
                    gastoTotal();
                    break;
                case 6:
                	JOptionPane.showMessageDialog(null, "¡Hasta luego!", "Salir", JOptionPane.INFORMATION_MESSAGE);                                        
                    break;
                default:
                	JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
    	 } catch (NumberFormatException e2)	{
    			JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número.", "Error", JOptionPane.ERROR_MESSAGE);
    		}
    	}while(opcion != 6);
   
    }
    
    /**
     * Método principal que inicializa los datos y ejecuta el menú de la aplicación.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
    	inicializarDatos();
    	Inicializar();
    }
}