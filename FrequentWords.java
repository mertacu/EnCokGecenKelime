import java.util.HashMap;
import java.util.Scanner;

public class FrequentWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kelimelerden oluşan metni giriniz : ");

        String text = input.nextLine();

        //metni kelimelere ayır
        String[] words = text.split("\\s+");

        //hashmap oluştur
        HashMap<String, Integer> wordCount = new HashMap<>();

        //kelimeleri hashmape ekleyip çoğunlukta olan kelimeyi bul
        String mostFrequentWrd = null;
        int maxCount = 0;

        for (String word : words) {
            int count = wordCount.getOrDefault(word, 0) + 1;
            wordCount.put(word, count);

            if (count > maxCount) {
                mostFrequentWrd = word;
                maxCount = count;
            }
        }

        //sonucu ekrana yazdır
        if (mostFrequentWrd != null) {
            System.out.println("En çok kullanılan kelime : " + mostFrequentWrd);
            System.out.println("Kullanım sayısı ise : " + maxCount);
        } else {
            System.out.println("Oluşturmuş olduğunuz metinde kelime bulunmamaktadır.");
        }
    }
}
