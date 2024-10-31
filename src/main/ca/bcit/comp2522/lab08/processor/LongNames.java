package ca.bcit.comp2522.lab08.processor;

import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class LongNames extends CountriesProcessor {

    private static final int MIN_CHARS = 10;

    /**
     * Creates a new processor.
     */
    public LongNames() {
        super("Country names longer than " + LongNames.MIN_CHARS + " characters");
    }

    @Override
    public List<String> process(final List<String> countries) {
        return countries.stream().filter(name -> name.length() > LongNames.MIN_CHARS).toList();
    }

}
