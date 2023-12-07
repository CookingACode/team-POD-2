//import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.util.Map;

public class Catalogue {
    private static final Map<String,  Product> productMap = Map.of(
            "Electrictoothbrush",
            new Product("ElectricToothbrush", 3550),
            "BabyAlarm",
            new Product("BabyAlarm", 4000)
    );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }

}
