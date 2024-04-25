package PracticaEvaluable.Practica_Evaluable_Tema_11_Merchan_Muñoz_David;
import java.time.LocalDate;


/**
 * Representa a un empleado con sus atributos básicos.
 */
class Empleado {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;
    private String puesto;
    private double salario;

    /**
     * Constructor vacio de la clase Empleado.
     */
    public Empleado() {}
    
    /**
     * Constructor de la clase Empleado.
     * @param nombre El nombre del empleado.
     * @param apellidos Los apellidos del empleado.
     * @param fechaNacimiento La fecha de nacimiento del empleado.
     * @param fechaIngreso La fecha de ingreso a la empresa del empleado.
     * @param puesto El puesto del empleado.
     * @param salario El salario del empleado.
     */
    public Empleado(String nombre, String apellidos, LocalDate fechaNacimiento, LocalDate fechaIngreso, String puesto, double salario){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Getters

    /**
     * Obtiene el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene los apellidos del empleado.
     * @return Los apellidos del empleado.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Obtiene la fecha de nacimiento del empleado.
     * @return La fecha de nacimiento del empleado.
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Obtiene la fecha de ingreso a la empresa del empleado.
     * @return La fecha de ingreso a la empresa del empleado.
     */
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    
    /**
     * Obtiene el puesto del empleado.
     * @return El puesto del empleado.
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Obtiene el salario del empleado.
     * @return El salario del empleado.
     */
    public double getSalario() {
        return salario;
    }

    // Setters
    
    /**
     * Establece el nombre del empleado.
     * @param nombre El nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece los apellidos del empleado.
     * @param apellidos Los apellidos del empleado.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Establece la fecha de nacimiento del empleado.
     * @param fechaNacimiento La fecha de nacimiento del empleado.
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    /**
     * Establece la fecha de ingreso a la empresa del empleado.
     * @param fechaIngreso La fecha de ingreso a la empresa del empleado.
     */
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    /**
     * Establece el puesto del empleado.
     * @param puesto El puesto del empleado.
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Establece el salario del empleado.
     * @param salario El salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    /**
     * Devuelve una representación en forma de cadena del objeto Empleado.
     * @return La representación en forma de cadena del objeto Empleado.
     */
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Nombre: ");
    	sb.append(nombre);
    	sb.append("\nApellido: ");
    	sb.append(apellidos);
    	sb.append("\nFecha de nacimiento: ");
    	sb.append(fechaNacimiento);
    	sb.append("\nFecha de ingreso: ");
    	sb.append(fechaIngreso);
    	sb.append("\nPuesto: ");
    	sb.append(puesto);
    	sb.append("\nSalario: ");
    	sb.append(salario);
        return sb.toString();
    }
}
