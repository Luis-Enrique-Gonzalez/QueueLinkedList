/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Luis Enrique
 */
public class QueueLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> queue=new LinkedList();
      
        
        queue.add("Adrian");
        queue.add("Luis");
        queue.add("Daniel");
        //Insertar Datos 
        //Retorna un Exception en caso de no poder 
        //almacenar el elemento
        queue.offer("Franciso");
        //eliminar un elemento 
        System.out.println(" se elimno: "+queue.remove());
        //muestra el frente de la cola 
        System.out.println(" Frente la cola: "+queue.element());
        
        //elimina un elemento de la cola 
        //nretorna null si la cola esta vacia 
        System.out.println("Se elimini el elemento: "+ queue.peek());
        
        
        
        
        
        
        List<String> list = new ArrayList<String>();   
        list.add(queue.element());
        list.add(queue.peek());
        list.add(" el que se elimino fue: "+queue.remove());
        
            Iterator iter = list.iterator();
            while (iter.hasNext())
            System.out.println(iter.next());
        }
        
   }
    

