import java.sql.SQLOutput;
import java.util.Scanner;

public class Yey {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열의 길이 입력 : ");
        int arrNum = scanner.nextInt();
        int[] arr = new int [arrNum];

        System.out.println(arrNum + "개의 값 입력 : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();

        }
        int max = arr[0];
        int min = arr[0];
        for(int k = 0; k <arr.length; k++){
            if(max<arr[k]) {
                max = arr[k];
            }
            if (min>arr[k]) {
                min = arr[k];
            }
        }
        System.out.println("최댓값은 : "+max);
        System.out.println("최솟값은 : "+min);
    }
}
