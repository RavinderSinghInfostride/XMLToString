import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;

public class phone {

    public List<PhoneDetails> getPhoneDetails() {
        return phoneDetails;
    }

    public void setPhoneDetails(List<PhoneDetails> phoneDetails) {
        this.phoneDetails = phoneDetails;
    }

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<PhoneDetails> phoneDetails = new ArrayList<>();

    @Override
    public String toString() {
        return "phone: " + this.phoneDetails;
    }
}