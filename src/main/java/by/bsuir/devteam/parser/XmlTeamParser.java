package by.bsuir.devteam.parser;

import by.bsuir.devteam.entity.Team;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import by.bsuir.devteam.exception.XmlOutInException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlTeamParser {

    /***
     * Parse xml file with Team object serialized into it
     * @param fileName name of the file to be proceeded
     * @return Returns Team object
     * @throws XmlOutInException is invoked on any error met while proceeding
     */
    public Team parse(String fileName) throws XmlOutInException {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            String xmlText = new String(Files.readAllBytes(Paths.get(fileName)));
            return xmlMapper.readValue(xmlText, Team.class);
        } catch (IOException e) {
            throw new XmlOutInException("can't parse file Xml name = [" + fileName + "]", e);
        }
    }
}