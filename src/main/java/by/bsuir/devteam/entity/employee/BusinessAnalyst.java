package by.bsuir.devteam.entity.employee;

public class BusinessAnalyst extends Employee {

    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() +
                "Nickname: " + nickName;
    }
}
