package org.saveeditor.crypto;

import org.bouncycastle.crypto.InvalidCipherTextException;

public interface SaveEncoder {
    String encode(String data) throws InvalidCipherTextException;
}
