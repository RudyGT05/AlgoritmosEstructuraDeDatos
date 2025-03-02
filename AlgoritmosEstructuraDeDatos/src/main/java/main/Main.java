package main;

import elementoslista.ListaEnlazada;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        logger.info("¿La lista está vacía? " + lista.estaVacia());

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);

        logger.info("Lista con los elementos agregados:");
        lista.imprimir();

        lista.eliminar();
        logger.info("Lista con un elemento eliminado:");
        lista.imprimir();

        logger.info("¿La lista está vacía? " + lista.estaVacia());
    }
}
