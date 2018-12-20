package elementodetexto.multimedia;

import elementodetexto.Frase;

import java.io.File;

public class Imagen extends Multimedia{
    Frase textoAsociado;

    public Imagen(File f, String nombre, String calidad){
        super(f, nombre, calidad);
        this.textoAsociado = null;
    }

    @Override
    public int getCantPalabras() {
        return textoAsociado.getCantPalabras();
    }

    public void addTextoAImagen(Frase f){
        this.textoAsociado = f;
    }
}
