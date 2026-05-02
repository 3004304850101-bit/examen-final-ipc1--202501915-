package examenfinal;

public class ExamenFinal {
    public static void main(String[] args) {
        Cancion cancion1=new Cancion("Bohemian Rhapsody",350,"Queen");
        Cancion cancion2=new Cancion("Imagine",180, "John Lennon");
        Cancion cancion3=new Cancion("Billie Jean",290, "Michael Jackson");
        
        NodoDoble nodo1=new NodoDoble(cancion1);
        NodoDoble nodo2=new NodoDoble(cancion2);
        NodoDoble nodo3=new NodoDoble(cancion3);
        
        Playlist playlist = new Playlist();
        System.out.println("Playlist");
        
        playlist.AgregarCancion(cancion1);
        playlist.AgregarCancion(cancion2);
        playlist.AgregarCancion(cancion3);
        
        playlist.MostrarLista();
    }
    
}
