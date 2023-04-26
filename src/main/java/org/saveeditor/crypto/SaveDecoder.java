package org.saveeditor.crypto;

import org.bouncycastle.crypto.InvalidCipherTextException;

import java.util.Arrays;

public interface SaveDecoder {
    String decode(String data) throws InvalidCipherTextException;
}
