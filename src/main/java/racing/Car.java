package racing;

public class Car {
    private String carName;
    private int position = 0;

    public Car(String carName) {
        if (carName.length() > 11){
            throw new IllegalArgumentException("[ERROR] 차의 이름은 10자 이하로 적어주세요.");
        }
        this.carName = carName;
    }

    public Car(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
