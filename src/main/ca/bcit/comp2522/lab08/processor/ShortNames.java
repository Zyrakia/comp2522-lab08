package ca.bcit.comp2522.lab08.processor;

import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class ShortNames extends CountriesProcessor {

    private static final int MAX_CHARS = 5;

    /**
     * Creates a new processor.
     */
    public ShortNames() {
        super("Country names shorter than " + ShortNames.MAX_CHARS + " characters");
    }

    @Override
    public List<String> process(final List<String> countries) {
        return countries.stream().filter(name -> name.length() < ShortNames.MAX_CHARS).toList();
    }

}
