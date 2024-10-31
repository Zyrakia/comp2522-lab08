package ca.bcit.comp2522.lab08.processor;

import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class TotalCount extends CountriesProcessor {

    /**
     * Creates a new processor.
     */
    public TotalCount() {
        super("Count of Countries");
    }

    @Override
    public List<String> process(final List<String> countries) {
        final long count;
        final String countString;

        count = countries.stream().count();
        countString = String.valueOf(count);

        return List.of(countString);
    }

}
