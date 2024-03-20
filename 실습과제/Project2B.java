import java.util.Scanner;

public class Project2B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name, birth;
        System.out.print("이름을 입력하세요: ");
        name=sc.nextLine();
        System.out.print("생년월일(mm/dd/yy)을 입력하세요: ");
        birth=sc.nextLine();
        String[] arr=birth.split("/");
        System.out.println("이름: "+name);
        System.out.println("생년월일: "+arr[2]+"."+arr[0]+"."+arr[1]);
    }
}