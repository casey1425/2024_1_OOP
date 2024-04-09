import java.util.Scanner;

public class City {
    private String name;
    private int population;
    private double growthRate;

    // 생성자
    public City(String name, int population, double growthRate) {
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }

    // 입력 받은 도시 정보 설정
    public void setCityInfoFromInput(Scanner scanner) {
        System.out.print("도시의 이름을 입력하세요: ");
        this.name = scanner.next();

        // 음수가 입력될 때까지 인구를 입력받음
        do {
            System.out.print("도시의 인구를 입력하세요: ");
            this.population = scanner.nextInt();
        } while (this.population < 0);

        System.out.print("인구 증가율을 입력하세요: ");
        this.growthRate = scanner.nextDouble();
    }

    // 예상 인구 계산
    public int calculatePopulation(int yearsLater) {
        double growthFactor = 1 + (this.growthRate / 100);
        return (int) (this.population * Math.pow(growthFactor, yearsLater));
    }

    // 도시 정보 출력
    public void printCityInfo() {
        System.out.println("도시 이름: " + this.name);
        System.out.println("도시 인구: " + this.population);
        System.out.println("인구 증가율: " + this.growthRate + "%");
    }

    // Getter 및 Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }
}