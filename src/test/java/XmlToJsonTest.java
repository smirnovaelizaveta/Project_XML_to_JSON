import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class XmlToJsonTest {
    @Parameterized.Parameter(value = 0)
    public String pathToXmlFile;
    @Parameterized.Parameter(value = 1)
    public String json;


    @Parameterized.Parameters()
    public static Object[] data() {
        return new Object[][]{
                {"src\\test\\resources\\Example1.xml", "{\"name\":\"root\",\"children\":[]}"},
                {"src\\test\\resources\\Example2.xml", "{\"name\":\"e1\",\"children\":[{\"name\":\"e2\",\"children\":[{\"name\":\"e3\",\"children\":[{\"name\":\"e4\",\"children\":[{\"name\":\"e5\",\"children\":[]}]}]}]}]}"},
                {"src\\test\\resources\\Example3.xml", "Invalid input"}
        };
    }

    @Test
    public void xmlToJsonTest() {
        Assert.assertEquals(json, XmlToJson.xmlToJson(pathToXmlFile));
    }

}