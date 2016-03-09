package familia;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Familia> f = new HashMap<>();

    public static void main(String[] args) {
        while(true){
            System.out.println("Digite (1) si desea ingresar una nueva familia, "
                    + "(2) si desea consultar una familia o "
                    + "(3) si desea consultar a algun miembro de la familia: ");
            switch(sc.nextInt()){
                case 1: registrarFamilia();   break;
                case 2: consultarFamilia();   break;
                case 3: consultarMiembro();   break;
            }
            System.out.println();
        }   
    }

    public static void registrarFamilia() {
        HashMap<String, Persona> persona = new HashMap<>();
        System.out.print("Escriba el apellido familiar: ");
        String apellido = sc.next();
        System.out.println("Escriba, separado por un espacio, el nombre, rol (Padre, "
                + "Madre o Hijo), edad, género de cada uno de los 4 "
                + "integrantes de la familia");
        
        String nombre = null;
        System.out.print("Digite el numero de miembros de la familia: ");
        for (int i = 0; i < sc.nextInt(); i++){
            nombre = sc.next();
            persona.put(nombre, new Persona(sc.next(), nombre, apellido, sc.nextInt(), sc.next()));
        }
        f.put(apellido, new Familia(apellido, persona));
    }
    
    public static void consultarFamilia() {
        System.out.print("Escriba el apellido de la familia: ");
        Familia fam = f.get(sc.next());
        for (Persona p : fam.persona.values())
            System.out.println(p.getRol() + ": " + p.getNombre()+" "+p.getApellido()+", "+p.getEdad()+" años, "+p.getGenero());
    }
    
    public static void consultarMiembro(){
        System.out.println("Escriba el apellido de la familia: ");
        Familia fam = f.get(sc.next());
        System.out.print("Escriba el nombre de la persona: ");
        Persona x = fam.persona.get(sc.next()); 
        System.out.println("\n" + x.getNombre()+" " + x.getApellido() + ", " + x.getEdad() + " años, " + x.getGenero());
        
        String relacion = null;
        
        System.out.println();
        for (Persona p : fam.persona.values()){
            if("Padre".equals(x.getRol()) && "Madre".equals(p.getRol()))
                relacion = "Esposa";
            else if(("Padre".equals(x.getRol()) || "Madre".equals(x.getRol())) && "Hijo".equals(p.getRol()))
                relacion = "Hijo";
            else if("Madre".equals(x.getRol()) && "Padre".equals(p.getRol()))
                relacion = "Esposo";
            else if("Hijo".equals(x.getRol()) && "Hijo".equals(p.getRol()))
                relacion = "Hermano";
            
            if(x != p)
                System.out.println(relacion + ": " + p.getNombre()+" "+p.getApellido()+", "+p.getEdad()+" años, "+p.getGenero());
        }
    }
}