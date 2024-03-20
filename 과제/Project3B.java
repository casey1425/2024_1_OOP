import java.util.Scanner;

public class Project3B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int attendance, homework, exam;
        boolean cheating;
        System.out.print("출석 점수를 입력하세요: ");
        attendance=sc.nextInt();
        System.out.print("과제 점수를 입력하세요: ");
        homework=sc.nextInt();
        System.out.print("시험 점수를 입력하세요: ");
        exam=sc.nextInt();
        System.out.print("부정행위 여부를 입력하세요(true 혹은 false): ");
        cheating=sc.nextBoolean();
        double total;
        total=attendance*0.2+homework*0.3+exam*0.5;
        if(cheating){
            System.out.println("총점: "+total);
            System.out.println("학점 : F");
            return;
        }
        if(total>100) total=100;
        if(total<0) total=0;
        System.out.println("총점: "+total);
        if(total>=90){
            System.out.println("학점: A");
        }else if(total>=80){
            System.out.println("학점: B");
        }else if(total>=70){
            System.out.println("학점: C");
        }else if(total>=60){
            System.out.println("학점: D");
        }else{
            System.out.println("학점: F");
        }
    }
}