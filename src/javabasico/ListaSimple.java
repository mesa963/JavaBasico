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
public class ListaSimple <T> {
protected Nodo primero;


    public void insertar(T dato) 
    {
        Nodo temporal = new Nodo(dato, null);
        temporal.setNext(primero);
        primero = temporal;
        
    }

    public ListaSimple() {
        this.primero = null;
    }
    
    public void imprimir(int n) {
    
    if (!vacio()) {
      Nodo temporal = primero;

      
      for (int i = 0; i < n; i++) {
        temporal = temporal.getNext();
        if (temporal == null)
          return;
      }
      System.out.println(temporal.getValue());
    }
  }



  public boolean vacio() {
    if (primero == null)
      return true;
    else
      return false;
  }

    
    
}
