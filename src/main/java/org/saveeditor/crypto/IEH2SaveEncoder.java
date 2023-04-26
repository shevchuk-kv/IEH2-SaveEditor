package org.saveeditor.crypto;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;

import java.util.Base64;

public class IEH2SaveEncoder implements SaveEncoder{
    RijndaelManager rijndaelManager;

    public IEH2SaveEncoder(CipherParameters cipherParameters) {
        rijndaelManager = new RijndaelManager();
        rijndaelManager.init(CipherMode.Encrypt, cipherParameters);
    }

    @Override
    public String encode(String data) throws InvalidCipherTextException {
        byte[] resultData = rijndaelManager.transform(data.getBytes());
        byte[] encodedBase64ResultData = Base64.getEncoder().encode(resultData);
        return new String(encodedBase64ResultData);
    }
}
