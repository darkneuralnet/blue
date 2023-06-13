package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidKeyException;
/* loaded from: classes8.dex */
public class BaseWrapCipher$InvalidKeyOrParametersException extends InvalidKeyException {

    /* renamed from: b */
    public final Throwable f102616b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102616b;
    }
}
