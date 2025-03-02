package elementoslista;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ListaEnlazada {
    private static final Logger logger = LogManager.getLogger(ListaEnlazada.class);
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        logger.info("Se agregó un nuevo nodo con el dato: " + dato);
    }

    public void eliminar() {
        if (estaVacia()) {
            logger.warn("La lista está vacía, no se puede eliminar.");
            return;
        }
        logger.info("Se eliminó el nodo con el dato: " + cabeza.dato);
        cabeza = cabeza.siguiente;
    }

    public void imprimir() {
        StringBuilder sb = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            sb.append(actual.dato).append(" -> ");
            actual = actual.siguiente;
        }
        sb.append("null");
        logger.info("Lista actual: " + sb.toString());
    }
}


