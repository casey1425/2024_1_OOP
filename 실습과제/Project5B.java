import java.util.Scanner;

public class Project5B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num=sc.nextInt();
        System.out.println("반복결과 : "+sum1(num));
        System.out.println("재귀결과 : "+sum2(num));
    }
    //반복문
    public static int sum1(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    //재귀메소드
    public static int sum2(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + sum2(num / 10);
        }
    }
}