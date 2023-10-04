package ex3;

<<<<<<< HEAD
=======
import java.sql.Array;
>>>>>>> 78b1d651b6c0ef95d1a5b7630ed14ca479735857
import java.util.ArrayList;
import java.util.Objects;

public class Release {

    final private String id;
    private String artist;
    private String title;

<<<<<<< HEAD
    private final ArrayList<Track> trackList;
=======
    final private ArrayList<Track> trackList;
>>>>>>> 78b1d651b6c0ef95d1a5b7630ed14ca479735857

    public Release(String id){
        if(id == null || id.isEmpty()) throw new IllegalArgumentException();
        else {
            this.id = id;
            this.trackList = new ArrayList<>();
        }
    }

    public void addTrack(Track T){
        this.trackList.add(T);
    }

    public void removeTrack(Track T){
        this.trackList.remove(T);
    }

    public String getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {

        if(this.trackList.isEmpty() || ((Release)obj).trackList.isEmpty()
        || this.trackList.size() != ((Release)obj).trackList.size()) return false;

        ArrayList<String> aux = new ArrayList<>();
        for(Track t : this.trackList){
            aux.add(t.recording());
        }

        for(Track t : ((Release)obj).trackList){
            if(!aux.contains(t.recording())) return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        if(trackList.isEmpty()) return super.hashCode();
        int hash = 0;
        for(Track t : trackList){
            hash+=Objects.hash(t.recording());
        }
        return hash;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("(" + this.id + "): " + this.title + " de " + this.artist + " con las siguientes pistas:\n");
        for(Track t : trackList){
<<<<<<< HEAD
            sb.append("- (").append(t.id()).append("): ").append(t.title()).append(" de ").append(t.artist()).append(" con duracion ").append(t.duration()).append("s [").append(t.recording()).append("]\n");
=======
            sb.append("- (" + t.id() + "): " + t.title() + " de " + t.artist() + " con duracion " + t.duration() + "s [" + t.recording() + "]\n");
>>>>>>> 78b1d651b6c0ef95d1a5b7630ed14ca479735857
        }
        return sb.toString();
    }
}
