package org.bouncycastle.jce.exception;

import java.security.cert.CertificateEncodingException;
/* loaded from: classes8.dex */
public class ExtCertificateEncodingException extends CertificateEncodingException {

    /* renamed from: b */
    public Throwable f102620b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102620b;
    }
}
