package software.ulpgc;

import java.util.List;

public class GenrePrinterHistogram implements PrinterHistogram{
    private final List<HistogramElement> histogramElements;

    public GenrePrinterHistogram(GenreHistogramElementBuilder elementBuilder) {
        this.histogramElements = elementBuilder.build();
    }

    @Override
    public void printHistogram() {
        for (HistogramElement histogramElement : histogramElements) {
            int barlength = histogramElement.getValue()/1000;
            System.out.printf("%s | %s (%d)%n", histogramElement.getGenre(), "|".repeat(barlength), histogramElement.getValue());
        }
    }
}
