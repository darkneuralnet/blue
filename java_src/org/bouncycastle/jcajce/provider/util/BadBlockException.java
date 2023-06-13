package org.bouncycastle.jcajce.provider.util;

import javax.crypto.BadPaddingException;
/* loaded from: classes8.dex */
public class BadBlockException extends BadPaddingException {

    /* renamed from: b */
    public final Throwable f102617b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102617b;
    }
}
