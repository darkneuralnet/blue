package org.bouncycastle.asn1;
/* loaded from: classes8.dex */
public class ASN1ParsingException extends IllegalStateException {

    /* renamed from: b */
    public Throwable f102611b;

    public ASN1ParsingException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102611b;
    }

    public ASN1ParsingException(String str, Throwable th) {
        super(str);
        this.f102611b = th;
    }
}
