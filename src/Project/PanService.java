package Project;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String, Pan> panMap = new HashMap<>();

    static {
        panMap.put("EDWABCS123N4", new Pan("EDWABCS123N4", "12334355322", "HDFC", "FD, Stocks"));
        panMap.put("EDWABCS123N6", new Pan("EDWABCS123N6", "12334355323", "ICICI", "MF, FD"));
    }

    public Pan getPanByAadharNumber(String aadhaarNumber){
        for (Pan pan:panMap.values())
        {
            if(pan.getAadharNumber().equals(aadhaarNumber)){
                return pan;
            }
        }
        return null;
    }
}
