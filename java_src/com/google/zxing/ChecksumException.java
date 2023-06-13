package com.google.zxing;
/* loaded from: classes6.dex */
public final class ChecksumException extends ReaderException {

    /* renamed from: d */
    public static final ChecksumException f74904d;

    static {
        ChecksumException checksumException = new ChecksumException();
        f74904d = checksumException;
        checksumException.setStackTrace(ReaderException.f74908c);
    }

    private ChecksumException() {
    }

    /* renamed from: a */
    public static ChecksumException m45946a() {
        return ReaderException.f74907b ? new ChecksumException() : f74904d;
    }
}
