package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: W79 */
/* loaded from: classes6.dex */
public final class W79 extends AtomicReference<O79> implements Executor, Runnable {

    /* renamed from: b */
    public C44326l89 f40458b;

    /* renamed from: c */
    public Executor f40459c;

    /* renamed from: d */
    public Runnable f40460d;

    /* renamed from: e */
    public Thread f40461e;

    public /* synthetic */ W79(Executor executor, C44326l89 c44326l89, C49059t79 c49059t79) {
        super(O79.NOT_RUN);
        this.f40459c = executor;
        this.f40458b = c44326l89;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        if (get() == O79.CANCELLED) {
            this.f40459c = null;
            this.f40458b = null;
            return;
        }
        this.f40461e = Thread.currentThread();
        try {
            C44326l89 c44326l89 = this.f40458b;
            c44326l89.getClass();
            C39583d89 m27741a = C44326l89.m27741a(c44326l89);
            if (m27741a.f76170a == this.f40461e) {
                this.f40458b = null;
                if (m27741a.f76171b == null) {
                    z = true;
                } else {
                    z = false;
                }
                C52142yK8.m3656i(z);
                m27741a.f76171b = runnable;
                Executor executor = this.f40459c;
                executor.getClass();
                m27741a.f76172c = executor;
                this.f40459c = null;
            } else {
                Executor executor2 = this.f40459c;
                executor2.getClass();
                this.f40459c = null;
                this.f40460d = runnable;
                executor2.execute(this);
            }
        } finally {
            this.f40461e = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.f40461e) {
            Runnable runnable = this.f40460d;
            runnable.getClass();
            this.f40460d = null;
            runnable.run();
            return;
        }
        C39583d89 c39583d89 = new C39583d89(null);
        c39583d89.f76170a = currentThread;
        C44326l89 c44326l89 = this.f40458b;
        c44326l89.getClass();
        C44326l89.m27740b(c44326l89, c39583d89);
        this.f40458b = null;
        try {
            Runnable runnable2 = this.f40460d;
            runnable2.getClass();
            this.f40460d = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = c39583d89.f76171b;
                boolean z2 = true;
                if (runnable3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                Executor executor = c39583d89.f76172c;
                if (executor == null) {
                    z2 = false;
                }
                if (z2 & z) {
                    c39583d89.f76171b = null;
                    c39583d89.f76172c = null;
                    executor.execute(runnable3);
                } else {
                    return;
                }
            }
        } finally {
            c39583d89.f76170a = null;
        }
    }
}
