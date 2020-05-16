/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caretaker;

import Memento.Memento;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Caretaker {

    private final ArrayList<Memento> states = new ArrayList<>();

    public void addMemento(Memento m) {
        states.add(m);
    }

    public Memento getMemento(int index) {
        return states.get(index);
    }
    
    public Memento getMementoUltimo(){     
        return states.get(states.size()-1);
    }
    
    public Memento devolver(int devol){
        try {
          return states.get((states.size()-1)-devol);  
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        return null;
    }

}
