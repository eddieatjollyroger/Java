import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Sandbox {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            MyPojo myPojo2 = mapper.readValue(new URL("https://ipinfo.io/json"), MyPojo.class);


        System.out.println(myPojo2.getCity() + "\n" + myPojo2.getCountry() + "\n" + myPojo2.getHostname() + "\n" + myPojo2.getIp() + "\n" + myPojo2.getLoc() + "\n" + myPojo2.getOrg() + "\n" + myPojo2.getPostal() + "\n" + myPojo2.getRegion() + "\n" + myPojo2.getTimezone());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
