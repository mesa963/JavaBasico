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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaSimple lista = new ListaSimple();

    lista.Insertar("1");
    lista.Insertar("2");
    lista.Insertar("3");
    lista.Insertar("4");
    lista.Insertar("5");
    lista.Insertar("6");
    lista.Insertar("7");
    lista.Insertar("8");
    lista.Insertar("9");
    lista.Insertar("10");
    
    lista.imprimir(0);
    lista.imprimir(1);
    lista.imprimir(2);
    lista.imprimir(3);
    lista.imprimir(4);
    lista.imprimir(5);
    lista.imprimir(6);
    lista.imprimir(7);
    lista.imprimir(8);
    lista.imprimir(9);
    
     System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
    
    ListaArray lA=new ListaArray();
        lA.insertarNuevoElemento("1");
        lA.insertarNuevoElemento("2");        
        lA.insertarNuevoElemento("3");
        lA.insertarNuevoElemento("4");
        lA.insertarNuevoElemento("5");        
        lA.insertarNuevoElemento("6");
        lA.insertarNuevoElemento("7");
        lA.insertarNuevoElemento("8");        
        lA.insertarNuevoElemento("9");
        lA.insertarNuevoElemento("10");
        
        lA.mostrarElementos();
    
    
        System.out.println("Tamaño :"+lA.gettamanno());
        
    
    
    
    
    }
    
}
