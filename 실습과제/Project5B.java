import java.util.Scanner;

public class Project5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");
        int num = sc.nextInt();

        int num1 = num1(num);
        int num2 = num2(num);

        System.out.println("반복을 사용한 짝수 숫자의 개수: " + num1);
        System.out.println("재귀를 사용한 짝수 숫자의 개수: " + num2);
    }

    //반복을 이용
    public static int num1(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    //재귀를 이용
    public static int num2(int num) {
        if (num < 10) {
            return num % 2 == 0 ? 1 : 0;
        } else {
            int lastDigit = num % 10;
            int remaining = num / 10;
            if (lastDigit % 2 == 0) {
                return num2(remaining) + 1;
            } else {
                return num2(remaining);
            }
        }
    }
}