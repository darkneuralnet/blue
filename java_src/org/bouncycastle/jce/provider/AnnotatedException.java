package org.bouncycastle.jce.provider;
/* loaded from: classes8.dex */
public class AnnotatedException extends Exception {

    /* renamed from: b */
    public Throwable f102622b;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f102622b;
    }
}
