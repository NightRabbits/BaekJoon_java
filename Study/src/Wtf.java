import java.util.*;

//백준 if 문제
public class Wtf {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("시험 점수를 입력하세요 : ");
        score = scanner.nextInt();

        if (90 <= score && score <= 100) {
            System.out.println("A");
        } else if (80 <= score && score < 90) {
            System.out.println("B");
        } else if (70 <= score && score < 80) {
            System.out.println("C");
        } else if (60 <= score && score < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        System.out.println(score);
    }
}



