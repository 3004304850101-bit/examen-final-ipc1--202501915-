package examenfinal;

public class Cancion extends Multimedia{
    String artista;
    
    public Cancion(String titulo,int duracion,String artista){
        super(titulo,duracion);
        this.artista=artista;
    }
    
    public void Cancion(){
        System.out.println("Canción: "+titulo+" Artista: " +artista+" "+Duracion+" seg");
    }
    
    @Override
    public void Reproducir(){
        System.out.println("Reproduciendo: "+titulo+" Artista: " +artista+" "+Duracion+" seg");
    }
}
