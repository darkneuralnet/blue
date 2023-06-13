package org.bouncycastle.jce.exception;

import java.io.IOException;
/* loaded from: classes8.dex */
public class ExtIOException extends IOException {

    /* renamed from: b */
    public Throwable f102621b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102621b;
    }
}
