package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.flowables.AbstractC23477a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.InterfaceC23504g;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.flowable.X */
/* loaded from: classes6.dex */
public final class C23689X<T> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final AbstractC23477a<T> f88613c;

    /* renamed from: d */
    public final int f88614d;

    /* renamed from: e */
    public final long f88615e;

    /* renamed from: f */
    public final TimeUnit f88616f;

    /* renamed from: g */
    public final AbstractC23437E f88617g;

    /* renamed from: h */
    public RunnableC23690a f88618h;

    /* renamed from: io.reactivex.internal.operators.flowable.X$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23690a extends AtomicReference<InterfaceC23465c> implements Runnable, InterfaceC23484g<InterfaceC23465c> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* renamed from: b */
        public final C23689X<?> f88619b;

        /* renamed from: c */
        public InterfaceC23465c f88620c;

        /* renamed from: d */
        public long f88621d;

        /* renamed from: e */
        public boolean f88622e;

        /* renamed from: f */
        public boolean f88623f;

        public RunnableC23690a(C23689X<?> c23689x) {
            this.f88619b = c23689x;
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(InterfaceC23465c interfaceC23465c) throws Exception {
            EnumC23501d.m32998c(this, interfaceC23465c);
            synchronized (this.f88619b) {
                if (this.f88623f) {
                    ((InterfaceC23504g) this.f88619b.f88613c).mo32598d(interfaceC23465c);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f88619b.m32859B1(this);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.X$b */
    /* loaded from: classes6.dex */
    public static final class C23691b<T> extends AtomicBoolean implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = -7419642935409022375L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88624b;

        /* renamed from: c */
        public final C23689X<T> f88625c;

        /* renamed from: d */
        public final RunnableC23690a f88626d;

        /* renamed from: e */
        public InterfaceC46292oT5 f88627e;

        public C23691b(InterfaceC42141hT5<? super T> interfaceC42141hT5, C23689X<T> c23689x, RunnableC23690a runnableC23690a) {
            this.f88624b = interfaceC42141hT5;
            this.f88625c = c23689x;
            this.f88626d = runnableC23690a;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88627e, interfaceC46292oT5)) {
                this.f88627e = interfaceC46292oT5;
                this.f88624b.mo31867a(this);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88627e.cancel();
            if (compareAndSet(false, true)) {
                this.f88625c.m32858x1(this.f88626d);
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            this.f88627e.mo21023o(j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f88625c.m32860A1(this.f88626d);
                this.f88624b.onComplete();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f88625c.m32860A1(this.f88626d);
                this.f88624b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88624b.onNext(t);
        }
    }

    public C23689X(AbstractC23477a<T> abstractC23477a) {
        this(abstractC23477a, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    /* renamed from: A1 */
    public void m32860A1(RunnableC23690a runnableC23690a) {
        synchronized (this) {
            if (this.f88613c instanceof InterfaceC23684V) {
                RunnableC23690a runnableC23690a2 = this.f88618h;
                if (runnableC23690a2 != null && runnableC23690a2 == runnableC23690a) {
                    this.f88618h = null;
                    m32857y1(runnableC23690a);
                }
                long j = runnableC23690a.f88621d - 1;
                runnableC23690a.f88621d = j;
                if (j == 0) {
                    m32856z1(runnableC23690a);
                }
            } else {
                RunnableC23690a runnableC23690a3 = this.f88618h;
                if (runnableC23690a3 != null && runnableC23690a3 == runnableC23690a) {
                    m32857y1(runnableC23690a);
                    long j2 = runnableC23690a.f88621d - 1;
                    runnableC23690a.f88621d = j2;
                    if (j2 == 0) {
                        this.f88618h = null;
                        m32856z1(runnableC23690a);
                    }
                }
            }
        }
    }

    /* renamed from: B1 */
    public void m32859B1(RunnableC23690a runnableC23690a) {
        synchronized (this) {
            if (runnableC23690a.f88621d == 0 && runnableC23690a == this.f88618h) {
                this.f88618h = null;
                InterfaceC23465c interfaceC23465c = runnableC23690a.get();
                EnumC23501d.m33000a(runnableC23690a);
                AbstractC23477a<T> abstractC23477a = this.f88613c;
                if (abstractC23477a instanceof InterfaceC23465c) {
                    ((InterfaceC23465c) abstractC23477a).dispose();
                } else if (abstractC23477a instanceof InterfaceC23504g) {
                    if (interfaceC23465c == null) {
                        runnableC23690a.f88623f = true;
                    } else {
                        ((InterfaceC23504g) abstractC23477a).mo32598d(interfaceC23465c);
                    }
                }
            }
        }
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        RunnableC23690a runnableC23690a;
        boolean z;
        InterfaceC23465c interfaceC23465c;
        synchronized (this) {
            runnableC23690a = this.f88618h;
            if (runnableC23690a == null) {
                runnableC23690a = new RunnableC23690a(this);
                this.f88618h = runnableC23690a;
            }
            long j = runnableC23690a.f88621d;
            if (j == 0 && (interfaceC23465c = runnableC23690a.f88620c) != null) {
                interfaceC23465c.dispose();
            }
            long j2 = j + 1;
            runnableC23690a.f88621d = j2;
            if (!runnableC23690a.f88622e && j2 == this.f88614d) {
                z = true;
                runnableC23690a.f88622e = true;
            } else {
                z = false;
            }
        }
        this.f88613c.m32166W0(new C23691b(interfaceC42141hT5, this, runnableC23690a));
        if (z) {
            this.f88613c.mo32844y1(runnableC23690a);
        }
    }

    /* renamed from: x1 */
    public void m32858x1(RunnableC23690a runnableC23690a) {
        synchronized (this) {
            RunnableC23690a runnableC23690a2 = this.f88618h;
            if (runnableC23690a2 != null && runnableC23690a2 == runnableC23690a) {
                long j = runnableC23690a.f88621d - 1;
                runnableC23690a.f88621d = j;
                if (j == 0 && runnableC23690a.f88622e) {
                    if (this.f88615e == 0) {
                        m32859B1(runnableC23690a);
                        return;
                    }
                    C23505h c23505h = new C23505h();
                    runnableC23690a.f88620c = c23505h;
                    c23505h.m32981a(this.f88617g.mo32323e(runnableC23690a, this.f88615e, this.f88616f));
                }
            }
        }
    }

    /* renamed from: y1 */
    public void m32857y1(RunnableC23690a runnableC23690a) {
        InterfaceC23465c interfaceC23465c = runnableC23690a.f88620c;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
            runnableC23690a.f88620c = null;
        }
    }

    /* renamed from: z1 */
    public void m32856z1(RunnableC23690a runnableC23690a) {
        AbstractC23477a<T> abstractC23477a = this.f88613c;
        if (abstractC23477a instanceof InterfaceC23465c) {
            ((InterfaceC23465c) abstractC23477a).dispose();
        } else if (abstractC23477a instanceof InterfaceC23504g) {
            ((InterfaceC23504g) abstractC23477a).mo32598d(runnableC23690a.get());
        }
    }

    public C23689X(AbstractC23477a<T> abstractC23477a, int i, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        this.f88613c = abstractC23477a;
        this.f88614d = i;
        this.f88615e = j;
        this.f88616f = timeUnit;
        this.f88617g = abstractC23437E;
    }
}
