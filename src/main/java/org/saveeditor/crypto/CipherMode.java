package org.saveeditor.crypto;

public enum CipherMode {
    Encrypt(true),
    Decrypt(false);

    private final boolean isEncryption;

    CipherMode(boolean isEncryption)
    {
        this.isEncryption = isEncryption;
    }

    public boolean isEncryption()
    {
        return this.isEncryption;
    }
}
