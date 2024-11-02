package software.ulpgc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenreHistogramElementBuilder implements HistogramElementBuilder{
    private final Map<String, Integer> map;

    public GenreHistogramElementBuilder(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public List<HistogramElement> build() {
        ArrayList<HistogramElement> elements = new ArrayList<>();
        for (String s : map.keySet()) {
            elements.add(new HistogramElement(s, map.get(s)));
        }
        return elements;
    }
}
