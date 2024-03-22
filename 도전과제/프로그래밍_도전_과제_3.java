import java.util.Scanner;

public class 프로그래밍_도전_과제_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름은? ");
        String name = sc.nextLine();
        System.out.print("입학연도는? ");
        int year = sc.nextInt();
        System.out.print("입학 유형은(신입생 혹은 편입생)? ");
        String type = sc.next();
        int typeNum = 0;
        int sequenceNumber = 1; // 학번의 일련번호를 추적하기 위한 변수
        if (type.equals("신입생")) {
            typeNum = 2;
        } else if (type.equals("편입생")) {
            typeNum = 5;
        }
        System.out.println("이름: " + name);
        System.out.printf("학번: 60%02d%02d%03d\n", year % 100, typeNum, sequenceNumber);
        sc.close();
    }
}