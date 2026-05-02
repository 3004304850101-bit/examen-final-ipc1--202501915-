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
            temporal.dato.Cancion();
            temporal=temporal.siguiente;
        }
        
    }
    
    public void siguiente(){
        if(actual==null){
            return;
        }
        if(actual.siguiente!=null){
            actual=actual.siguiente;
        }else{
            System.out.println("Ultima Canción");
        }
        
        actual.dato.Reproducir();
        
    }
    
    public void anterior(){
        if(actual==null){
            return;
        }
        if(actual.anterior!=null){
            actual=actual.anterior;
        }else{
            System.out.println("Primera Canción");
        }
        
        actual.dato.Reproducir();
        
    }
    
    public void EliminarActual(){
        if(actual==null){
            
        }
        if(cabeza==cola){
            cabeza=cola=actual=null;
        }
        else if(actual==cabeza){
            cabeza=cabeza.siguiente;
            cabeza.anterior=null;
            actual=cabeza;
        }else if(actual==cola){
            cola=cola.anterior;
            cabeza.siguiente=null;
            actual=cola;
        }
        else{
            actual.anterior.siguiente=actual.siguiente;
            actual.siguiente.anterior=actual.anterior;
            actual=actual.siguiente;
            
        }
        
        tamanio--;
    }
}
