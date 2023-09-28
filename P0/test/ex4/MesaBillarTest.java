package ex4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MesaBillarTest {

    private static MesaBillar mb;
    private static MesaBillar mb1;
    private static MesaBillar mb2;

    @BeforeEach
    void setUp() {
        mb = new MesaBillar();
        mb.iniciarPartida();
        mb.meterBola(2);

        mb1 = new MesaBillar();

        mb2 = new MesaBillar();
        mb2.iniciarPartida();
    }

    @Test
    void testExceptions(){
        assertThrows(IllegalArgumentException.class, () -> mb.meterBola(2));
        assertThrows(IllegalArgumentException.class, () -> mb.meterBola(-1));
        assertThrows(IllegalArgumentException.class, () -> mb.meterBola(18));
    }

    @Test
    void iniciarPartida() {
        assertEquals(16, mb2.bolasMesa().size());
        assertTrue(mb2.bolasCajetin().isEmpty());
        assertTrue(mb.esPartidaIniciada());
        assertTrue(mb2.esPartidaIniciada());
    }

    @Test
    void meterBola() {
        mb2.meterBola(8);
        assertFalse(mb2.esPartidaIniciada());
    }

    @Test
    void obtenerGanador() {
        assertNull(mb1.obtenerGanador());
        mb.meterBola(1);
        assertEquals(BolaBillar.TIPO.LISA, mb.obtenerGanador());
    }

    @Test
    void bolasCajetin() {
        assertEquals(16, mb1.bolasCajetin().size());
    }

    @Test
    void bolasMesa() {
        assertTrue(mb1.bolasMesa().isEmpty());
    }

    @Test
    void esPartidaIniciada() {
        assertTrue(mb.esPartidaIniciada());
    }
}