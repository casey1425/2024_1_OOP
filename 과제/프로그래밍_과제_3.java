import java.util.Scanner;

public class 프로그래밍_과제_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("온도를 입력하세요 : ");
        double temp = sc.nextDouble();
        System.out.print("화씨 온도이면 'F'(혹은 'f'), 섭씨 온도이면 'C'(혹은 'c')를 입력하세요 : ");
        char kind = sc.next().charAt(0);
        if(kind == 'F' || kind == 'f'){
            System.out.println("화씨"+temp+"도= 섭씨"+((temp-32)*5/9)+"도");
        }else if(kind == 'C' || kind == 'c'){
            System.out.println("섭씨"+temp+"도 = 화씨"+(temp*9/5+32)+"도");
        }else{
            System.out.println("섭씨도 화씨도 아니다 - ");
            System.out.println("온도 변환을 할 수 없다 - ");
            System.out.println("다음 번에는 화씨 온도이면 'F'(혹은 'f'), 섭씨 온도이면 'C'(혹은 'c')를 입력하세요 - ");
        }
    }
}
