package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.spec.InvalidKeySpecException;
/* loaded from: classes8.dex */
public class ExtendedInvalidKeySpecException extends InvalidKeySpecException {

    /* renamed from: b */
    public Throwable f102615b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102615b;
    }
}
