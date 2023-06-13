package org.bouncycastle.crypto;
/* loaded from: classes8.dex */
public class CryptoException extends Exception {

    /* renamed from: b */
    public Throwable f102612b;

    public CryptoException() {
    }

    public CryptoException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102612b;
    }
}
