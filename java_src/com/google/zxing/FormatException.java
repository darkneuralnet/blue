package com.google.zxing;
/* loaded from: classes6.dex */
public final class FormatException extends ReaderException {

    /* renamed from: d */
    public static final FormatException f74905d;

    static {
        FormatException formatException = new FormatException();
        f74905d = formatException;
        formatException.setStackTrace(ReaderException.f74908c);
    }

    private FormatException() {
    }

    /* renamed from: a */
    public static FormatException m45945a() {
        return ReaderException.f74907b ? new FormatException() : f74905d;
    }

    /* renamed from: b */
    public static FormatException m45944b(Throwable th) {
        return ReaderException.f74907b ? new FormatException(th) : f74905d;
    }

    public FormatException(Throwable th) {
        super(th);
    }
}
