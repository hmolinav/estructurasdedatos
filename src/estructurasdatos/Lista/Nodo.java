
package estructurasdatos.Lista;

public class Nodo 
{
    Object datos;//los datos para el nodo
    Nodo siguienteNodo;//referencia al siguiente nodo de la lista
    
    //El constructor crea un objeto Nodo que hace referencia al objeto
    Nodo(Object objeto)
    {
        this(objeto, null);
    }//fin de l constructor
    
    //el constructor crea un objeto Nodo que hace referenca a
    //un objeto Object y al siguiente objeto Nodo
    Nodo(Object objeto, Nodo nodo)
    {
        datos = objeto;
        siguienteNodo = nodo;
    }//fin del constructor
    
    Object obtenerObjeto()
    {
        return datos;//devuelve el objeto Object en este nodo
    }//fin del metodo obtenerObjeto
    
    Nodo obtenerSiguiente()
    {
        return siguienteNodo;//obtiene el siguiente nodo
    }//fin del metodo obtenerSiguiente
}//fin de la clase Nodo
