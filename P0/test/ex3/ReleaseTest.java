package ex3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ReleaseTest {

    /* Releases. */
    private static Release beatlesSFFPennyLane; // Original double A-Side.
    private static Release beatlesPennyLanePromo; // Promotional release.
    private static Release beatlesSFFDigital; // One-track digital version.

    private static Release madonnaAngelUKSingle;
    private static Release madonnaAngelUKMaxiSingle;
    private static Release madonnaAngelUSMaxiSingle;
    private static Release madonnaIntoTheGrooveUSMaxiSingle;

    public static Release release1;
    public static Release release2;
    public static Release release3;
    public static Release release4;

    @BeforeAll
    static void setUp() {
        /* Recordings. */
        String recBeatlesSFF = "6f5f27e2-fe6d-4c98-be0b-1e58d569909c";
        String recBeatlesPennyLane = "5a6becfb-07e3-4286-8de0-5b4fa826f3f2";

        // Angel (short radio version).
        String recMadonnaAngelSingleEdit = "99f49645-1811-42f7-8a14-0df8578ccf09";
        // Angel (extended dance version), different recording.
        String recMadonnaAngelExtendedMix = "74e2ab8f-56f2-4b9c-ad35-336c73cd73e0";
        String recMadonnaBurningUp = "ed102d77-146c-4941-85c6-07f3b9df7117";
        String recMadonnaIntoTheGroove = "986645ce-32d0-42ba-999a-7faf2603aa7e";

        // OTROS TESTS

        /*
            - Probamos que no son iguales cuando dos Releases
                no tienen ningun Track.
            - Probamos que son iguales cuando dos Releases
                tienen los mismos Tracks pero en distinto orden.
            - Probamos que no son iguales cuando un Release no
                tiene ningún Track.
         */


        //Releases vacíos
        release1 = new Release("release1");
        release1.setArtist("Rodrigo");
        release1.setTitle("Release 1");

        release2 = new Release("release2");
        release2.setArtist("Rodrigo");
        release2.setTitle("Release 2");

        //Releases con Tracks
        String track1 = "xxx--xxx--xxx1";
        String track2 = "xxx--xxx--xxx2";
        release3 = new Release("release3");
        release3.setArtist("Rodrigo");
        release3.setTitle("Release 3");
        release3.addTrack(new Track("A", track1, "Rodrigo", "Track1", 120));
        release3.addTrack(new Track("AB", track2, "Rodrigo", "Track2", 130));

        release4 = new Release("release4");
        release4.setArtist("Rodrigo");
        release4.setTitle("Release 4");
        release4.addTrack(new Track("B", track2, "Rodrigo", "Track2", 130));
        release4.addTrack(new Track("BB", track1, "Rodrigo", "Track1", 120));

        /* Releases. */

        // https://musicbrainz.org/release/eadb40cc-9394-3787-80c3-644ed4a167c0
        beatlesSFFPennyLane = new Release("eadb40cc-9394-3787-80c3-644ed4a167c0");
        beatlesSFFPennyLane.setArtist("Beatles");
        beatlesSFFPennyLane.setTitle("Strawberry Fields Forever / Penny Lane");
        beatlesSFFPennyLane.addTrack(new Track("A", recBeatlesSFF, "The Beatles", "Strawberry Fields Forever", 251));
        beatlesSFFPennyLane.addTrack(new Track("AA", recBeatlesPennyLane,"The Beatles", "Penny Lane", 178));

        // https://musicbrainz.org/release/0173d355-016f-4d28-8c57-cdb0b6fd30a0
        beatlesPennyLanePromo = new Release("0173d355-016f-4d28-8c57-cdb0b6fd30a0");
        beatlesPennyLanePromo.setArtist("The Beatles");
        beatlesPennyLanePromo.setTitle("Penny Lane / Strawberry Fields Forever (Promo)");
        beatlesPennyLanePromo.addTrack(new Track("A", recBeatlesPennyLane,"Beatles", "Penny Lane", 180));
        beatlesPennyLanePromo.addTrack(new Track("B", recBeatlesSFF,"Beatles","Strawberry Fields Forever", 245));

        // https://musicbrainz.org/release/af20e7d5-8ab2-4967-8608-c508213b821d
        beatlesSFFDigital = new Release("af20e7d5-8ab2-4967-8608-c508213b821d");
        beatlesSFFDigital.setArtist("The Beatles");
        beatlesSFFDigital.setTitle("Strawberry Fields Forever (Single)");
        beatlesSFFDigital.addTrack(new Track("1", recBeatlesSFF,"The Beatles","Strawberry Fields Forever (Remastered 2009)", 238));

        // https://musicbrainz.org/release/fcd7fed3-4523-49bc-a310-129a1f3b6bcc
        madonnaAngelUKSingle = new Release("fcd7fed3-4523-49bc-a310-129a1f3b6bcc");
        madonnaAngelUKSingle.setArtist("Madonna");
        madonnaAngelUKSingle.setTitle("Angel (UK 7\" Single)");
        madonnaAngelUKSingle.addTrack(new Track("A1", recMadonnaAngelSingleEdit,"Madonna","Angel (Edit)", 222));
        madonnaAngelUKSingle.addTrack(new Track("B1", recMadonnaBurningUp,"Madonna", "Burning Up", 288));

        // https://musicbrainz.org/release/56f72e41-1060-4926-b77d-58d7b2a4df86
        madonnaAngelUKMaxiSingle = new Release("56f72e41-1060-4926-b77d-58d7b2a4df86");
        madonnaAngelUKMaxiSingle.setArtist("Madonna");
        madonnaAngelUKMaxiSingle.setTitle("Angel (UK 12\" Single)");
        madonnaAngelUKMaxiSingle.addTrack(new Track("A1", recMadonnaAngelExtendedMix, "Madonna","Angel (Extended Dance Mix)", 375));
        madonnaAngelUKMaxiSingle.addTrack(new Track("B1", recMadonnaBurningUp, "Madonna", "Burning Up", 288));

        // https://musicbrainz.org/release/8b53c32c-ee79-42b1-a7a9-bd7c63322c31
        madonnaAngelUSMaxiSingle = new Release("8b53c32c-ee79-42b1-a7a9-bd7c63322c31");
        madonnaAngelUSMaxiSingle.setArtist("Madonna");
        madonnaAngelUSMaxiSingle.setTitle("Angel (US 12\" Single)");
        madonnaAngelUSMaxiSingle.addTrack(new Track("A1", recMadonnaAngelExtendedMix, "Madonna", "Angel (Extended Dance Mix)", 375));
        madonnaAngelUSMaxiSingle.addTrack(new Track("B1", recMadonnaIntoTheGroove,"Madonna", "Into The Groove", 280));

        // https://musicbrainz.org/release/d0e62810-fcab-443e-b3ef-398db6cec5eb
        madonnaIntoTheGrooveUSMaxiSingle = new Release("d0e62810-fcab-443e-b3ef-398db6cec5eb");
        madonnaIntoTheGrooveUSMaxiSingle.setArtist("Madonna");
        madonnaIntoTheGrooveUSMaxiSingle.setTitle("Into the Groove (US 12\" Single)");
        madonnaIntoTheGrooveUSMaxiSingle.addTrack(new Track("A1", recMadonnaIntoTheGroove, "Madonna", "Into the Groove", 280));
        madonnaIntoTheGrooveUSMaxiSingle.addTrack(new Track("B1", recMadonnaAngelExtendedMix, "Madonna", "Angel (12\" Dance Mix)", 375));
    }

    @Test
    void testConstructorException() {
        assertThrows(IllegalArgumentException.class, () -> new Release(null));
        assertThrows(IllegalArgumentException.class, () -> new Release(""));
    }

    @Test
    void testToString(){
        assertEquals("""
                (release4): Release 4 de Rodrigo con las siguientes pistas:
                - (B): Track2 de Rodrigo con duracion 130s [xxx--xxx--xxx2]
                - (BB): Track1 de Rodrigo con duracion 120s [xxx--xxx--xxx1]
                """, release4.toString());

        assertEquals("(release1): Release 1 de Rodrigo con las siguientes pistas:\n", release1.toString());
    }

    @Test
    void testRemoveTrack(){
        Track t = new Track("C", "----", "Rodrigo", "Track3", 150);
        release4.addTrack(t);
        release4.removeTrack(t);
        assertEquals(release3, release4);
        assertEquals(release3.hashCode(), release4.hashCode());
    }

    @Test
    void testEquals() {
        assertEquals(beatlesSFFPennyLane, beatlesPennyLanePromo); // Same but with flipped sides.
        assertEquals(madonnaAngelUSMaxiSingle, madonnaIntoTheGrooveUSMaxiSingle); // Same but with flipped sides.

        assertEquals(release3, release4); // Probamos que dos Releases son iguales cuando tienen los mismos Tracks en distinto orden
    }

    @Test
    void testNotEquals() {
        assertNotEquals(beatlesSFFPennyLane, beatlesSFFDigital); // Different number of songs.
        assertNotEquals(madonnaAngelUKMaxiSingle, madonnaAngelUSMaxiSingle); // Different songs.
        assertNotEquals(madonnaAngelUKSingle, madonnaAngelUSMaxiSingle); // Same songs but different versions.

        assertNotEquals(release1, release2); //Probamos que dos Releases no son iguales cuando ninguno tiene Tracks
        assertNotEquals(release1.hashCode(), release2.hashCode()); //Lo mismo pero con Hash

        assertNotEquals(release1, release3); //Probamos que dos Releases no son iguales cuando uno de ellos no tiene Tracks
        assertNotEquals(release1.hashCode(), release3.hashCode()); //Lo mismo pero con Hash
    }

    @Test
    void testHashCode() {
        assertEquals(beatlesSFFPennyLane.hashCode(), beatlesPennyLanePromo.hashCode()); // Same but with flipped sides.
        assertEquals(madonnaAngelUSMaxiSingle.hashCode(), madonnaIntoTheGrooveUSMaxiSingle.hashCode()); // Same but with flipped sides.

        assertEquals(release3.hashCode(), release4.hashCode()); // Probamos que dos Releases son iguales cuando tienen los mismos Tracks en distinto orden
    }
}