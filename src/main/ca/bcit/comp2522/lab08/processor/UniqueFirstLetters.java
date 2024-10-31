package ca.bcit.comp2522.lab08.processor;

import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class UniqueFirstLetters extends CountriesProcessor {

    /**
     * Creates a new processor.
     */
    public UniqueFirstLetters() {
        super("Unique First Letters");
    }

    @Override
    public List<String> process(final List<String> countries) {
        final int firstIndex;
        firstIndex = 0;

        return countries.stream().map((name) -> name.substring(firstIndex, firstIndex + 1)).distinct().toList();
    }

}
