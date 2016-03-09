/**
 * @author Emmanuel Vanegas Arias, Mauricio Martinez Estrada y Sebastian Gil
 * @since 09/03/2016
 * @version 1.0
 */

package familia;
import java.util.*;
/**
     * Se identifica a cada familia con el apellido del padre. 
     * 
     */
public class Familia {

    private String apellido;
    public HashMap<String, Persona> persona = new HashMap<>();
    
    public Familia(String apellido, HashMap<String, Persona> persona) {
        this.apellido = apellido;
        this.persona = persona;
    }

    public HashMap<String, Persona> getF() {
        return persona;
    }
}