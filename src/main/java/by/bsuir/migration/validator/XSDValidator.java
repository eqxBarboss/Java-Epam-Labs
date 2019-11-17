package by.bsuir.migration.validator;

import by.bsuir.migration.exception.ValidationException;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XSDValidator {

    public static void validate(File xmlFile, File xsdFile) throws ValidationException {
        try {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(xsdFile);
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xmlFile));
        } catch (IOException e) {
            throw new ValidationException(e.getMessage());
        } catch (SAXException e) {
            throw new ValidationException(xmlFile.getName() + e.getMessage());
        }
    }

}
