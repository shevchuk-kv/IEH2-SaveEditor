package org.saveeditor.crypto;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.RijndaelEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;

public class RijndaelManager {
    protected RijndaelEngine engine;
    protected BufferedBlockCipher cipher;

    public RijndaelManager() {
        engine = new RijndaelEngine();
        BufferedBlockCipher cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(engine));
    }

    public int transformFinalBlock(byte[] out, int len) throws InvalidCipherTextException, DataLengthException, IllegalStateException {
        return cipher.doFinal(out, len);
    }

    public void init(CipherMode mode, CipherParameters cipherParameters) throws IllegalArgumentException{
        boolean isEncryption = CipherMode.Encrypt.equals(mode);
        cipher.init(isEncryption, cipherParameters);
    }
}
