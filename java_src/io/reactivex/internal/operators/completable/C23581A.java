package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: io.reactivex.internal.operators.completable.A */
/* loaded from: classes6.dex */
public final class C23581A extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h f88340b;

    /* renamed from: c */
    public final long f88341c;

    /* renamed from: d */
    public final TimeUnit f88342d;

    /* renamed from: e */
    public final AbstractC23437E f88343e;

    /* renamed from: f */
    public final InterfaceC23496h f88344f;

    /* renamed from: io.reactivex.internal.operators.completable.A$a */
    /* loaded from: classes6.dex */
    public final class RunnableC23582a implements Runnable {

        /* renamed from: b */
        public final AtomicBoolean f88345b;

        /* renamed from: c */
        public final C23464b f88346c;

        /* renamed from: d */
        public final InterfaceC23476f f88347d;

        /* renamed from: io.reactivex.internal.operators.completable.A$a$a */
        /* loaded from: classes6.dex */
        public final class C23583a implements InterfaceC23476f {
            public C23583a() {
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                RunnableC23582a.this.f88346c.dispose();
                RunnableC23582a.this.f88347d.onComplete();
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                RunnableC23582a.this.f88346c.dispose();
                RunnableC23582a.this.f88347d.onError(th);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                RunnableC23582a.this.f88346c.mo32983c(interfaceC23465c);
            }
        }

        public RunnableC23582a(AtomicBoolean atomicBoolean, C23464b c23464b, InterfaceC23476f interfaceC23476f) {
            this.f88345b = atomicBoolean;
            this.f88346c = c23464b;
            this.f88347d = interfaceC23476f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f88345b.compareAndSet(false, true)) {
                this.f88346c.m33026d();
                InterfaceC23496h interfaceC23496h = C23581A.this.f88344f;
                if (interfaceC23496h == null) {
                    InterfaceC23476f interfaceC23476f = this.f88347d;
                    C23581A c23581a = C23581A.this;
                    interfaceC23476f.onError(new TimeoutException(C24475k.m32257d(c23581a.f88341c, c23581a.f88342d)));
                    return;
                }
                interfaceC23496h.mo33003g(new C23583a());
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.completable.A$b */
    /* loaded from: classes6.dex */
    public static final class C23584b implements InterfaceC23476f {

        /* renamed from: b */
        public final C23464b f88350b;

        /* renamed from: c */
        public final AtomicBoolean f88351c;

        /* renamed from: d */
        public final InterfaceC23476f f88352d;

        public C23584b(C23464b c23464b, AtomicBoolean atomicBoolean, InterfaceC23476f interfaceC23476f) {
            this.f88350b = c23464b;
            this.f88351c = atomicBoolean;
            this.f88352d = interfaceC23476f;
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            if (this.f88351c.compareAndSet(false, true)) {
                this.f88350b.dispose();
                this.f88352d.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            if (this.f88351c.compareAndSet(false, true)) {
                this.f88350b.dispose();
                this.f88352d.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f88350b.mo32983c(interfaceC23465c);
        }
    }

    public C23581A(InterfaceC23496h interfaceC23496h, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, InterfaceC23496h interfaceC23496h2) {
        this.f88340b = interfaceC23496h;
        this.f88341c = j;
        this.f88342d = timeUnit;
        this.f88343e = abstractC23437E;
        this.f88344f = interfaceC23496h2;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        C23464b c23464b = new C23464b();
        interfaceC23476f.onSubscribe(c23464b);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        c23464b.mo32983c(this.f88343e.mo32323e(new RunnableC23582a(atomicBoolean, c23464b, interfaceC23476f), this.f88341c, this.f88342d));
        this.f88340b.mo33003g(new C23584b(c23464b, atomicBoolean, interfaceC23476f));
    }
}
