
package Colas;

public class impCola {
    public void acolar(Object dato){
        Cola cola = new Cola();
        
        cola.enqueue(dato);
        cola.imprimir();
        
                
        
    }
    public void decolar()
    {
        Cola cola = new Cola();
        Object objetoEliminado = cola.dequeue();
        if(objetoEliminado instanceof String ){
        String s = (String) objetoEliminado;
            
        System.out.println("El dato eliminado en un String: "+s);
        //hacer algo con el String
        }
        else if(objetoEliminado instanceof Integer)
        {
        Integer d = (Integer) objetoEliminado;
        System.out.println("El dato eliminado es un Entero: "+d);
        }
        cola.imprimir();
    }
}
