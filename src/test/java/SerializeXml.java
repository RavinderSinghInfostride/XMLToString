import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.testng.annotations.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import static org.testng.AssertJUnit.assertEquals;

public class SerializeXml {

    private static final String XML = "<phone>\n" +
            "    <PhoneDetails>\n" +
            "        <name>iPhone</name>\n" +
            "        <displaySize>6.2</displaySize>\n" +
            "        <memory>3/64 GB</memory>\n" +
            "    </PhoneDetails>\n" +
            "    <PhoneDetails>\n" +
            "        <name>iPhone</name>\n" +
            "        <displaySize>6.2</displaySize>\n" +
            "        <memory>3/64 GB</memory>\n" +
            "    </PhoneDetails>\n" +
            "    <PhoneDetails>\n" +
            "        <name>iPhone</name>\n" +
            "        <displaySize>6.2</displaySize>\n" +
            "        <memory>3/64 GB</memory>\n" +
            "    </PhoneDetails>\n" +
            "</phone>";
    @Test(priority = 0)
    public void serializePhone() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        phone phoneObject =  xmlMapper.readValue(XML, phone.class);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        xmlMapper.writeValue(byteArrayOutputStream, phoneObject);
        assertEquals(XML, byteArrayOutputStream.toString());
    }

    @Test(priority = 1)
    public void serializePhoneDetails() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        phone value = xmlMapper.readValue(XML, phone.class);
        assertEquals("Name", value.getPhoneDetails().get(0).getName());
        assertEquals("Memory", value.getPhoneDetails().get(1).getMemory());
        assertEquals("DisplaySize", value.getPhoneDetails().get(2).getDisplaySize());
    }


//        String readContent = new String(Files.readAllBytes(Paths.get("Data.xml")));
//        phone deserializedData = xmlMapper.readValue(readContent, phone.class);
//        System.out.println("Deserialized data: ");
//        System.out.println("\tName: " + deserializedData.getPhoneDetails());
//        System.out.println("\tMemory: " + deserializedData.getMemory());
//        System.out.println("\tDisplay Size: " + deserializedData.getDisplaySize());


//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        try {
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document document = builder.parse(new File("Laptop.xml"));
//            document.getDocumentElement().normalize();
//            NodeList laptopList = document.getElementsByTagName("laptop");
//            for(int i = 0; i <laptopList.getLength(); i++) {
//                Node laptop = laptopList.item(i);
//                if(laptop.getNodeType() == Node.ELEMENT_NODE)
//                    Element laptopElement = (Element) laptop;
//                    System.out.println("Laptop Name: " + laptopElement.getAttribute("name"));
//                    NodeList laptopDetails =  laptop.getChildNodes();
//                    for(int j = 0; j < laptopDetails.getLength(); j++){
//                        Node detail = laptopDetails.item(j);
//                        if(detail.getNodeType() == Node.ELEMENT_NODE) {
//                            Element detailElement = (Element) detail;
//                            System.out.println("     " + detailElement.getTagName() + ": " + detailElement.getAttribute("value"));
//                        }
//                    }
//                }
//            }
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        } catch (SAXException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
}