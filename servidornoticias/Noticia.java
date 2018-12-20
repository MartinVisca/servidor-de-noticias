package servidornoticias;

import elementodetexto.EDT;
import elementodetexto.Frase;

import java.util.Vector;

public class Noticia {
    Vector<EDT> cuerpo;
    Frase titulo;
    String clasificacion;

    public Noticia(Frase titulo, String clasificacion){
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.cuerpo = new Vector<EDT>();
    }

    public Frase getTitulo() {
        return titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void addContenido(EDT elemento){
        cuerpo.add(elemento);
    }

    public int getCantPalabras(){
        int suma = 0;
        for (int i = 0; i < cuerpo.size(); i++){
            suma += cuerpo.get(i).getCantPalabras();
        }
        return suma;
    }

    public boolean tienePalabrasClave(Vector <String> palabrasClave){
        //Pregunta si el EDT tiene las palabras alojada en el vector palabrasClave
        return false;
    }//NO IMPLEMENTADO
}
