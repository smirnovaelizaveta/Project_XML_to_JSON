package controller.parser.parserFactory;

import controller.parser.Parser;
import controller.parser.SaxParser;

public class SaxParserFactory extends ParserFactory{
    @Override
    public Parser createParser() {
        return new SaxParser();
    }
}
