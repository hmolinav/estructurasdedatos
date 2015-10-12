
package Colas;

import estructurasdatos.Lista.ExepcionListaVacia;
import estructurasdatos.Lista.Lista;

public class Cola {
    private Lista listaCola;
    
    public Cola()
    {
        listaCola = new Lista("cola");
    }
    
    public void enqueue(Object objeto)
    {
        listaCola.insertarAlFinal(objeto);
        
    }//fin del metodo enqueue
    
    public Object dequeue() throws ExepcionListaVacia
    {
        return listaCola.eliminarDelFrente();
    }
    
    public boolean estaVacia()
    {
        return listaCola.estaVacia();
    }
    
    public void imprimir()
    {
        listaCola.imprimir();
    }
}
