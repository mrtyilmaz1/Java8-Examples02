import java.util.List;

public class PozitiveSum {

/*    Soru:
    Bir liste içindeki tüm pozitif tam sayıları alarak bu sayıları toplamak için bir Java programı yazmanız gerekiyor.
            Ancak, bu işlemi Java 8'in Stream API'si kullanarak yapmalısınız. İşte girdi ve çıktı örnekleri:
    Girdi: [3, -1, 8, -2, 5, 12]
    Çıktı: Toplam: 28
    */
    public static void main(String[] args) {
        List<Integer> list = List.of(3,-1,8,-2,5,12);
        list.stream()
                .filter(e -> e > 0)
                .reduce((a,b) -> a + b)
                .stream().forEach(System.out::println);

    }
}
