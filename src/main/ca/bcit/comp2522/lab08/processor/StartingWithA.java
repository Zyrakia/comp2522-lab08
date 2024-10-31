package ca.bcit.comp2522.lab08.processor;


import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class StartingWithA extends CountriesProcessor {

    private static final char START_CHAR = 'A';

    /**
     * Creates a new processor.
     */
    public StartingWithA() {
        super("Country names starting with '" + StartingWithA.START_CHAR + "'");
    }

    @Override
    public List<String> process(final List<String> countries) {
        return countries.stream().filter(name -> name.startsWith(String.valueOf(StartingWithA.START_CHAR))).toList();
    }

}
