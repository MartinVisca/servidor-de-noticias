package criterios;

import servidornoticias.Noticia;

public class CCantidadDePalabras implements CriterioBusqueda{
    int cantidadPalabras;

    public CCantidadDePalabras(int cantidadPalabras){
        this.cantidadPalabras = cantidadPalabras;
    }

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    @Override
    public boolean cumple(Noticia n) {
        if (n.getCantPalabras() <= getCantidadPalabras())
            return true;
        return false;
    }
}
