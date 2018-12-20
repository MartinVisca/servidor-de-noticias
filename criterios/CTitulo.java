package criterios;

import elementodetexto.Frase;
import servidornoticias.Noticia;

public class CTitulo implements CriterioBusqueda{
    Frase frase;

    public CTitulo (Frase frase){
        this.frase = frase;
    }

    @Override
    public boolean cumple(Noticia n) {
        if (n.getTitulo().equals(frase))
            return true;
        return false;
    }
}
