import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Jogo {

    public Jogo() {

    }

    @CsvBindByName
    private int rank;

    @CsvBindByName(column = "name", required = true)
    private String name;

    @CsvBindByName(column = "platform", required = true)
    private String platform;

    @CsvBindByName(column = "year", required = true)
    private int year;

    @CsvBindByName(column = "genre", required = true)
    private String genre;

    @CsvBindByName(column = "publisher", required = true)
    private String publisher;

    @CsvBindByName(column = "na_sales", required = true)
    private float na_sales;

    @CsvBindByName(column = "eu_sales", required = true)
    private float eu_sales;

    @CsvBindByName(column = "jp_sales", required = true)
    private float jp_sales;

    @CsvBindByName(column = "other_sales", required = true)
    private float other_sales;

    @CsvBindByName(column = "global_sales", required = true)
    private float global_sales;

    public void show() {
        System.out.println("Nome: " + this.getName());
        System.out.println("Rank: " + this.getRank());
        System.out.println("Platform: "+ this.getPlatform());
        System.out.println("------------------");
    }

    public void filterByPlatform(String platform){
        if (this.getPlatform().equals(platform)){
            this.show();
        }
    }

    public void filterByPublisher(String publisher){
        if (this.getPublisher().equals(publisher)){
            this.show();
        }
    }
}
