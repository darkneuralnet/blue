package p000;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"LyY0;", "LBm5;", "", "close", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: yY0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C52260yY0 extends C31960Bm5 {

    /* renamed from: i */
    public static final C52260yY0 f119698i = new C52260yY0();

    private C52260yY0() {
        super(EZ5.f7701b, EZ5.f7702c, EZ5.f7703d, "DefaultDispatcher");
    }

    @Override // p000.C31960Bm5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.SC0
    public String toString() {
        return "Dispatchers.Default";
    }
}
