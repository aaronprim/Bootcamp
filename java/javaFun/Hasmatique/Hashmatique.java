import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

    public static void main(String [] args) {
        
        HashMap<String, String> trackList = new HashMap <String, String>();
        trackList.put("Gravity", "Oh Gravity, has taken better men than me");
        trackList.put("Shake the Frost", "You remind me of Sunday");
        trackList.put("Tennessee Whiskey", "I used to spend my nights out, in a bar room");
        trackList.put("Whitehouse Road", "Early in the mornin when the sun does rise");

        String track = trackList.get("Shake the Frost");
        System.out.println(track);

        Set<String> keys = trackList.keySet();
        for (String key: keys) {
            System.out.println(key: trackList.get(key));
            
        }
    }
}