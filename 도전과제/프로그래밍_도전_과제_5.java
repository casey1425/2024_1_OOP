import java.util.Scanner;

public class 프로그래밍_도전_과제_5 {
    public static int getNumber(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int romanToDecimal(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            int current = getNumber(roman.charAt(i));
            int next = 0;
            if (i + 1 < roman.length()) {
                next = getNumber(roman.charAt(i + 1));
            }
            if (current < next) {
                result += next - current;
                i++;
            } else {
                result += current;
            }
        }
        return result;
    }

    public static void decimalToOctal(int decimal) {
        if (decimal == 0) {
            return;
        }
        decimalToOctal(decimal / 8);
        System.out.print(decimal % 8);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("로마 숫자를 입력하세요 : ");
        String roman = sc.next();
        int decimal = romanToDecimal(roman);
        System.out.println("10진수로 변환 : " + decimal);
        System.out.print("8진수로 변환 : ");
        decimalToOctal(decimal);
        sc.close();
    }
}