package elementodetexto;

import java.util.Vector;

public class ElementoCompuesto extends EDT{
    Vector <EDT> elementos;

    public ElementoCompuesto(){
        elementos = new Vector<EDT>();
    }

    @Override
    public int getCantPalabras() {
        int suma = 0;
        for (int i = 0; i < elementos.size(); i++){
            suma += elementos.get(i).getCantPalabras();
        }
    }
}
