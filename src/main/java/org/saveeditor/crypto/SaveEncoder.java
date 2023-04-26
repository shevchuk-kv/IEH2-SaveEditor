package org.saveeditor.crypto;

public interface SaveEncoder {
    default String[] encode(String[] data){
        String[] encodedData = new String[data.length];

        for(int i = 0; i < data.length; i++)
            encodedData[i] = encode(data[i]);

        return encodedData;
    }

    String encode(String data);
}
