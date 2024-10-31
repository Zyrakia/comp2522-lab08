package ca.bcit.comp2522.lab08.filter;

import java.util.List;

/**
 * Represents a country name length filter.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class LongCountryNames extends CountriesProcessor {

    private static final int MIN_CHARS = 10;

    /**
     * Creates a new filter.
     */
    public LongCountryNames() {
        super("Country names longer than " + LongCountryNames.MIN_CHARS +
                      " characters");
    }

    @Override
    public List<String> process(final List<String> countries) {
        return countries.stream()
                .filter(name -> name.length() > LongCountryNames.MIN_CHARS)
                .toList();
    }

}
