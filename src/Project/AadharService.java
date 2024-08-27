package Project;

import java.util.HashMap;
import java.util.Map;

public class AadharService {

    private static Map<String,Aadhaar> aadharMap = new HashMap<>();

    static {
        aadharMap.put("12334355322", new Aadhaar("12334355322",
                "Ashwani", "Anil Kumar", "Aagra"));
        aadharMap.put("12334355323", new Aadhaar("12334355323", "Chetan", "Mahesh"
                , "Dekhi"));
    }

    public Aadhaar getAadharByNumber(String aadharNumber){
        return aadharMap.get(aadharNumber);
    }
}
