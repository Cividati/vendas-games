import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class csvReader {
    // Java code to illustrate reading a
    // CSV file line by line
    public static void readCSV(String file) throws IOException {

        try (
                Reader reader = Files.newBufferedReader(Paths.get(file));
        ) {
            CsvToBean<Jogo> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Jogo.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<Jogo> csvUserIterator = csvToBean.iterator();

            while (csvUserIterator.hasNext()) {
                Jogo csvUser = csvUserIterator.next();
                System.out.println("Rank : " + csvUser.getRank());
                System.out.println("Name : " + csvUser.getName());
                System.out.println("==========================");
            }
        }

    }
    // Java code to illustrate reading a
    // all data at once
    public static void readAllDataAtOnce(String file)
    {
        try {
            // Create an object of file reader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvReader object and skip first Line
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(1)
                    .build();
            List<String[]> allData = csvReader.readAll();

            // print Data
            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
