package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.exception.XmlOutInException;
import by.bsuir.devteam.singleton.SingletonTeam;
import by.bsuir.devteam.writer.XmlTeamWriter;

public class Exit implements Command {

    @Override
    public void execute() {

        XmlTeamWriter xmlTeamWriter = new XmlTeamWriter();
        try {
            xmlTeamWriter.Write(SingletonTeam.getInstance(), "coolTeam.xml");
        } catch (XmlOutInException e) {
            System.out.println(e.getMessage());
        }
    }
}
