package ex3;

public class ex3 {

    public static void main(String[] args) {
        System.out.println("\n\n");

        Release rel = new Release("rel1");
        rel.setArtist("Rodrigo");
        rel.setTitle("Release 1");
        rel.addTrack(new Track("A", "fdsafdsa--fesdfa-dsa2", "Rodrigo", "Track 1", 120));
        rel.addTrack(new Track("AB", "fdsafdsa--fesdfa-dsa1", "Rodrigo", "Track 1", 120));
        rel.addTrack(new Track("B", "fdsafdsa--fesdfa-dsa0", "Rodrigo", "Track 2", 120));
        System.out.println(rel.toString());

        System.out.println("\n\n");

        Release rel2 = new Release("rel2");
        rel2.setArtist("Rodrigo");
        rel2.setTitle("Release 1");
        rel2.addTrack(new Track("A", "fdsafdsa--fesdfa-dsa2", "Rodrigo", "Track 1", 120));
        rel2.addTrack(new Track("AB", "fdsafdsa--fesdfa-dsa1", "Rodrigo", "Track 1", 120));
        rel2.addTrack(new Track("B", "fdsafdsa--fesdfa-dsa0", "Rodrigo", "Track 2", 120));
        System.out.println(rel2.toString());
    }

}
