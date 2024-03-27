import java.util.Scanner;

public class 프로그래밍_도전_과제_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요 (1~5000): ");
        int year = sc.nextInt();
        sc.close();

        if (year < 1 || year > 5000) {
            System.out.println("잘못 입력된 연도");
            return;
        }
        System.out.println("로마 숫자로 표현한 연도 : " + convertToRoman(year));
    }
    public static String convertToRoman(int year) {
        StringBuilder roman = new StringBuilder();
        while (year >= 1000) {
            roman.append("M");
            year -= 1000;
        }
        while (year >= 900) {
            roman.append("CM");
            year -= 900;
        }
        while (year >= 500) {
            roman.append("D");
            year -= 500;
        }
        while (year >= 400) {
            roman.append("CD");
            year -= 400;
        }
        while (year >= 100) {
            roman.append("C");
            year -= 100;
        }
        while (year >= 90) {
            roman.append("XC");
            year -= 90;
        }
        while (year >= 50) {
            roman.append("L");
            year -= 50;
        }
        while (year >= 40) {
            roman.append("XL");
            year -= 40;
        }
        while (year >= 10) {
            roman.append("X");
            year -= 10;
        }
        while (year >= 9) {
            roman.append("IX");
            year -= 9;
        }
        while (year >= 5) {
            roman.append("V");
            year -= 5;
        }
        while (year >= 4) {
            roman.append("IV");
            year -= 4;
        }
        while (year >= 1) {
            roman.append("I");
            year -= 1;
        }
        return roman.toString();
    }
}
