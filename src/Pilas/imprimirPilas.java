
package Pilas;

import estructurasdatos.Lista.ExepcionListaVacia;

public class imprimirPilas {
    public void pilas()
    {
        Pila pila = new Pila();
        
        pila.push(-1);
        pila.imprimir();
        pila.push(0);
        pila.imprimir();
        pila.push(1);
        pila.imprimir();
        pila.push(5);
        pila.imprimir();
        
        try
        {   
            Object objetoEliminado = null;
            
            objetoEliminado = pila.pop();
            System.out.printf("se desapilo %s\n",objetoEliminado);
            pila.imprimir();
            
            objetoEliminado = pila.pop();
            System.out.printf("se desapilo %s\n",objetoEliminado);
            pila.imprimir();
            
            objetoEliminado = pila.pop();
            System.out.printf("se desapilo %s\n",objetoEliminado);
            pila.imprimir();
            
            objetoEliminado = pila.pop();
            System.out.printf("se desapilo %s\n",objetoEliminado);
            pila.imprimir();
        }
        catch (ExepcionListaVacia exepcionlistavacia)
        {
            exepcionlistavacia.printStackTrace();
        }
    }
}
