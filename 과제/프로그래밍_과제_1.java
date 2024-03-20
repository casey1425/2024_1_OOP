package day_0306과제;

import java.util.Scanner;

public class 프로그래밍_과제_1B {
	public static void main(String[] args) {
		int beforeScore=0, ingScore=0, afterScore=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("실습 전 과제 점수를 입력하세요 : ");
		beforeScore=sc.nextInt();
		System.out.print("실습 과제 점수를 입력하세요 : ");
		ingScore=sc.nextInt();
		System.out.print("실습 후 과제 점수를 입력하세요 : ");
		afterScore=sc.nextInt();
		double beforeAssignmentRatio = (double) beforeScore / 20;
        double practiceRatio = (double) ingScore / 25;
        double afterAssignmentRatio = (double) afterScore / 30;
        double finalScore = (beforeAssignmentRatio + afterAssignmentRatio) * 28 + practiceRatio * 40;

        System.out.println("실습전 과제 점수 = " + beforeScore);
        System.out.println("실습 과제 점수 = " + ingScore);
        System.out.println("실습후 과제 점수 = " + afterScore);
        System.out.println("최종 실습 점수 = " + finalScore);
	}
}