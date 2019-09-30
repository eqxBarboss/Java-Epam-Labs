package by.bsuir.devteam.controller;

public enum Commands {
    ONE("1 - ADD_DEVELOPER"),
    TWO("2 - DELETE_DEVELOPER_BY_ID"),
    TREE("3 - UPDATE_DEVELOPER_BY_ID"),
    FOUR("10 - DISPLAY_DEVELOPERS"),
    FIVE("21 - DISPLAY_DEVELOPER_BY_ID"),
    zero("0 - exit");

    private String message;

    Commands(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}