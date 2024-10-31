package ca.bcit.comp2522.lab08.processor;

import java.util.List;

/**
 * Represents a processor that can operate on a list of country names.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public abstract class CountriesProcessor {

    private final String title;

    /**
     * Creates a new processor.
     *
     * @param title the title of the processor
     */
    public CountriesProcessor(final String title) {
        CountriesProcessor.validateTitle(title);
        this.title = title;
    }

    /**
     * Validates the given title to ensure it is within limits.
     *
     * @param title the title
     */
    private static void validateTitle(final String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Processor title cannot be empty or null.");
        }

        if (title.contains(System.lineSeparator())) {
            throw new IllegalArgumentException("Processor title must be a single line.");
        }
    }

    /**
     * Takes in a list of country names and reduces or processes them into a
     * list of strings that represent the processor result.
     *
     * @param countries the list of countries
     * @return the list of strings representing the result
     */
    public abstract List<String> process(List<String> countries);

    /**
     * Returns the title of this processor.
     *
     * @return the title
     */
    public final String getTitle() {
        return this.title;
    }

}
