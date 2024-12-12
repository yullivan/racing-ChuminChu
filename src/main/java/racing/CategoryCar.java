package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryCar {
    private String value;

    public CategoryCar(String value) {
        if (!(value.equals(","))) {
            throw new IllegalArgumentException("[Error] 쉼표(,)가 없습니다. 쉼표(,)로 구분해서 적어주세요.");
        }
        this.value = value;
    }


}

