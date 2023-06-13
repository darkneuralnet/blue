package org.bouncycastle.util.encoders;
/* loaded from: classes8.dex */
public class EncoderException extends IllegalStateException {

    /* renamed from: b */
    public Throwable f102627b;

    public EncoderException(String str, Throwable th) {
        super(str);
        this.f102627b = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102627b;
    }
}
