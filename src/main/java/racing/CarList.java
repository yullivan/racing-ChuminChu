package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarList {
    private List<Car> carList = new ArrayList<>();

    public CarList(List<Car> carList) {
        if (carList.size() > 3) {
            throw new IllegalArgumentException("[Error] 자동차가 너무 많으면 컴퓨터가 힘들어요ㅠㅠ 3개까지만 적어주세요!");
        }
        if (carList.isEmpty()) {
            throw new IllegalArgumentException("[ERROR]자동차가 입력되지 않았습니다.");
        }
        this.carList = carList;
    }

    public void 전진시켜라() {
        if(generationRandomNum() > 3) {
            //????
        }
    }

    //랜덤수 발생
    private static int generationRandomNum() {
        Random random = new Random();
        int num = random.nextInt(1,7);
        return num;
    }
}


