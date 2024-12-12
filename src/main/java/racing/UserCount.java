package racing;

import java.util.Scanner;

public class UserCount {
    private int userCount;

    public UserCount(int userCount) {
        if (userCount < 3 || userCount > 10) {
            throw new IllegalArgumentException("[ERROR] 횟수가 너무 크거나 너무 작습니다. 3번이상 10번 이하로 알려주세요.");
        }
        this.userCount = userCount;
    }

    public int getUserCount() {
        return userCount;
    }
}
