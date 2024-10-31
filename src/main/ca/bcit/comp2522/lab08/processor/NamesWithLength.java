package ca.bcit.comp2522.lab08.processor;

import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class NamesWithLength extends CountriesProcessor {

    /**
     * Creates a new processor.
     */
    public NamesWithLength() {
        super("Country Names to Character Count");
    }

    @Override
    public List<String> process(final List<String> countries) {
        return countries.stream().map(name -> String.format("%s: %d characters", name, name.length())).toList();
    }

}
