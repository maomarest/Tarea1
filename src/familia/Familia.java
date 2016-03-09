package familia;
import java.util.*;

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