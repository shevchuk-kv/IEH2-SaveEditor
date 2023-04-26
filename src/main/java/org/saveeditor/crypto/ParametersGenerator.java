package org.saveeditor.crypto;

import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.ParametersWithIV;

import java.nio.charset.StandardCharsets;

public class ParametersGenerator {
    private String password = "kkyyhka";
    private String salt = "stkttnsstkttns";

    public ParametersGenerator() {
    }

    public ParametersGenerator(String password, String salt) {
        this.password = password;
        this.salt = salt;
    }

    public ParametersWithIV generate(int keySize, int ivSize, int iterationCount){
        PKCS5S2ParametersGenerator generator = new PKCS5S2ParametersGenerator();
        generator.init(password.getBytes(StandardCharsets.UTF_8), salt.getBytes(StandardCharsets.UTF_8), iterationCount);
        return (ParametersWithIV) generator.generateDerivedParameters(keySize, ivSize);
    }

    /**
     * Generate ParametersWithIV with default param:
     * keySize = 128, ivSize = 128, iterationCount = 1000
     */
    public ParametersWithIV generate(){
        return this.generate(128, 128, 1000);
    }
}
