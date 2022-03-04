import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
private static final String CSV_PATH = "data/vendas-games.csv";

    public static void main(String[] args) throws IOException {
        csvReader csv = new csvReader();

        ArrayList<Jogo> arrayJogos =  csvReader.readCSV(CSV_PATH);

        // 1. Filtrar e criar um ArrayList (ou coleção equivalente) buscando jogos de plataformas especificas. Exemplo: Filtrar no CSV jogos para PS4, ou para PC.
        String platform = "PS4";
        arrayJogos.forEach(jogo -> {
            if (jogo.getPlatform().equals(platform)){
                jogo.show();
            }
        });
    }
}
