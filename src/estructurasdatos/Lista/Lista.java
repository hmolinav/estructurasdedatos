
package estructurasdatos.Lista;

public class Lista {
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private String nombre;//cadena como lista utilizada para imprimir
    
    //El constructor crea una lista vacía
    public Lista()
    {
        this("lista");
    }//fin del costructor
    
    //El costructor crea una lista vacia con un nombre
    public Lista(String nombreL)
    {
        nombre = nombreL;
        primerNodo = ultimoNodo = null;
    }//fin del cosntructor de lista con un argumento
    
    public void insertAlfrente(Object insertar)
    {
        if(estaVacia())//primerNodo y ultimoNodo hacer referencia al mismo objeto
            primerNodo = ultimoNodo = new Nodo(insertar);
        else//primerNodo hace referencia al nuevo nodo
            primerNodo = new Nodo(insertar, primerNodo);
    }//fin del metodo InsertarAlfrente
    
    //inserta un objeto Object al final de la lista
    public void insertarAlFinal(Object insertar)
    {
        if(estaVacia())//primerNodo y ultimoNodo hacer referencia al mismo objeto
            primerNodo = ultimoNodo = new Nodo(insertar);
        else
            //el siguiente de ultimoNodo hace referencia al nuevo objeto
            ultimoNodo = ultimoNodo.siguienteNodo = new Nodo(insertar);
    }//fin del metodo insertarAlFinal
    
    public Object eliminarDelFrente() throws ExepcionListaVacia
    {
        if(estaVacia())//lanza exepcion si la lista esta vacía
            throw new ExepcionListaVacia(nombre);
        Object elementoEliminado = primerNodo.datos;//obtiene datos que se van a eliminar
        
        //actualiza las referencias al primerNodo y ultimoNodo
        if(primerNodo == ultimoNodo)
            primerNodo = ultimoNodo = null;
        else
            primerNodo =primerNodo.siguienteNodo;
        return elementoEliminado;
    }//fin del metodo eliminarDElFrente
    
    //Elimina ultimo nodo de la lista
    public Object eliminarDelFinal() throws ExepcionListaVacia
    {
        if(estaVacia())//lanza exepcion si la lista esta vacia
            throw new ExepcionListaVacia(nombre);
        Object elementoEliminado = ultimoNodo.datos;
        
        //actualiza las referencias primerNodo y ultimoNodo
        if(primerNodo == ultimoNodo)
            primerNodo = ultimoNodo = null;
        else
        {
            Nodo actual = primerNodo;
            
            //itera mientras el nodo actual no haga referencia a ultimoNodo
            while (actual.siguienteNodo != ultimoNodo)
                actual = actual.siguienteNodo;
            
            ultimoNodo = actual;
            actual.siguienteNodo = null;
        }//fin del else
        return elementoEliminado;//devuelve datos del nodo eliminado
    }
    
    //determina si la lista esta vacia
    public boolean estaVacia()
    {
        return primerNodo == null;
    }
    
    public void imprimir()
    {
        if(estaVacia())
        {
            System.out.printf("%s vacia\n ", nombre);
            return;
        }//fin del if
        
        System.out.printf("La %s es\n", nombre);
        Nodo actual = primerNodo;
        
        //mientras no esté al final de la lista, imprime los datos del nodo actual
        while (actual != null)
        {
            System.out.printf("[ %s ]\n", actual.datos);
            actual = actual.siguienteNodo;
        }//fin del while
        
        System.out.println(" \n");
    }//fin del metodo imprimir
}//fin de la clase lista
