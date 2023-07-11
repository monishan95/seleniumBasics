package org.mustknowjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WwPropertyFileLao {


    public static void main(String[] args) throws IOException {


        FileInputStream inputStream = new FileInputStream("config.properties");
        Properties properties = new Properties();
        properties.load(inputStream);

        String browser = properties.getProperty("browser");
        String browseredge = properties.getProperty("browseranother");
        String location = properties.getProperty("location");
        String locationedge = properties.getProperty("location");


        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",location);
        } else if (browseredge.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver",locationedge);
        }

    }


}
