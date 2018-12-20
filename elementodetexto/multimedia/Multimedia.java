package elementodetexto.multimedia;

import elementodetexto.EDT;

import java.io.File;

public abstract class Multimedia extends EDT {
    File f;
    String nombre;
    String calidad;

    public Multimedia(File f, String nombre, String calidad){
        this.f = f;
        this.nombre = nombre;
        this.calidad = calidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCalidad() {
        return calidad;
    }

    public File getF() {
        return f;
    }

    public abstract int getCantPalabras();
}
