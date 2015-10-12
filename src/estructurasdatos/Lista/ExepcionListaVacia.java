
package estructurasdatos.Lista;

public class ExepcionListaVacia extends RuntimeException
{
    public ExepcionListaVacia()
    {
        this("Lista");//llama al otro constructor de ExepcionLista vacia
    }//fin del constructor
    
    //constructor con un argumento
    public ExepcionListaVacia(String nombre)
    {
        super(nombre + "Esta vacia");
    }
}//fin del a clase exeptionListaVacia
