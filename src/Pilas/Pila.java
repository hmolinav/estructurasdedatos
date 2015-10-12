
package Pilas;

import estructurasdatos.Lista.ExepcionListaVacia;
import estructurasdatos.Lista.Lista;

public class Pila extends Lista
{
    public Pila()
    {
        super("pila");
    }//fin del constructor
    
    //Agrega objeto a la pila
    public void push(Object objeto)
    {
        insertAlfrente(objeto);
    }//fin del metodo push
    
    //eliminar de la pila
    public Object pop()throws ExepcionListaVacia
    {
        return eliminarDelFrente();
    }
}
