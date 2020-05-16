/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Caretaker.Caretaker;
import Memento.Memento;
import Originator.Persona;

/**
 *
 * @author bryan
 */
public class Main {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        Persona persona = new Persona();
        persona.setNombre("Pacho");
        persona.setApellidos("Olaya");
        persona.setEdad("25");
        persona.setCarrera("sistemas");
        persona.setDireccion("avenida siempre viva");
        persona.setTelefono("3198764980");

        caretaker.addMemento(persona.saveToMemento());

        persona.setNombre("Milla");

        caretaker.addMemento(persona.saveToMemento());

        persona.setNombre("Tonny");

        Memento memento1 = caretaker.getMemento(0);
        Memento memento2 = caretaker.getMemento(1);

        System.out.println(memento1.getSavedState());
        System.out.println(memento2.getSavedState());
    }

}
