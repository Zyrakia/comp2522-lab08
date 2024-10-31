package ca.bcit.comp2522.lab08.processor;

import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class UpperNames extends CountriesProcessor {

    /**
     * Creates a new processor.
     */
    public UpperNames() {
        super("Uppercase Country Names");
    }

    @Override
    public List<String> process(final List<String> countries) {
        return countries.stream().map(String::toUpperCase).toList();
    }

}
