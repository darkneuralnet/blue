package org.bouncycastle.util.encoders;
/* loaded from: classes8.dex */
public class DecoderException extends IllegalStateException {

    /* renamed from: b */
    public Throwable f102626b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102626b;
    }
}
