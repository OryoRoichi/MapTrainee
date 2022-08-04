import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.example.Main.fillMap;
import static org.example.Main.smth;

public class MainTest {
    @Test
    public void smth_IsOk() {
        Map<Integer, String> testMap = new HashMap<>();
        fillMap(testMap);
        Map<String, List<Integer>> newTestMap = smth(testMap);
        for (Map.Entry<String, List<Integer>> etry : newTestMap.entrySet()) {
            Assertions.assertEquals(testMap.get(etry.getValue().get(0)),etry.getKey());
        }

    }

}
