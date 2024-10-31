package ca.bcit.comp2522.lab08.processor;

import java.util.Comparator;
import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class ReverseAlphabetical extends CountriesProcessor {

    /**
     * Creates a new processor.
     */
    public ReverseAlphabetical() {
        super("Country names (Descending)");
    }

    @Override
    public List<String> process(final List<String> countries) {
        return countries.stream().sorted(Comparator.reverseOrder()).toList();
    }

}
