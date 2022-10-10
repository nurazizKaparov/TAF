package com.talentlms.UI.dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    private static Properties properties;

    static {
        String path = "src/main/resources/configurations.properties";
        try {
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);   //метод лоад загружает все данные с пропертиса
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key).trim();
    }





}
