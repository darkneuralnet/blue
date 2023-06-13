package com.google.zxing;
/* loaded from: classes6.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: b */
    public static final boolean f74907b;

    /* renamed from: c */
    public static final StackTraceElement[] f74908c;

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        f74907b = z;
        f74908c = new StackTraceElement[0];
    }

    public ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    public ReaderException(Throwable th) {
        super(th);
    }
}
