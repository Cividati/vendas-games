import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.util.List;

public class Main {
private static final String CSV_PATH = "data/vendas-games.csv";

    public static void main(String[] args) throws IOException {
        csvReader csv = new csvReader();

        csvReader.readCSV(CSV_PATH);
    }
}
