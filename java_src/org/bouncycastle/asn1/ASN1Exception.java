package org.bouncycastle.asn1;

import java.io.IOException;
/* loaded from: classes8.dex */
public class ASN1Exception extends IOException {

    /* renamed from: b */
    public Throwable f102610b;

    public ASN1Exception(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102610b;
    }

    public ASN1Exception(String str, Throwable th) {
        super(str);
        this.f102610b = th;
    }
}
