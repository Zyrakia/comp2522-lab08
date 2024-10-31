package ca.bcit.comp2522.lab08.processor;


import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class EndingWithLand extends CountriesProcessor {

    private static final String SUFFIX = "land";

    /**
     * Creates a new processor.
     */
    public EndingWithLand() {
        super("Country names that end with \"" + EndingWithLand.SUFFIX + "\"");
    }

    @Override
    public List<String> process(final List<String> countries) {
        return countries.stream().filter(name -> name.endsWith(EndingWithLand.SUFFIX)).toList();
    }

}
