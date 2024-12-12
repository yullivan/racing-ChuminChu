package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Array;
import java.util.*;
import java.util.stream.Stream;


public class Application {

    public static void main(String[] args) {
        System.out.println("<부릉부릉 자동차 레이싱 게임>");

        //차 입력받기
        List<String> names = carGetInput();

        //사용자 횟수
        UserCount userCount = userGetInput();

        //차 이름이랑 위치 리스트
        // List<String> names -> List<Car> cars
        ArrayList<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }

        CarList carList = new CarList(cars);
        //carList는 3개만 적을 수 있는 상태임
        List<Car> 우승자목록 = carList.우승자내놔();
        //자동차 전부 다 전진
        carList.전진시켜라();
        printCarList(carList);
/*
        for (int i = 0; i < userCount.getUserCount(); i++) {

            // cars의 차들을 전진시키기
            for (Car car : cars) {
                selectMoveOrStop(car);
                print(car);
            }
        }*/
    }


    //차 입력받기
    private static List<String> carGetInput(){
        System.out.println("레이스에 참가할 자동차들의 이름을 쉼표(,)로 구분하여 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String carInput = scanner.nextLine();
        //배열을 리스트로
        List<String> names = List.of(carInput.split(","));
        return names;

    }

    //시행횟수
    private static UserCount userGetInput() {
        System.out.println("몇 회 시행할까요?");
        Scanner scanner = new Scanner(System.in);
        Integer Input = scanner.nextInt();
        //UserCount userInput = new UserCount(Input);
        return new UserCount(Input);
    }

    //차의 위치를 증가시켜라
    private static void selectMoveOrStop (Car car) {
        if(generationRandomNum() > 3){
            car.setPosition(car.getPosition() + 1);
        }
    }

    //나타내주는 함수
    private static void print(Car car) {
        String moveStr = "-";
        String repeat = moveStr.repeat(car.getPosition());
        System.out.println(car.getCarName() + " " + "\uD83C\uDFCE\uFE0F" + repeat);
    }

    //랜덤수 발생
    private static int generationRandomNum() {
        Random random = new Random();
        int num = random.nextInt(1,7);
        return num;
    }

}
