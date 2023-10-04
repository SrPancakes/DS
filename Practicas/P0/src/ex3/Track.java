package ex3;

import java.util.Objects;

public record Track (String id, String recording, String artist, String title, int duration){
    public Track{
        if(id == null || recording == null ||
                artist == null || title == null || duration <= 0) throw new IllegalArgumentException();
    }

    @Override
    public boolean equals(Object obj) {
        return recording.equals(((Track)obj).recording);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recording);
    }
}