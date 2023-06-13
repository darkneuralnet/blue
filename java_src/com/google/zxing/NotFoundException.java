package com.google.zxing;
/* loaded from: classes6.dex */
public final class NotFoundException extends ReaderException {

    /* renamed from: d */
    public static final NotFoundException f74906d;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f74906d = notFoundException;
        notFoundException.setStackTrace(ReaderException.f74908c);
    }

    private NotFoundException() {
    }

    /* renamed from: a */
    public static NotFoundException m45943a() {
        return f74906d;
    }
}
