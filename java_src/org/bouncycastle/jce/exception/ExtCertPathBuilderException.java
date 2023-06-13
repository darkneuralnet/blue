package org.bouncycastle.jce.exception;

import java.security.cert.CertPathBuilderException;
/* loaded from: classes8.dex */
public class ExtCertPathBuilderException extends CertPathBuilderException {

    /* renamed from: b */
    public Throwable f102618b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102618b;
    }
}
