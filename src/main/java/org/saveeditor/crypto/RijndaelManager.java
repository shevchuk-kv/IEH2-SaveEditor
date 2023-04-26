package org.saveeditor.crypto;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.RijndaelEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;

public class RijndaelManager {
    protected RijndaelEngine engine;
    protected BufferedBlockCipher cipher;

    public RijndaelManager() {
        engine = new RijndaelEngine();
        cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(engine));
    }

    public void init(CipherMode mode, CipherParameters cipherParameters) throws IllegalArgumentException{
        cipher.init(mode.isEncryption(), cipherParameters);
    }

    public byte[] transform(byte[] decodedBase64Data) throws InvalidCipherTextException {
        byte[] resultData = new byte[cipher.getOutputSize(decodedBase64Data.length)];
        int len = cipher.processBytes(decodedBase64Data, 0, decodedBase64Data.length, resultData, 0);
        cipher.doFinal(resultData, len);
        return resultData;
    }
}
