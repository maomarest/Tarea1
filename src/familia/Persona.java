/**
 * @author Emmanuel Vanegas Arias, Mauricio Martinez Estrada y Sebastian Gil
 * @since 09/03/2016
 * @version 1.0
 */

package familia;
/**
     * Se identifica a cada persona especificamente con nombre, apellido, edad,
     * genero y rol dentro de la familia (madre,padre o hijo). Con sus 
     * respectivos Setters y Getters.
     *
     */

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String rol;

    public Persona(String rol, String nombre, String apellido, int edad, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
