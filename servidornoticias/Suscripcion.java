package servidornoticias;


import java.util.Vector;

public class Suscripcion {
    String email;
    String ambito;
    Vector <String> palabrasClave;

    public Suscripcion(String email, String ambito){
        this.email = email;
        this.ambito = ambito;
        this.palabrasClave = new Vector<String>();
    }

    public String getEmail() {
        return email;
    }

    public String getAmbito() {
        return ambito;
    }

    public void addPalabraClave(String cl){
        if (!palabrasClave.contains(cl))
            palabrasClave.add(cl);
    }

    public Vector<String> getPalabrasClave() {
        return palabrasClave;
    }
}
