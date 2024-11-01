package ca.bcit.comp2522.lab08;

import ca.bcit.comp2522.lab08.processor.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * The driver class for Lab 8 of COMP2522.
 *
 * @author Ole Lammers, Tianyou Xie
 * @version 1.0
 */
public class CountryLab {

    public static final CountriesProcessor[] PROCESSORS = { new LongNames(), new ShortNames(), new StartingWithA(),
                                                            new EndingWithLand(), new ContainingUnited(),
                                                            new Alphabetical(), new ReverseAlphabetical(),
                                                            new UniqueFirstLetters(), new TotalCount(),
                                                            new LongestName(), new ShortestName(), new UpperNames(),
                                                            new MultiWordNames(), new NamesWithLength(),
                                                            new AnyStartingWithZ(), new AllNamesMinimumLength() };

    /**
     * Entry point for the driver class.
     *
     * @param args the command line arguments
     */
    public static void main(final String[] args) throws IOException {
        final List<String> countries;
        countries = Files.readAllLines(Paths.get("countries.txt"));

        final Path matchesDirectoryPath;
        matchesDirectoryPath = Paths.get("matches");
        if (Files.notExists(matchesDirectoryPath)) {
            Files.createDirectory(matchesDirectoryPath);
        }

        final Path outputFilePath;
        outputFilePath = matchesDirectoryPath.resolve("data.txt");
        if (Files.notExists(outputFilePath)) {
            Files.createFile(outputFilePath);
        } else {
            Files.writeString(outputFilePath, "", StandardOpenOption.TRUNCATE_EXISTING);
        }

        for (int i = 0; i < CountryLab.PROCESSORS.length; i++) {
            final CountriesProcessor processor = CountryLab.PROCESSORS[i];
            if (processor == null) {
                continue;
            }

            final List<String> linesToWrite;
            linesToWrite = new ArrayList<>();

            linesToWrite.add(processor.getTitle() + ":");
            linesToWrite.addAll(processor.process(countries));

            if (i != CountryLab.PROCESSORS.length - 1) {
                linesToWrite.add("");
            }

            Files.write(outputFilePath, linesToWrite, StandardOpenOption.APPEND);
        }
    }

}
