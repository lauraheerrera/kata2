package software.ulpgc;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Usuario\\Downloads\\title.basics.tsv");
        FileTitleLoader titleLoader = new FileTitleLoader(file, new TsvTitleDeserializer());
        List<Title> titles = titleLoader.load();

        HashMap<String, Integer> stats = new HashMap<>();

        for (Title title : titles) {
            for (String s : title.getGenre()) {
                stats.put(s, stats.getOrDefault(s, 0)+1);

            }

        }

        GenrePrinterHistogram genrePrinterHistogram = new GenrePrinterHistogram(new GenreHistogramElementBuilder(stats));
        genrePrinterHistogram.printHistogram();
    }
}
