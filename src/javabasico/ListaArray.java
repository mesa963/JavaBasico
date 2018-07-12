/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabasico;
import java.util.Arrays;
/**
 *
 * @author Jamm
 */
public class ListaArray {
      
    private Object[] values;
    private int tamanno = 2;  
    private int posicion;
    private final static int INCREMENTO = 2;
    
    
    
   public ListaArray() {
        this.values = new Object[this.tamanno];
        this.posicion=0;
    }
    
    public void insertarNuevoElemento(Object objeto){

    if((posicion) == (this.tamanno/INCREMENTO)){  
        
         this.values = Arrays.copyOf(values,this.tamanno * INCREMENTO);
         
          this.tamanno = this.tamanno * INCREMENTO;
    }
     this.values[this.posicion]=objeto;
      
     
         this.posicion ++; 
    }
    
    public void mostrarElementos(){
    
        for (int i = 0; i < this.posicion; i++) {
            System.out.println(this.values[i].toString());
        }
    
    }

    public int gettamanno() {
        return tamanno;
    }

}
