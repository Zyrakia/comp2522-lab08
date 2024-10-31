package ca.bcit.comp2522.lab08.processor;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class LongestName extends CountriesProcessor {

    /**
     * Creates a new processor.
     */
    public LongestName() {
        super("Longest Country Name");
    }

    @Override
    public List<String> process(final List<String> countries) {
        final Optional<String> result;

        result = countries.stream().reduce((identity, name) -> identity.length() > name.length() ? identity : name);

        if (result.isEmpty()) {
            return Collections.emptyList();
        }

        return Collections.singletonList(result.get());
    }

}
