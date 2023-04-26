package org.saveeditor.crypto;

import java.util.Arrays;

public interface SaveDecoder {
    default String[] decode(String[] data){
        String[] decodedData = new String[data.length];

        for(int i = 0; i < data.length; i++)
            decodedData[i] = decode(data[i]);

        return decodedData;
    }

    String decode(String data);
}
