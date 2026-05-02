package examenfinal;

public class Cancion extends Multimedia{
    String artista;
    
    public Cancion(String titulo,int duracion,String artista){
        super(titulo,duracion);
        this.artista=artista;
    }
    
    @Override
    public void Reproducir(){
        System.out.println("Canción: "+titulo+" Artista: " +artista+" "+Duracion+" seg");
    }
}
