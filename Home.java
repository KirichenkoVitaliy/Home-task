import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Java. exchange of values
 *
 * @author Vitaliy Kirichenko
 * @version dated Sep 19, 2020
 */

public class Home {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int lesson=scanner.nextInt();
        int start = 9 * 60;
        int lessonTime = 45;
        int small = 5;
        int big = 15;

        int m = start + lessonTime * lesson;
        int breakTimeSmall = (lesson-1) * small;
        int breakTimeBig = (lesson-1)/2 * (big - small);
        m = m + breakTimeSmall + breakTimeBig;
        System.out.println(m/60+" "+m%60);
    }
}

