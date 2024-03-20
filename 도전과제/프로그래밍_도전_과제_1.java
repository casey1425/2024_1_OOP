package day_0306과제;

import java.util.Scanner;

public class 프로그래밍_도전_과제_1B {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("물건의 가격을 입력하세요 (1,000원 이하): ");
        int itemPrice = sc.nextInt();
        
        int change = 1000 - itemPrice;
        
        int fiveHundreds = change / 500;
        change %= 500;
        int hundreds = change / 100;
        change %= 100;
        int fifties = change / 50;
        change %= 50;
        int tens = change / 10;
        change %= 10;
        int fives = change / 5;
        int ones = change % 5;
        System.out.println(itemPrice+"원 짜리 물건을 샀고 1000원을 내셨습니다.");
        System.out.println("거스름돈은 "+(1000-itemPrice)+"원입니다.");
        System.out.println("거스름돈의 내역은 다음과 같습니다:\n");
        System.out.println("500원 짜리 동전 갯수 = " + fiveHundreds);
        System.out.println("100원 짜리 동전 갯수 = " + hundreds);
        System.out.println("50원 짜리 동전 갯수 = " + fifties);
        System.out.println("10원 짜리 동전 갯수 = " + tens);
        System.out.println("5원 짜리 동전 갯수 = " + fives);
        System.out.println("1원 짜리 동전 갯수 = " + ones);
    }
}