package software.ulpgc;

import java.util.List;

public class Title {
    private final String title;
    private final List<String> genre;

    public Title(String title, List<String> genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                '}';
    }

    public List<String> getGenre() {
        return genre;
    }
}
