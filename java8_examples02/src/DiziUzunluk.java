import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiziUzunluk {
/*    Soru:
    Bir dize (string) listesi içeren bir koleksiyonunuz (örneğin, ArrayList<String>) var.
    Bu dize listesindeki tüm dize uzunluklarının toplamını hesaplayan bir Java programı yazmanız gerekiyor.
    Ancak bu işlemi Java 8 Stream API'sini kullanarak yapmalısınız. İşte girdi ve çıktı örnekleri:
    Girdi: ["Merhaba", "Dünya", "Java", "Stream", "API"]
    Çıktı: Toplam Dize Uzunluğu: 25
    */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Merhaba", "Dünya", "Java", "Stream", "API"));

        list.stream()
                .map(String::length)
                .reduce((a,b)->a+b)
                .stream()
                .forEach(System.out::println);


    }

}
