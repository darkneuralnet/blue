package org.bouncycastle.jce.exception;

import java.security.cert.CertPathValidatorException;
/* loaded from: classes8.dex */
public class ExtCertPathValidatorException extends CertPathValidatorException {

    /* renamed from: b */
    public Throwable f102619b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102619b;
    }
}
