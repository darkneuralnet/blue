package org.bouncycastle.crypto.p057io;

import java.io.IOException;
/* renamed from: org.bouncycastle.crypto.io.CipherIOException */
/* loaded from: classes8.dex */
public class CipherIOException extends IOException {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final Throwable f102613b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102613b;
    }
}
