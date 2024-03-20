import java.util.Scanner;

public class 도전과제2B {
    public static void main(String[] args) {
//키보드로부터 12 비트(bit)의 이진수를 문자열(String)의 형태로 입력을 받아 8진수로 변환하여 문자열의 형태로 출력하는 프로그램을 설계한 후 구현하라.
// 예를 들면, 입력 받은 문자열이 110101111011 이라면 변환한 8진수는 6573이어야 한다.
// 입력 받은 문자열이 000110101010 이라면 변환한 8진수는 0652이어야 한다.
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("12비트의 이진수를 입력하세요: ");
        name = sc.nextLine();
        int num = Integer.parseInt(name, 2);
        System.out.println("8진수로 변환한 결과: " + Integer.toOctalString(num));
    }
}
