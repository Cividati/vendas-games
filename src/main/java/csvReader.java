import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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
    public static ArrayList<Jogo> readCSV(String file) throws IOException {

        try (
                Reader reader = Files.newBufferedReader(Paths.get(file));
        ) {
            CsvToBean<Jogo> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Jogo.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Iterator<Jogo> csvJogoIterator = csvToBean.iterator();
            ArrayList<Jogo> arrayJogo = new ArrayList<>();

            while (csvJogoIterator.hasNext()) {
                Jogo csvJogo = csvJogoIterator.next();
                arrayJogo.add(csvJogo);
                // System.out.println("Rank : " + csvUser.getRank());
            }

            return arrayJogo;
        }

    }

}
