package ca.bcit.comp2522.lab08;

import ca.bcit.comp2522.lab08.filter.CountriesProcessor;
import ca.bcit.comp2522.lab08.filter.LongCountryNames;

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
public class Main {

    public static final CountriesProcessor[] FILTERS = {
            new LongCountryNames() };

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
        }

        for (final CountriesProcessor filter : Main.FILTERS) {
            final List<String> linesToWrite;
            linesToWrite = new ArrayList<>();

            linesToWrite.add(filter.getTitle() + ":");
            linesToWrite.addAll(filter.process(countries));
            linesToWrite.add("");

            Files.write(outputFilePath, linesToWrite,
                        StandardOpenOption.APPEND);
        }
    }

}
