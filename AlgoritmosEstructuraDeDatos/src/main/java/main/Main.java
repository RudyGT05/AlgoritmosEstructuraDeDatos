package main;

import elementoslista.ListaEnlazada;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

       
        System.out.println("La lista está vacia? " + lista.estaVacia());

     
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);

   
        System.out.println("Lista con los elementos agregados:");
        lista.imprimir();

   
        lista.eliminar();
        System.out.println("Lista con un elemento eliminado:");
        lista.imprimir();

        
        System.out.println("La lista está vacia? " + lista.estaVacia());
    }
}