package by.bsuir.devteam.writer;

import by.bsuir.devteam.entity.Team;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import by.bsuir.devteam.exception.XmlOutInException;

import java.io.File;
import java.io.IOException;

public class XmlTeamWriter {

    public void Write(Team team, String fileName) throws XmlOutInException {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File(fileName), team);
        } catch (IOException e) {
            throw new XmlOutInException("can't read file Xml name = [" + fileName + "]", e);
        }
    }
}
