package software.ulpgc;

public class HistogramElement {
    private final String genre;
    private final int value;

    public String getGenre() {
        return genre;
    }

    public int getValue() {
        return value;
    }

    public HistogramElement(String genre, int value) {
        this.genre = genre;
        this.value = value;
    }
}
