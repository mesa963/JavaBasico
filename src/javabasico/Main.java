/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.util.ArrayList;
import java.util.*;

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

  
       Main m = new Main();
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
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        m.arrayListinsertar();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        m.arrayListLamdaStream();
        
        m.map();
        
    }
    public void arrayListinsertar()
    {
       ArrayList<String> al = new ArrayList();
       
        for (int i = 1; i < 21; i++) {
            al.add(i +"");
        }
       
        System.out.println(al);
        Collections.reverse(al);
        
        System.out.println(al);
                
       
    }
    
    public void arrayListLamdaStream()
    {
    ArrayList<String> al = new ArrayList();
    
        for (int i = 1; i < 21; i++) {
            al.add(i +"");
        }
        System.out.println(al);
        
        System.out.println("------------Profesor-----------------------------------------------------------------------------------------------------------------------");
        al.stream().sorted((o1,o2)->{return o1.compareTo(o2);}).forEach(e -> System.out.println(e)); 
        
        System.out.println("------------Desarrollo-----------------------------------------------------------------------------------------------------------------------");
        al.stream().sorted(Comparator.reverseOrder()).filter(o-> Integer.valueOf(o)> 10).forEach(e -> System.out.println(e));
        System.out.println(al);
            
    }
    
    public void map()
    {
     System.out.println("------------Map-----------------------------------------------------------------------------------------------------------------------");
       Map<Integer,String> m = new  HashMap<Integer,String>();
    
        for (int i = 1; i < 101; i++) {
            m.put(i,new StringBuilder(i+"").reverse().toString());
        }
        
        m.values().stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.println(x));
       
    }
    
    
    
    
    
    
    
    
    

}
