package ca.bcit.comp2522.lab08.processor;

import java.util.Collections;
import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class AnyStartingWithZ extends CountriesProcessor {

    private static final char START_CHAR = 'Z';

    /**
     * Creates a new processor.
     */
    public AnyStartingWithZ() {
        super("Any Name Starts with '" + AnyStartingWithZ.START_CHAR + "'");
    }

    @Override
    public List<String> process(final List<String> countries) {
        final boolean result;
        final String resultString;

        result = countries.stream().anyMatch((name) -> name.startsWith(String.valueOf(AnyStartingWithZ.START_CHAR)));
        resultString = String.valueOf(result);

        return Collections.singletonList(resultString);
    }

}
