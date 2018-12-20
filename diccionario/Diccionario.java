package diccionario;

import java.util.HashMap;

public class Diccionario {
    HashMap <String, String> palabras;
    String idioma;

    public Diccionario (String idioma){
        this.idioma = idioma;
        palabras = new HashMap<>();
    }

    public String getIdioma() {
        return idioma;
    }

    public void addPalabra(String palabra, String significado){
        if (!palabras.containsKey(palabra))
            palabras.put(palabra, significado);
    }

    public void borrarPalabra(String palabra){
        palabras.remove(palabra);
    }
}
