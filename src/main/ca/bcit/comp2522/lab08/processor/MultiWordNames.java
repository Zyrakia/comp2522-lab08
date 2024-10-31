package ca.bcit.comp2522.lab08.processor;

import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class MultiWordNames extends CountriesProcessor {

    /**
     * Creates a new processor.
     */
    public MultiWordNames() {
        super("Country Names with More Than One Word");
    }

    @Override
    public List<String> process(final List<String> countries) {
        return countries.stream().filter(name -> name.contains(" ")).toList();
    }

}
