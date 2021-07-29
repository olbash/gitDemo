package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalProperties {
    public static FileInputStream fileInputStream;
    public static Properties prop;


    static {
        try {
            // specify the path to the properties file
            fileInputStream = new FileInputStream("src/test/java/Utils/global.properties");
            prop = new Properties();
            prop.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            //Possible exception handling
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    // Return a property from the conf.properties file
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

}
