
package estructurasdatos;

import Colas.Cola;
import Pilas.Pila;
import estructurasdatos.Lista.ExepcionListaVacia;
import estructurasdatos.Lista.Lista;
import javax.swing.JOptionPane;

public class EstructurasDatos {

    public static void main(String[] args) {
        Cola cola = new Cola();
        Pila pila = new Pila();
        Lista lista = new Lista();
        
        
        
        int opcion;
        do{
        
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de Inicio\n "
                    +" 1. Colas\n"
                    +" 2. Pilas\n"
                    +" 3. listas\n"
                    +" 4. salir"));
            switch(opcion)
            {
                case 1:
                    int opc = 0;
                    while(opc != 3)
                    {
                     opc = Integer.parseInt(JOptionPane.showInputDialog("COLAS\n "
                    +" 1. insertar datos\n"
                    +" 2. eliminar datos\n"
                    +" 3. salir"));
                    switch(opc)
                    {
                        case 1:
                            Object dato1 = JOptionPane.showInputDialog("insertar datos");
                            
                            cola.enqueue(dato1);
                            cola.imprimir();
                            break;
                        case 2:
                            Object dato = cola.dequeue();
                            System.out.println("dato eliminado "+dato);
                            
                            cola.imprimir();
                            break;
                        }
                    }
                    break;
                case 2:
                    int op =0;
                    while(op != 3)
                    {
                     op = Integer.parseInt(JOptionPane.showInputDialog("PILAS\n "
                    +" 1. insertar datos\n"
                    +" 2. eliminar datos\n"
                    +" 3. salir"));
                    switch(op)
                    {
                        case 1:
                            Object dato = JOptionPane.showInputDialog("insertar datos");
                            pila.push(dato);
                            pila.imprimir();
                            
                            break;
                        case 2:
                            try
                            {
            
                                Object objetEliminado = pila.pop();
                                
                                System.out.println("dato eliminado "+objetEliminado);
                                pila.imprimir();
            
                            }//fin del try
        
                            catch (ExepcionListaVacia exepcionlistaVacia)
                            {
                                exepcionlistaVacia.printStackTrace();
                            }//fin del catch
                            break;
                        }
                    }
                    break;
                case 3:
                    int opcd = 0;
                    while(opcd != 3)
                    {
                     opcd = Integer.parseInt(JOptionPane.showInputDialog("LISTAS\n "
                    +" 1. insertar datos\n"
                    +" 2. eliminar datos\n"
                    +" 3. salir"));
                    switch(opcd)
                    {
                        case 1:
                            lista.insertAlfrente(-1);
                            lista.imprimir();
                            lista.insertAlfrente(0);
                            lista.imprimir();
                            lista.insertAlfrente(1);
                            lista.imprimir();
                            lista.insertAlfrente(5);
                            lista.imprimir();
                            break;
                        case 2:
                            try
                            {
            
                                Object objetoEliminado = lista.eliminarDelFrente();
                                System.out.printf("%s eliminado\n", objetoEliminado);
                                lista.imprimir();
            
                            }//fin del try
        
                            catch (ExepcionListaVacia exepcionlistaVacia)
                            {
                                exepcionlistaVacia.printStackTrace();
                            }//fin del catch
                            break;
                        }
                    }
                    break;
            }
        }while(opcion !=4);   
        JOptionPane.showMessageDialog(null, "Adios");
        
        
        
        
    }//fin del main
    
}//fin de la clase
