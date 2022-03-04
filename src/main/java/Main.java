import java.util.List;

public class Main {

    public static void main(String[] args) {
        csvReader csv = new csvReader();
        csvReader.readAllDataAtOnce("data/vendas-games.csv");

    }
}
