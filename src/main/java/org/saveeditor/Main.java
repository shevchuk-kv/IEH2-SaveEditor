package org.saveeditor;

import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.encoders.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    public static final String SAVE_FILE = "";
    public static final String ROOT_PATH = "";
    public static final double MAGIC_NUMBER = 162464.0;
    public static final String SPLIT_STRING = "#";

    public static void main(String[] args) throws Exception {
        // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
        // import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
        /*ObjectMapper om = new ObjectMapper();
        SaveModel save = om.readValue(Paths.get(ROOT_PATH + SAVE_FILE).toFile(), SaveModel.class);*/
    }

    private static final String password = "kkyyhka";
    private static final String AESSalt = "stkttnsstkttns";
}