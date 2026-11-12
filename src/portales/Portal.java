package portales;

import modelo.Posicion;

/**
 * Portal "P" del laberinto.
 * Esta en la casilla (fila, columna). Al pisarlo, el personaje se mueve
 * a la casilla (fila + p, columna + p), siempre que sea una casilla valida.
 */
public class Portal {

    private final int fila;
    private final int columna;
    private final int p; // desplazamiento del portal

    public Portal(int fila, int columna, int p) {
        this.fila = fila;
        this.columna = columna;
        this.p = p;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int getP() {
        return p;
    }

    /** true si este portal esta en la casilla indicada. */
    public boolean estaEn(int f, int c) {
        return fila == f && columna == c;
    }

    /** Casilla destino: (fila + p, columna + p). */
    public Posicion getDestino() {
        return new Posicion(fila + p, columna + p);
    }

    @Override
    public String toString() {
        return "P(" + fila + "," + columna + ") -> (" + (fila + p) + "," + (columna + p) + ")";
    }
}