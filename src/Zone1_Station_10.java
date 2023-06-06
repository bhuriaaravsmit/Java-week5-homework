
/*10. Write a programme that tells you which line passes through particular stations. Just use Zone 1 stations name.*/


import java.util.*;

public class Zone1_Station_10 {

    public static void main(String args[]) {


        Map<String, String[]> Map = new HashMap<String, String[]>();

        Map.put("Piccadilly Circus", new String[]{"Bakerloo line", "Piccadilly line"});
        Map.put("Waterloo", new String[]{"Jubilee line", "Northern line"});
        Map.put("Bond Street", new String[]{"Central line", "Northern line", "Bakerloo line"});
        Map.put("Oxford Circus", new String[]{"Central line", "Victoria line", "Central line"});
        Map.put("Leicester square", new String[]{"Piccadilly line", "Northern line"});
        Map.put("Paddington", new String[]{"Bakerloo line", "Circle line", "District line"});
        Map.put("Liverpool Street", new String[]{"Metropolitan line", "Circle Hammersmith & City"});
        System.out.println("Few stations name and lines passing through it");
        for (String key : Map.keySet()) {
            System.out.println(key + ": " + String.join(", ", Map.get(key)));
        }

    }

}