package ex4;

import static ex4.BolaBillar.COLOR.*;
import static ex4.BolaBillar.TIPO.*;

public enum BolaBillar {

    BLANCA(0, BLANCO, LISA),
    BOLA1(1, AMARILLO, LISA),
    BOLA2(2, AZUL, LISA),
    BOLA3(3, ROJO, LISA),
    BOLA4(4, VIOLETA, LISA),
    BOLA5(5, NARANJA, LISA),
    BOLA6(8, VERDE, LISA),
    BOLA7(7, GRANATE, LISA),
    BOLA8(8, NEGRO, LISA),
    BOLA9(9, AMARILLO, RAYADA),
    BOLA10(10, AZUL, RAYADA),
    BOLA11(11, ROJO, RAYADA),
    BOLA12(12, VIOLETA, RAYADA),
    BOLA13(13, NARANJA, RAYADA),
    BOLA14(14, VERDE, RAYADA),
    BOLA15(15, GRANATE, RAYADA);

    final private int n;
    final private COLOR c;
    final private TIPO t;

    public enum COLOR {BLANCO, AMARILLO, AZUL, ROJO, VIOLETA, NARANJA, VERDE, GRANATE, NEGRO};
    public enum TIPO {LISA, RAYADA};

    private BolaBillar(int n, COLOR c, TIPO t) {
        this.n = n;
        this.c = c;
        this.t = t;
    }

    public int getNumber() {
        return n;
    }

    public COLOR getColor() {
        return c;
    }

    public TIPO getTipo() {
        return t;
    }
}
