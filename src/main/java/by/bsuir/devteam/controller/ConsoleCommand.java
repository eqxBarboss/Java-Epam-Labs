package by.bsuir.devteam.controller;

import by.bsuir.devteam.command.CommandType;

import java.util.HashMap;
import java.util.Map;

import static by.bsuir.devteam.command.CommandType.*;

public enum ConsoleCommand {
    A(1, "add developer", ADD_DEVELOPER),
    B(2, "delete developer by id", DELETE_DEVELOPER_BY_ID),
    C(3, "update developer by id", UPDATE_DEVELOPER_BY_ID),
    D(4, "add business analyst", ADD_BUSINESS_ANALYST),
    E(5, "delete business analyst by id", DELETE_BUSINESS_ANALYST_BY_ID),
    F(6, "update business analyst by id", UPDATE_BUSINESS_ANALYST_BY_ID),
    G(7, "add tester", ADD_TESTER),
    H(8, "delete tester by id", DELETE_TESTER_BY_ID),
    I(9, "update tester_by id", UPDATE_TESTER_BY_ID),
    J(10, "display developers", DISPLAY_DEVELOPERS),
    K(11, "display business analysts", DISPLAY_BUSINESS_ANALYSTS),
    L(12, "display testers", DISPLAY_TESTERS),
    M(13, "add team lead", ADD_TEAM_LEAD),
    N(14, "delete team lead", DELETE_TEAM_LEAD),
    O(15, "update team lead", UPDATE_TEAM_LEAD),
    P(16, "add software product", ADD_SOFTWARE_PRODUCT),
    Q(17, "delete software product", DELETE_SOFTWARE_PRODUCT),
    R(18, "update software product", UPDATE_SOFTWARE_PRODUCT),
    S(19, "display team lead", DISPLAY_TEAM_LEAD),
    T(20, "display software product", DISPLAY_SOFTWARE_PRODUCT),
    U(21, "display developer by id", DISPLAY_DEVELOPER_BY_ID),
    V(22, "display tester by id", DISPLAY_TESTER_BY_ID),
    W(23, "display business analyst by id", DISPLAY_BUSINESS_ANALYST_BY_ID),
    X(24, "display help", DISPLAY_HELP),
    Y(0, "exit", EXIT);

    private String message;
    private int number;
    private CommandType commandType;

    ConsoleCommand(int number, String message, CommandType commandType) {
        this.number = number;
        this.message = message;
        this.commandType = commandType;
    }

    public int getNumber() {
        return number;
    }

    public CommandType getCommandType() {
        return commandType;
    }

    public String getMessage() {
        return message;
    }

    private static final Map<Integer, ConsoleCommand> lookup = new HashMap<>();

    static {
        for (ConsoleCommand cc : ConsoleCommand.values()) {
            lookup.put(cc.number, cc);
        }
    }

    public static CommandType getCommandTypeByNumber(int number) {
        ConsoleCommand ct = lookup.get(number);
        return ct == null ? DISPLAY_HELP : ct.getCommandType();
    }
}