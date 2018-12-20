package servidornoticias;

import criterios.CriterioBusqueda;
import elementodetexto.Frase;

import java.util.Vector;

public class ServidorDeNoticias {
    Vector <Noticia> noticias;
    Vector <Suscripcion> suscripciones;

    public ServidorDeNoticias(){
        this.noticias = new Vector<Noticia>();
        this.suscripciones = new Vector<Suscripcion>();
    }

    public void nuevaNoticia(Frase titulo, String clasificacion){
        Noticia n = new Noticia(titulo, clasificacion);
        redactarNoticia();
        noticias.add(n);
        enviarNoticia(n);
    }

    private void enviar(String email){
        /*
        Envia las noticias al email
         */
    }

    private void enviarNoticia(Noticia n){
        for (int i = 0; i < suscripciones.size(); i++){
            if (n.getClasificacion().equals(suscripciones.get(i).getAmbito()) && n.tienePalabrasClave(suscripciones.get(i).getPalabrasClave()))
                enviar(suscripciones.get(i).getEmail());
        }
    }

    public void redactarNoticia(){
        //Carga de EDT, desde teclado o desde archivos. No hace falta la implementacion.
    }

    public void actualizarNoticias(){
        //Con el agregado de una fecha para cada noticia, estableceria un periodo de tiempo para guardado de noticias
        //Una vez pasado ese tiempo, la noticia ya es vieja y se borra de la lista
    }//NO IMPLEMENTADO; metodo extra no pedido

    public void nuevaSuscripcion(String email, String ambito){
        Suscripcion s = new Suscripcion(email, ambito);
        /*
        En este espacio se podrian agregar palabras clave sobre las cuales recibir noticias, con el metodo addPalabraClave, propio
        de la clase Suscripcion. Estas palabras se pedirian por teclado, en un for con corte manual.
         */
        if (!suscripciones.contains(s))
            suscripciones.add(s);
    }

    public void borrarSuscripcion(String email){
        suscripciones.remove(email);
    }

    public Vector<Noticia> buscar(CriterioBusqueda criterio){
        Vector<Noticia> salida = new Vector<Noticia>();
        for (int i = 0; i < noticias.size(); i++){
            Noticia n = noticias.elementAt(i);
            if (criterio.cumple(n))
                salida.add(n);
        }
        return salida;
    }
}
