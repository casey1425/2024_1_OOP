public class CheckCardAccount {
    public String name;//계좌 소유자 이름
    public String accountNumber;//계좌 번호
    public String expirationDate;//만기 연월
    public int balance;//잔액
    public CheckCardAccount(String name, String accountNumber, String expirationDate) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.balance = 0;
    }
    public boolean checkIdentity(String name, String accountNumber, String expirationDate) {
        return this.name.equals(name) && this.accountNumber.equals(accountNumber) && this.expirationDate.equals(expirationDate);
    }
public void useCheckCard(String name, String accountNumber, String expirationDate, int charge) {
        if (checkIdentity(name, accountNumber, expirationDate)) {
            balance += charge;
            if (balance < 0) {
                System.out.println("잔고 초과");
                balance -= charge;
            } else {
                System.out.println("신원 확인 성공");
            }
        } else {
            System.out.println("신원 확인 실패");
        }
    }
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(int amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("잔고 초과");
            }
        }
    }
    public String toString() {
        return "예금주 이름: " + name + "\n계좌번호: " + accountNumber + "\n만기연월: " + expirationDate + "\n잔고: " + balance;
    }
}