/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabasico;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
/**
 *
 * @author Jamm
 */
public class ListaArray<T> implements Iterable<T>{
      
    private T[] values;
    private int tamanno = 2;  
    private int posicion;
    private final static int INCREMENTO = 2;
    
    
    
   public ListaArray() {
        this.values = (T[])new Object[this.tamanno];
        this.posicion=0;
    }
    
    public void insertarNuevoElemento(T objeto){

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

    @Override
    public Iterator<T> iterator() {
        return new MiIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator(); //To change body of generated methods, choose Tools | Templates.
    }
    
    class MiIterator implements Iterator<T>{

     private int posicionCiclo=0;             

    @Override
    public boolean hasNext() {
        if(posicionCiclo<posicion)
            return true;
        
        this.posicionCiclo=0;
        
        return false;
    }

    @Override
    public T next() {
       T valor= values[posicionCiclo];
       ++this.posicionCiclo;
        return valor;
    }

    @Override
    public void remove() {
        Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action); //To change body of generated methods, choose Tools | Templates.
    }
 
}    

}
