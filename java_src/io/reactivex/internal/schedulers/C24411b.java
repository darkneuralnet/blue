package io.reactivex.internal.schedulers;

import io.reactivex.AbstractC23437E;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23503f;
import io.reactivex.internal.disposables.EnumC23502e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.schedulers.b */
/* loaded from: classes8.dex */
public final class C24411b extends AbstractC23437E {

    /* renamed from: f */
    public static final C24413b f90918f;

    /* renamed from: g */
    public static final ThreadFactoryC24431j f90919g;

    /* renamed from: h */
    public static final int f90920h = m32355g(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: i */
    public static final C24414c f90921i;

    /* renamed from: d */
    public final ThreadFactory f90922d;

    /* renamed from: e */
    public final AtomicReference<C24413b> f90923e;

    /* renamed from: io.reactivex.internal.schedulers.b$a */
    /* loaded from: classes8.dex */
    public static final class C24412a extends AbstractC23437E.AbstractC23440c {

        /* renamed from: b */
        public final C23503f f90924b;

        /* renamed from: c */
        public final C23464b f90925c;

        /* renamed from: d */
        public final C23503f f90926d;

        /* renamed from: e */
        public final C24414c f90927e;

        /* renamed from: f */
        public volatile boolean f90928f;

        public C24412a(C24414c c24414c) {
            this.f90927e = c24414c;
            C23503f c23503f = new C23503f();
            this.f90924b = c23503f;
            C23464b c23464b = new C23464b();
            this.f90925c = c23464b;
            C23503f c23503f2 = new C23503f();
            this.f90926d = c23503f2;
            c23503f2.mo32983c(c23503f);
            c23503f2.mo32983c(c23464b);
        }

        @Override // io.reactivex.AbstractC23437E.AbstractC23440c
        /* renamed from: b */
        public InterfaceC23465c mo32320b(Runnable runnable) {
            if (this.f90928f) {
                return EnumC23502e.INSTANCE;
            }
            return this.f90927e.m32339g(runnable, 0L, TimeUnit.MILLISECONDS, this.f90924b);
        }

        @Override // io.reactivex.AbstractC23437E.AbstractC23440c
        /* renamed from: c */
        public InterfaceC23465c mo32319c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f90928f) {
                return EnumC23502e.INSTANCE;
            }
            return this.f90927e.m32339g(runnable, j, timeUnit, this.f90925c);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f90928f) {
                this.f90928f = true;
                this.f90926d.dispose();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90928f;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.b$b */
    /* loaded from: classes8.dex */
    public static final class C24413b {

        /* renamed from: a */
        public final int f90929a;

        /* renamed from: b */
        public final C24414c[] f90930b;

        /* renamed from: c */
        public long f90931c;

        public C24413b(int i, ThreadFactory threadFactory) {
            this.f90929a = i;
            this.f90930b = new C24414c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f90930b[i2] = new C24414c(threadFactory);
            }
        }

        /* renamed from: a */
        public C24414c m32353a() {
            int i = this.f90929a;
            if (i == 0) {
                return C24411b.f90921i;
            }
            C24414c[] c24414cArr = this.f90930b;
            long j = this.f90931c;
            this.f90931c = 1 + j;
            return c24414cArr[(int) (j % i)];
        }

        /* renamed from: b */
        public void m32352b() {
            for (C24414c c24414c : this.f90930b) {
                c24414c.dispose();
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.b$c */
    /* loaded from: classes8.dex */
    public static final class C24414c extends C24429h {
        public C24414c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C24414c c24414c = new C24414c(new ThreadFactoryC24431j("RxComputationShutdown"));
        f90921i = c24414c;
        c24414c.dispose();
        ThreadFactoryC24431j threadFactoryC24431j = new ThreadFactoryC24431j("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f90919g = threadFactoryC24431j;
        C24413b c24413b = new C24413b(0, threadFactoryC24431j);
        f90918f = c24413b;
        c24413b.m32352b();
    }

    public C24411b() {
        this(f90919g);
    }

    /* renamed from: g */
    public static int m32355g(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: b */
    public AbstractC23437E.AbstractC23440c mo8041b() {
        return new C24412a(this.f90923e.get().m32353a());
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: e */
    public InterfaceC23465c mo32323e(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f90923e.get().m32353a().m32338h(runnable, j, timeUnit);
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: f */
    public InterfaceC23465c mo32326f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f90923e.get().m32353a().m32337i(runnable, j, j2, timeUnit);
    }

    /* renamed from: h */
    public void m32354h() {
        C24413b c24413b = new C24413b(f90920h, this.f90922d);
        if (!C42482i24.m35337a(this.f90923e, f90918f, c24413b)) {
            c24413b.m32352b();
        }
    }

    @Override // io.reactivex.AbstractC23437E
    public void shutdown() {
        C24413b c24413b;
        C24413b c24413b2;
        do {
            c24413b = this.f90923e.get();
            c24413b2 = f90918f;
            if (c24413b == c24413b2) {
                return;
            }
        } while (!C42482i24.m35337a(this.f90923e, c24413b, c24413b2));
        c24413b.m32352b();
    }

    public C24411b(ThreadFactory threadFactory) {
        this.f90922d = threadFactory;
        this.f90923e = new AtomicReference<>(f90918f);
        m32354h();
    }
}
