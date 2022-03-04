import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
private static final String CSV_PATH = "data/vendas-games.csv";

    public static void main(String[] args) throws IOException {
        csvReader csv = new csvReader();

        ArrayList<Jogo> arrayJogos =  csvReader.readCSV(CSV_PATH);

        // 1. Filtrar e criar um ArrayList (ou coleção equivalente) buscando jogos de plataformas especificas.
        String platform = "PS4";
        System.out.println("Showing games only in " + platform + "\n");
        arrayJogos.forEach(jogo -> jogo.filterByPlatform(platform));

        // 2. Filtrar e cirar um ArrayList (ou coleção equivalente) buscando jogos de publishers específicas.
        String publisher = "Activision";
        System.out.println("Showing games made by " + publisher + "\n");
        arrayJogos.forEach(jogo -> jogo.filterByPublisher(publisher));

    }
}
