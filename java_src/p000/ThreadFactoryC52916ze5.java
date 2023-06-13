package p000;

import io.reactivex.internal.schedulers.InterfaceC24430i;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: ze5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class ThreadFactoryC52916ze5 extends AtomicLong implements ThreadFactory {

    /* renamed from: ze5$a */
    /* loaded from: classes6.dex */
    public static final class C31067a extends Thread implements InterfaceC24430i {
        public C31067a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        C31067a c31067a = new C31067a(runnable, "RxBleThread-" + incrementAndGet());
        c31067a.setPriority(5);
        c31067a.setDaemon(true);
        return c31067a;
    }
}
