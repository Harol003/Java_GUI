/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polilistasabs;

/**
 *
 * @author Harol
 */
import java.util.AbstractList;
import java.util.List;

// Definición de la clase abstracta PoliListasAbs que extiende AbstractList
public class PoliListasAbs <E> extends AbstractList<E> {
    private Object[] elements;  // Arreglo para almacenar los elementos de la lista
    private int size;           // Tamaño actual de la lista

    // Constructor que inicializa el arreglo con capacidad inicial
    public PoliListasAbs(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("La capacidad inicial no puede ser negativa");
        }
        elements = new Object[initialCapacity];
        size = 0;  // Inicialmente la lista está vacía
    }

    // Método para obtener un elemento en un índice dado
    @Override
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return (E) elements[index];
    }

    // Método para obtener el tamaño actual de la lista
    @Override
    public int size() {
        return size;
    }

    // Método para reemplazar un elemento en un índice dado
    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        E previousElement = (E) elements[index];
        elements[index] = element;
        return previousElement;
    }

    // Método para agregar un elemento en un índice dado
    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        // Si el arreglo está lleno, se duplica su capacidad
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        // Mueve los elementos para abrir espacio en la posición index
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    // Método para remover un elemento en un índice dado
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        E removedElement = (E) elements[index];
        // Mueve los elementos para llenar el espacio dejado por el elemento removido
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;  // Limpia la última posición
        size--;
        return removedElement;
    }

    public static void main(String[] args) {
        // Crear una lista de personajes usando la clase PoliListasAbs
        List<String> personajes = new PoliListasAbs<>(3);
        personajes.add("Goku");
        personajes.add("Vegeta");
        personajes.add("Piccolo");

        // Acceder y mostrar información de la lista
        System.out.println("Personajes en índice 1: " + personajes.get(1));
        System.out.println("Tamaño de la lista: " + personajes.size());

        // Realizar modificaciones en la lista
        personajes.add(2, "Gohan");
        personajes.remove(0);

        // Mostrar los personajes después de las modificaciones
        System.out.println("Personajes después de modificaciones:");
        for (String personaje : personajes) {
            System.out.println(personaje);
        }
    }
}
