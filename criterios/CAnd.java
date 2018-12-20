package criterios;

import servidornoticias.Noticia;

public class CAnd implements CriterioBusqueda{
    CriterioBusqueda c1;
    CriterioBusqueda c2;

    public CAnd(CriterioBusqueda c1, CriterioBusqueda c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Noticia n) {
        if (c1.cumple(n) && c2.cumple(n))
            return true;
        return false;
    }
}
