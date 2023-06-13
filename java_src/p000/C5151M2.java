package p000;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p000.C33747Jd1;
/* renamed from: M2 */
/* loaded from: classes5.dex */
public final class C5151M2 {

    /* renamed from: a */
    public final boolean f22449a;

    /* renamed from: b */
    public final Executor f22450b;

    /* renamed from: c */
    public final Map<InterfaceC38133ak2, C5155c> f22451c;

    /* renamed from: d */
    public final ReferenceQueue<C33747Jd1<?>> f22452d;

    /* renamed from: e */
    public C33747Jd1.InterfaceC4169a f22453e;

    /* renamed from: f */
    public volatile boolean f22454f;

    /* renamed from: M2$a */
    /* loaded from: classes5.dex */
    public class ThreadFactoryC5152a implements ThreadFactory {

        /* renamed from: M2$a$a */
        /* loaded from: classes5.dex */
        public class RunnableC5153a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Runnable f22455b;

            public RunnableC5153a(Runnable runnable) {
                this.f22455b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f22455b.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC5153a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: M2$b */
    /* loaded from: classes5.dex */
    public class RunnableC5154b implements Runnable {
        public RunnableC5154b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5151M2.this.m96004b();
        }
    }

    /* renamed from: M2$c */
    /* loaded from: classes5.dex */
    public static final class C5155c extends WeakReference<C33747Jd1<?>> {

        /* renamed from: a */
        public final InterfaceC38133ak2 f22458a;

        /* renamed from: b */
        public final boolean f22459b;

        /* renamed from: c */
        public VL4<?> f22460c;

        public C5155c(InterfaceC38133ak2 interfaceC38133ak2, C33747Jd1<?> c33747Jd1, ReferenceQueue<? super C33747Jd1<?>> referenceQueue, boolean z) {
            super(c33747Jd1, referenceQueue);
            VL4<?> vl4;
            this.f22458a = (InterfaceC38133ak2) C52865zZ3.m1111d(interfaceC38133ak2);
            if (c33747Jd1.m100103f() && z) {
                vl4 = (VL4) C52865zZ3.m1111d(c33747Jd1.m100104e());
            } else {
                vl4 = null;
            }
            this.f22460c = vl4;
            this.f22459b = c33747Jd1.m100103f();
        }

        /* renamed from: a */
        public void m95999a() {
            this.f22460c = null;
            clear();
        }
    }

    public C5151M2(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC5152a()));
    }

    /* renamed from: a */
    public synchronized void m96005a(InterfaceC38133ak2 interfaceC38133ak2, C33747Jd1<?> c33747Jd1) {
        C5155c put = this.f22451c.put(interfaceC38133ak2, new C5155c(interfaceC38133ak2, c33747Jd1, this.f22452d, this.f22449a));
        if (put != null) {
            put.m95999a();
        }
    }

    /* renamed from: b */
    public void m96004b() {
        while (!this.f22454f) {
            try {
                m96003c((C5155c) this.f22452d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void m96003c(C5155c c5155c) {
        VL4<?> vl4;
        synchronized (this) {
            this.f22451c.remove(c5155c.f22458a);
            if (c5155c.f22459b && (vl4 = c5155c.f22460c) != null) {
                this.f22453e.mo100101a(c5155c.f22458a, new C33747Jd1<>(vl4, true, false, c5155c.f22458a, this.f22453e));
            }
        }
    }

    /* renamed from: d */
    public synchronized void m96002d(InterfaceC38133ak2 interfaceC38133ak2) {
        C5155c remove = this.f22451c.remove(interfaceC38133ak2);
        if (remove != null) {
            remove.m95999a();
        }
    }

    /* renamed from: e */
    public synchronized C33747Jd1<?> m96001e(InterfaceC38133ak2 interfaceC38133ak2) {
        C5155c c5155c = this.f22451c.get(interfaceC38133ak2);
        if (c5155c == null) {
            return null;
        }
        C33747Jd1<?> c33747Jd1 = c5155c.get();
        if (c33747Jd1 == null) {
            m96003c(c5155c);
        }
        return c33747Jd1;
    }

    /* renamed from: f */
    public void m96000f(C33747Jd1.InterfaceC4169a interfaceC4169a) {
        synchronized (interfaceC4169a) {
            synchronized (this) {
                this.f22453e = interfaceC4169a;
            }
        }
    }

    public C5151M2(boolean z, Executor executor) {
        this.f22451c = new HashMap();
        this.f22452d = new ReferenceQueue<>();
        this.f22449a = z;
        this.f22450b = executor;
        executor.execute(new RunnableC5154b());
    }
}
