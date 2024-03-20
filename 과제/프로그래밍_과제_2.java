import java.util.Scanner;

public class 과제2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("과일 이름들을 입력하세요: ");
        name = sc.nextLine();
        String[] arr = name.split(" ");
        System.out.println(arr[3]+" "+arr[2]+" "+arr[1]+" "+arr[0]);
    }
}
