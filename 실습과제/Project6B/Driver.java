import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        City city = new City("", 0, 0);

        boolean continueLoop = true;
        while (continueLoop) {
            // 도시 정보 입력
            city.setCityInfoFromInput(scanner);

            // 입력 받은 도시 정보 출력
            System.out.println("입력된 도시 정보:");
            city.printCityInfo();

            // 10년 후 예상 인구 계산 및 출력
            int futurePopulation = city.calculatePopulation(10);
            System.out.println("10년 후 예상 인구: " + futurePopulation);

            // 계속 진행 여부 확인
            System.out.print("계속하시겠습니까? (true 혹은 false): ");
            String input = scanner.next();
            continueLoop = input.equalsIgnoreCase("true");
        }
        scanner.close();
    }
}