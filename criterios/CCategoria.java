package criterios;

import servidornoticias.Noticia;

public class CCategoria implements CriterioBusqueda{
    String categoria;

    public CCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public boolean cumple(Noticia n) {
        if (n.getClasificacion().equals(getCategoria()))
            return true;
        return false;
    }
}
