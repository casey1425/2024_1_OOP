import java.util.Scanner;

public class 프로그래밍_과제_5 {
    // 1. 입력받은 수보다 작거나 같은 가장 큰 10의 거듭제곱 수를 반환
    public static int getMaxPowerOfTen(int num) {
        int power = 1;
        while (power * 10 <= num) {
            power *= 10;
        }
        return power;
    }
    // 2. 숫자에 해당하는 수사를 반환
    public static String getNumberWord(int num) {
        switch (num) {
            case 0:
                return "영";
            case 1:
                return "하나";
            case 2:
                return "둘";
            case 3:
                return "셋";
            case 4:
                return "넷";
            case 5:
                return "다섯";
            case 6:
                return "여섯";
            case 7:
                return "일곱";
            case 8:
                return "여덟";
            case 9:
                return "아홉";
            default:
                return "";
        }
    }
    // 3. 반복문을 이용한 양의 정수를 수사로 변환하여 출력
    public static void printNumberWordsIterative(int num) {
        int power = getMaxPowerOfTen(num);
        while (power > 0) {
            int digit = num / power;
            System.out.print(getNumberWord(digit) + " ");
            num %= power;
            power /= 10;
        }
        System.out.println();
    }

    // 4. 재귀 메소드를 이용한 양의 정수를 수사로 변환하여 출력
    public static void printNumberWordsRecursive(int num) {
        int power = getMaxPowerOfTen(num);
        printNumberWordsRecursiveHelper(num, power);
        System.out.println();
    }

    private static void printNumberWordsRecursiveHelper(int num, int power) {
        if (power == 0) return;
        int digit = num / power;
        System.out.print(getNumberWord(digit) + " ");
        printNumberWordsRecursiveHelper(num % power, power / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");
        int num = sc.nextInt();
        System.out.println("반복문을 이용한 결과:");
        printNumberWordsIterative(num);
        System.out.println("재귀 메소드를 이용한 결과:");
        printNumberWordsRecursive(num);
        sc.close();
    }
}