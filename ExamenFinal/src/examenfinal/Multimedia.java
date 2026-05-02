
package examenfinal;

public abstract class Multimedia {
    String titulo;
    int Duracion;
    
    public Multimedia(String titulo,int duracion){
        this.titulo=titulo;
        this.Duracion=duracion;
    }

    public abstract void Reproducir();
}
