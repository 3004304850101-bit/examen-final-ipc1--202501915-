package examenfinal;

public class Playlist {
    NodoDoble cabeza;
    NodoDoble cola;
    NodoDoble actual;
    int tamanio;
    
    public Playlist(){
        cabeza=null;
        cola=null;
        actual=null;
        tamanio=0;
    }
    
    public void AgregarCancion(Cancion c){
        NodoDoble nuevo=new NodoDoble(c);
        if(cabeza==null){
            cabeza=cola=actual=nuevo;
        }else{
            cola.siguiente=nuevo;
            nuevo.anterior=cola;
            cola=nuevo;
        }
        tamanio++;
    }
    
    public void MostrarLista(){
        NodoDoble temporal=cabeza;
        while(temporal !=null){
            temporal.dato.Reproducir();
            temporal=temporal.siguiente;
        }
        
    }
}
