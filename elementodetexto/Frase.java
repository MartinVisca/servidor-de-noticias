package elementodetexto;

import java.util.Vector;

public class Frase extends EDT{
    Vector <String> frase;

    public Frase(){
        frase = new Vector<>();
    }

    public int getCantPalabras(){
        return frase.size();
    }

    public void addPalabra(String s){
        frase.add(s);
    }
}
