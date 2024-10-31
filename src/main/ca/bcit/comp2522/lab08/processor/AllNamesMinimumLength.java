package ca.bcit.comp2522.lab08.processor;

import java.util.Collections;
import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class AllNamesMinimumLength extends CountriesProcessor {

    private static final int MIN_LENGTH = 3;

    /**
     * Creates a new processor.
     */
    public AllNamesMinimumLength() {
        super("All Names Longer Than " + AllNamesMinimumLength.MIN_LENGTH + " Characters");
    }

    @Override
    public List<String> process(final List<String> countries) {
        final boolean result;
        final String resultString;

        result = countries.stream().allMatch(name -> name.length() > AllNamesMinimumLength.MIN_LENGTH);
        resultString = String.valueOf(result);

        return Collections.singletonList(resultString);
    }

}
