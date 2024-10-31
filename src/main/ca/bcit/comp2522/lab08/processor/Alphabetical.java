package ca.bcit.comp2522.lab08.processor;

import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class Alphabetical extends CountriesProcessor {

    /**
     * Creates a new processor.
     */
    public Alphabetical() {
        super("Country names (Ascending)");
    }

    @Override
    public List<String> process(final List<String> countries) {
        return countries.stream().sorted().toList();
    }

}
