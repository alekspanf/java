import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {

        String str = "Good morning/ Yes?/ No/ Tea will be hot/";
        String[] words = str.split("/");//метод split разделяет строки на подстроки,
        // собираются в массив и представляют его возвращаемое значение regex ищет нужный символ
        for (String word : words) {
            System.out.println(word);
        }
    }
}
