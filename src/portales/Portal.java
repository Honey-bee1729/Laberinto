package portales;

import java.util.Random;

public class Portal {
    private String simbolo;
    private int desplazamientoX;
    private int desplazamientoY;

    public Portal() {
        this.simbolo = "P";
        Random aleatorio = new Random();
        
        do {
            this.desplazamientoX = aleatorio.nextInt(5) - 2;
            this.desplazamientoY = aleatorio.nextInt(5) - 2;
        } while (this.desplazamientoX == 0 && this.desplazamientoY == 0);
    }

    public String obtenerSimbolo() {
        return simbolo;
    }

    public int obtenerDesplazamientoX() {
        return desplazamientoX;
    }

    public int obtenerDesplazamientoY() {
        return desplazamientoY;
    }

    public int[] calcularNuevaPosicion(int posicionActualX, int posicionActualY, int totalFilas, int totalColumnas) {
        int nuevaPosicionX = posicionActualX + desplazamientoX;
        int nuevaPosicionY = posicionActualY + desplazamientoY;

        if (nuevaPosicionX >= 0 && nuevaPosicionX < totalFilas && nuevaPosicionY >= 0 && nuevaPosicionY < totalColumnas) {
            return new int[]{nuevaPosicionX, nuevaPosicionY};
        } else {
            return new int[]{posicionActualX, posicionActualY};
        }
    }
}