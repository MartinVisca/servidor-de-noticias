package criterios;

import servidornoticias.Noticia;

import java.util.Vector;

public class CPalabrasClave implements CriterioBusqueda{
    Vector<String> palabrasClave;

    public CPalabrasClave(){
        palabrasClave = new Vector<String>();
    }

    @Override
    public boolean cumple(Noticia n) {
        Vector<String> aux = (Vector<String>) palabrasClave.clone();
        if (n.tienePalabrasClave(aux))
            return true;
        return false;
    }
}
