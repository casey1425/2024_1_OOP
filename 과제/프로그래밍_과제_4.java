import java.util.Scanner;

public class 프로그래밍_과제_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String id = "hong18";
        String password = "myongji70";
        int count = 0;
        while(count < 5){
            System.out.print("ID를 입력하세요 : ");
            String inputID = sc.next();
            System.out.print("암호를 입력하세요 : ");
            String inputPassword = sc.next();
            if(inputID.equals(id) && inputPassword.equals(password)){
                System.out.println("환영합니다");
                break;
            }else if(inputID.equals(id)){
                System.out.println("암호가 틀렸습니다");
            }else{
                System.out.println("ID가 틀렸습니다");
            }
            count++;
        }
        if(count == 5){
            System.out.println("접속을 거부합니다");
        }
    }
}
