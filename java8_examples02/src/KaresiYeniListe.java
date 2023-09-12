import java.util.List;

public class KaresiYeniListe {

 /*   Soru:
    Bir liste içindeki sayıların karesini alarak yeni bir liste oluşturmanız gerekiyor.
    Ancak bu işlemi Java 8 Stream API'sini kullanarak yapmalısınız. İşte girdi ve çıktı örnekleri:
    Girdi: [2, 4, 6, 8, 10]
    Çıktı: [4, 16, 36, 64, 100]*/

    public static void main(String[] args) {

        List<Integer> number = List.of(2,4,6,8,10);
        List<Integer> numberSquare = number.stream().
                map(e->e*e).
                toList();
        System.out.println(numberSquare);

    }








}
