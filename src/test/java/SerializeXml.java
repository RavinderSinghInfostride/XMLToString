import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.testng.annotations.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializeXml {
    @Test
    public void XmlToString() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String readContent = new String(Files.readAllBytes(Paths.get("Data.xml")));
        PhoneDetails deserializedData = xmlMapper.readValue(readContent, PhoneDetails.class);
        System.out.println("Deserialized data: ");
        System.out.println("\tName: " + deserializedData.getName());
        System.out.println("\tMemory: " + deserializedData.getMemory());
        System.out.println("\tDisplay Size: " + deserializedData.getDisplaySize());
    }

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