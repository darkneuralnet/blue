package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: Fd9 */
/* loaded from: classes5.dex */
public final class Fd9 implements ThreadFactory {

    /* renamed from: b */
    public static final AtomicInteger f9854b = new AtomicInteger();

    private Fd9() {
    }

    public /* synthetic */ Fd9(F99 f99) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = f9854b.incrementAndGet();
        StringBuilder sb = new StringBuilder(23);
        sb.append("measurement-");
        sb.append(incrementAndGet);
        return new Wh9(runnable, sb.toString());
    }
}
