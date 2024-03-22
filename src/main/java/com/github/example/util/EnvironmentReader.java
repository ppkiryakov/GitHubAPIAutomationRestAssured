package main.java.com.github.example.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.testng.util.Strings.isNullOrEmpty;

public class EnvironmentReader {
    private static final Properties prop;

    static {
        //TODO add for other env values

        String env = "prod";
        if (env == null)
            throw new RuntimeException("'env' maven property is not populated!");

        String filePath = "environments/".concat(env.concat(".properties"));

        prop = new Properties();
        loadProperties(filePath);
    }


    private static void loadProperties(String fileName) {
        try {
            InputStream resource = EnvironmentReader.class.getClassLoader().getResourceAsStream(fileName);
            if (resource != null) {
                prop.load(resource);
            } else {
                throw new RuntimeException("Failed to load " + fileName + " file!");
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load " + fileName + " file!", e);
        }
    }

    public static String getBaseUri() {
        return getProperty("baseUri");
    }

    public static String getAccessToken() {
        return getProperty("accessToken");
    }

    /**
     * Checks for existing system property value first, if empty or null reads from properties file.
     *
     * @param property Name of the property
     * @return String value found
     */
    private static String getProperty(String property) {

        String returnProperty = !isNullOrEmpty(System.getProperty(property)) ?
                System.getProperty(property) : prop.getProperty(property);

        return returnProperty;
    }
}
