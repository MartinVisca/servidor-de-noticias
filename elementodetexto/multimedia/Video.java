package elementodetexto.multimedia;

import java.io.File;

public class Video extends Multimedia{
    int duracion;

    public Video(File f, String nombre, String calidad, int duracion){
        super(f, nombre, calidad);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public int getCantPalabras() {
        return 0;
    }
}
