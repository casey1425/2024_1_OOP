import java.util.Scanner;

public class CountryDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 국가 객체 생성
        Country country = new Country("", 0, 0);

        // 인구 예측할 연수 입력
        System.out.print("인구를 예측할 연수를 입력하세요: ");
        int years = scanner.nextInt();

        // 국가 데이터 입력 및 출력
        country.inputCountryData(scanner);
        country.printCountryData();

        // 입력한 연수 후 인구 출력
        System.out.println(years + "년 후 예상 인구: " + country.calculatePopulationAfterYears(years));

        // 국가 데이터 변경 후 출력
        country.setCountryData("미국", 330000000, 0.35);
        country.printCountryData();

        // 변경한 연수 후 인구 출력
        System.out.println(years + "년 후 예상 인구: " + country.calculatePopulationAfterYears(years));

        scanner.close();
    }
}