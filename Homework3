import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 정수의 개수를 입력하세요.\n");
        int n = sc.nextInt();

        int[] num = new int[n];
        System.out.println(n + "개의 정수를 입력하세요.\n");
        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int max = num[0];
        int min = num[0];

        for(int i = 1; i < n; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.printf("최소값 : %d\n", min);
        System.out.printf("최대값 : %d\n", max);
    }
}
