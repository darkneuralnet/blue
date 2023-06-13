package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* renamed from: a18  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ThreadFactoryC37715a18 implements ThreadFactory {

    /* renamed from: b */
    public final ThreadFactory f49728b = Executors.defaultThreadFactory();

    public ThreadFactoryC37715a18(C52032y88 c52032y88) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f49728b.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
