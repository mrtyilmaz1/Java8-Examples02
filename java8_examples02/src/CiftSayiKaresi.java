import java.util.List;
import java.util.stream.IntStream;

public class CiftSayiKaresi {

/*    Soru:
    Bir liste içindeki çift sayıları bulan ve bu çift sayıların karelerini hesaplayan
    bir Java 8 işlevi (lambda ifadesi) nasıl çözünüz:
    Girdi -> 1, 2, 3, 4, 5, 6, 7, 8, 9, 10;
    Çıktı -> 4, 16 ...*/

    public static void main(String[] args) {
        List<Integer> numbers = IntStream.
                rangeClosed(1, 10)
                .boxed()// int tipinden Integere dönüştürmek için kullanılır.
                .toList();
        numbers.stream().filter(e -> e % 2 == 0).map(e -> e*e).forEach(System.out::println);

    }


}
