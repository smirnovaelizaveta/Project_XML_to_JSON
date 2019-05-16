import controller.parser.DomParser;
import controller.parser.parserFactory.DomParserFactory;
import controller.parser.Parser;
import controller.parser.parserFactory.ParserFactory;
import controller.parser.parserFactory.SaxParserFactory;
import model.XmlElement;

import java.io.File;


import com.fasterxml.jackson.databind.ObjectMapper;


public class XmlToJson {

    public static String xmlToJson(String pathToXmlFile) {
        String result;
        ParserFactory parserFactory = new SaxParserFactory();
        Parser parser = parserFactory.createParser();
        try {
            XmlElement rootOfXmlElements = parser.parse(new File(pathToXmlFile));

            String JsonString = new ObjectMapper().writeValueAsString(rootOfXmlElements);
            result = JsonString;
        } catch (Exception e) {
            result = "Invalid input";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(xmlToJson("pom.xml"));

    }


}
