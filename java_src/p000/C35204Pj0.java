package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: Pj0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35204Pj0 {

    /* renamed from: a */
    public final ReferenceQueue f28950a = new ReferenceQueue();

    /* renamed from: b */
    public final Set f28951b = Collections.synchronizedSet(new HashSet());

    /* renamed from: Pj0$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC6455a {
        @KeepForSdk
        /* renamed from: a */
        void mo8447a();
    }

    private C35204Pj0() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static C35204Pj0 m89892a() {
        C35204Pj0 c35204Pj0 = new C35204Pj0();
        c35204Pj0.m89891b(c35204Pj0, AC7.f288b);
        final ReferenceQueue referenceQueue = c35204Pj0.f28950a;
        final Set set = c35204Pj0.f28951b;
        Thread thread = new Thread(new Runnable() { // from class: cf7
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        ((C50488vY7) referenceQueue2.remove()).mo8447a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c35204Pj0;
    }

    @KeepForSdk
    /* renamed from: b */
    public InterfaceC6455a m89891b(Object obj, Runnable runnable) {
        C50488vY7 c50488vY7 = new C50488vY7(obj, this.f28950a, this.f28951b, runnable, null);
        this.f28951b.add(c50488vY7);
        return c50488vY7;
    }
}
