package org.bouncycastle.util.p058io.pem;

import java.io.IOException;
/* renamed from: org.bouncycastle.util.io.pem.PemGenerationException */
/* loaded from: classes8.dex */
public class PemGenerationException extends IOException {

    /* renamed from: b */
    public Throwable f102628b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102628b;
    }
}
