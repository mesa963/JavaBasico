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

   
        
        
        ListaSimple<String> listaSimple = new ListaSimple("1");

            for (int i = 2; i <= 10; i++) {
                listaSimple.insertarNodo(i + "");
            }

            for (String valor : listaSimple) {
                System.out.println(valor);
            }

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");

        ListaArray<String> lA = new ListaArray();
       
        for (int i = 1; i < 11; i++) {
            lA.insertarNuevoElemento(i+"");
        }
        
        lA.mostrarElementos();
        System.out.println("Tamaño :" + lA.gettamanno());
        
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        for(String item: lA){
            System.out.println(item);
            
        }
    }

}
