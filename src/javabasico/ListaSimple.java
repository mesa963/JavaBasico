/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;
/**
 *
 * @author Jamm
 */
import java.util.*;
import java.util.function.Consumer;
public class ListaSimple <T> implements Iterable<T>{
private Nodo inicial;
    private Nodo nodoActual;
    

    public ListaSimple(T objeto) {
        Nodo nodo=new Nodo(objeto);
        this.inicial = nodo;
        this.nodoActual = nodo;
       
    }

    public Nodo getRoot() {
        return inicial;
    }

    public void setRoot(Nodo root) {
        this.inicial = root;
    }

    public Nodo getNodoActual() {
        return nodoActual;
    }

    public void setNodoAct(Nodo nodoAct) {
        this.nodoActual = nodoAct;
    }
    
    public void insertarNodo(T objeto) {
        
        
        Nodo nodo=new Nodo(objeto);
       
       this.nodoActual.setNext(nodo);
       this.nodoActual=nodo;
       
    }
    
    public void imprimir(){
    Nodo nodo=this.inicial;
        System.out.println(nodo);
    while(nodo.getNext()!=null){
        nodo=nodo.getNext();
        System.out.println(nodo);
    }
    }
    
    
    
    @Override
    public Iterator<T> iterator() {
        return new MiIterator();
    }
    
    class MiIterator implements Iterator<T>{
         private boolean imprimioElUltimo=false;
        private Nodo nodoActualRecorrido=inicial;
        
        @Override
    public boolean hasNext() {
        if(this.nodoActualRecorrido.getNext()!=null)
        return true;
       if(this.imprimioElUltimo==false)
       {
           this.imprimioElUltimo=true;
           return true;
       }
      return false;  
    }

    @Override
    public T next() {
        T objeto= (T)this.nodoActualRecorrido.getValue();
        if(this.imprimioElUltimo==false)
        this.nodoActualRecorrido=nodoActualRecorrido.getNext();
        return objeto;
    }

    @Override
    public void remove() {
        Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action); //To change body of generated methods, choose Tools | Templates.
    }
    }
  
  





    
    
}
