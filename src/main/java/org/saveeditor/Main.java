package org.saveeditor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.saveeditor.models.SaveModel;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static String SAVE_FILE = "";
    public static String ROOT_PATH = "";
    public static double MAGIC_NUMBER = 162464.0;
    public static String SPLIT_STRING = "#";

    public static void main(String[] args) throws IOException {
        // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
        // import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
        /*ObjectMapper om = new ObjectMapper();
        SaveModel save = om.readValue(Paths.get(ROOT_PATH + SAVE_FILE).toFile(), SaveModel.class);*/




        System.out.println("Hello world!");
    }
}