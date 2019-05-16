package controller.parser.parserFactory;

import controller.parser.DomParser;
import controller.parser.Parser;

public class DomParserFactory extends ParserFactory {
    @Override
    public Parser createParser() {
        return new DomParser();
    }
}
