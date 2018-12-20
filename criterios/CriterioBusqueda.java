package criterios;

import servidornoticias.Noticia;

import java.util.Vector;

public interface CriterioBusqueda {
    public boolean cumple(Noticia n);
}
