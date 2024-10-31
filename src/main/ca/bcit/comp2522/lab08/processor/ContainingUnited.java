package ca.bcit.comp2522.lab08.processor;


import java.util.List;

/**
 * Represents a country name processor.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class ContainingUnited extends CountriesProcessor {

    private static final String CONTAIN_SEQUENCE = "United";

    /**
     * Creates a new processor.
     */
    public ContainingUnited() {
        super("Country names that contain \"" + ContainingUnited.CONTAIN_SEQUENCE + "\"");
    }

    @Override
    public List<String> process(final List<String> countries) {
        return countries.stream().filter(name -> name.contains(ContainingUnited.CONTAIN_SEQUENCE)).toList();
    }

}
