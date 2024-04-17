import java.util.Scanner;

public class CheckCardAccountDriver {
    public static void main(String[] args) {
        // 체크카드 계좌 생성
        CheckCardAccount account = new CheckCardAccount("선남", "1001", "0912");
        //10만원을 입금
        System.out.println("100000원을 입금한다");
        account.deposit(100000);
        System.out.println("상품을 구매한다");
        Scanner sc = new Scanner(System.in);
        System.out.print("청구 금액을 입력하시오: ");
        int charge = sc.nextInt();
        System.out.print("고객 이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("고객 번호를 입력하세요: ");
        String accountNumber = sc.next();
        System.out.print("만기 연월을 입력하세요: ");
        String expirationDate = sc.next();
        //신원확인이 성공할때만 청구 및 신원 확인 성공 문구 출력, 실패하면 신원확인 실패 문구 출력
        if (account.checkIdentity(name, accountNumber, expirationDate)) {
            account.withdraw(charge);
            System.out.println("신원 확인 성공");
        } else {
            System.out.println("신원 확인 실패");
        }
        //계속할지 물어보기
        System.out.print("계속하시겠습니까? (true혹은 false): ");
        boolean isContinue = sc.nextBoolean();
        while (isContinue) {
            System.out.print("청구 금액을 입력하시오: ");
            charge = sc.nextInt();
            System.out.print("고객 이름을 입력하세요: ");
            name = sc.next();
            System.out.print("고객 번호를 입력하세요: ");
            accountNumber = sc.next();
            System.out.print("만기 연월을 입력하세요: ");
            expirationDate = sc.next();
            if (account.checkIdentity(name, accountNumber, expirationDate)) {
                account.withdraw(charge);
                System.out.println("신원 확인 성공");
                System.out.println(charge+"원을 출금한다.");
            } else {
                System.out.println("신원 확인 실패");
            }
            System.out.print("계속하시겠습니까? (true혹은 false): ");
            isContinue = sc.nextBoolean();
        }
        System.out.println(charge+"원을 출금한다.");
        account.withdraw(20000);
        System.out.println(account);
        System.exit(0);
    }
}