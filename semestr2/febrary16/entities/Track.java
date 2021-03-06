package febrary16.entities;

import java.net.URI;

/**
 * Created by Максим on 14.02.2017.
 */
public class Track implements Comparable<Track> {
    private String title;
    private String format;
    private int duration;
    private Composer composer;
    private Cover cover;
    private URI uri;

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Composer getComposer() {
        return composer;
    }

    public void setComposer(Composer composer) {
        this.composer = composer;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Track track = (Track) o;

        if (duration != track.duration) return false;
        if (title != null ? !title.equals(track.title) : track.title != null) return false;
        if (format != null ? !format.equals(track.format) : track.format != null) return false;
        if (composer != null ? !composer.equals(track.composer) : track.composer != null) return false;
        if (cover != null ? !cover.equals(track.cover) : track.cover != null) return false;
        return uri != null ? uri.equals(track.uri) : track.uri == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + duration;
        result = 31 * result + (composer != null ? composer.hashCode() : 0);
        result = 31 * result + (cover != null ? cover.hashCode() : 0);
        result = 31 * result + (uri != null ? uri.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Track o) {
        return title.compareToIgnoreCase(o.title);
    }
}
