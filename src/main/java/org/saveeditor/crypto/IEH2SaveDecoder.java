package org.saveeditor.crypto;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;

import java.util.Base64;

public class IEH2SaveDecoder implements SaveDecoder{
    RijndaelManager rijndaelManager;

    public IEH2SaveDecoder(CipherParameters cipherParameters) {
        rijndaelManager = new RijndaelManager();
        rijndaelManager.init(CipherMode.Decrypt, cipherParameters);
    }

    @Override
    public String decode(String data) throws InvalidCipherTextException {
        byte[] decodedBase64Data = Base64.getDecoder().decode(data.getBytes());
        byte[] resultData = rijndaelManager.transform(decodedBase64Data);
        return new String(resultData);
    }
}
