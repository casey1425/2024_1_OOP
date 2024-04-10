import java.util.Scanner;

public class Country {
    private String name;
    private int population;
    private double annualPopulationGrowthRate;

    // 생성자
    public Country(String name, int population, double annualPopulationGrowthRate) {
        this.name = name;
        this.population = population;
        this.annualPopulationGrowthRate = annualPopulationGrowthRate;
    }

    // 국가 데이터 입력
    public void inputCountryData(Scanner scanner) {
        System.out.println("국가 데이터를 입력하세요.");
        System.out.print("국가명: ");
        this.name = scanner.next();

        // 인구수가 음수이면 다시 입력 받음
        do {
            System.out.print("인구수: ");
            this.population = scanner.nextInt();
            if (this.population < 0) {
                System.out.println("오류: 인구수가 음수이다.");
            }
        } while (this.population < 0);

        System.out.print("연간 인구 증감율: ");
        this.annualPopulationGrowthRate = scanner.nextDouble();
    }

    // 각 속성 값 반환
    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getAnnualPopulationGrowthRate() {
        return annualPopulationGrowthRate;
    }

    // 국가 데이터 출력
    public void printCountryData() {
        System.out.println("국가 데이터:");
        System.out.println("국가명: " + this.name);
        System.out.println("인구수: " + this.population);
        System.out.println("연간 인구 증감율: " + this.annualPopulationGrowthRate);
    }

    // 연수 후 인구 계산
    public int calculatePopulationAfterYears(int years) {
        double growthFactor = 1 + (this.annualPopulationGrowthRate / 100);
        return (int) (this.population * Math.pow(growthFactor, years));
    }

    // Setter 메소드
    public void setCountryData(String name, int population, double annualPopulationGrowthRate) {
        this.name = name;
        this.population = population;
        this.annualPopulationGrowthRate = annualPopulationGrowthRate;
    }
}
