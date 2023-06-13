package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.InterfaceC23504g;
import io.reactivex.observables.AbstractC24495a;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.Q0 */
/* loaded from: classes6.dex */
public final class C24084Q0<T> extends Observable<T> {

    /* renamed from: b */
    public final AbstractC24495a<T> f89894b;

    /* renamed from: c */
    public final int f89895c;

    /* renamed from: d */
    public final long f89896d;

    /* renamed from: e */
    public final TimeUnit f89897e;

    /* renamed from: f */
    public final AbstractC23437E f89898f;

    /* renamed from: g */
    public RunnableC24085a f89899g;

    /* renamed from: io.reactivex.internal.operators.observable.Q0$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24085a extends AtomicReference<InterfaceC23465c> implements Runnable, InterfaceC23484g<InterfaceC23465c> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* renamed from: b */
        public final C24084Q0<?> f89900b;

        /* renamed from: c */
        public InterfaceC23465c f89901c;

        /* renamed from: d */
        public long f89902d;

        /* renamed from: e */
        public boolean f89903e;

        /* renamed from: f */
        public boolean f89904f;

        public RunnableC24085a(C24084Q0<?> c24084q0) {
            this.f89900b = c24084q0;
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(InterfaceC23465c interfaceC23465c) throws Exception {
            EnumC23501d.m32998c(this, interfaceC23465c);
            synchronized (this.f89900b) {
                if (this.f89904f) {
                    ((InterfaceC23504g) this.f89900b.f89894b).mo32598d(interfaceC23465c);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f89900b.m32607h(this);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.Q0$b */
    /* loaded from: classes6.dex */
    public static final class C24086b<T> extends AtomicBoolean implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -7419642935409022375L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89905b;

        /* renamed from: c */
        public final C24084Q0<T> f89906c;

        /* renamed from: d */
        public final RunnableC24085a f89907d;

        /* renamed from: e */
        public InterfaceC23465c f89908e;

        public C24086b(InterfaceC23436D<? super T> interfaceC23436D, C24084Q0<T> c24084q0, RunnableC24085a runnableC24085a) {
            this.f89905b = interfaceC23436D;
            this.f89906c = c24084q0;
            this.f89907d = runnableC24085a;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89908e.dispose();
            if (compareAndSet(false, true)) {
                this.f89906c.m32611a(this.f89907d);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89908e.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f89906c.m32608g(this.f89907d);
                this.f89905b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f89906c.m32608g(this.f89907d);
                this.f89905b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89905b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89908e, interfaceC23465c)) {
                this.f89908e = interfaceC23465c;
                this.f89905b.onSubscribe(this);
            }
        }
    }

    public C24084Q0(AbstractC24495a<T> abstractC24495a) {
        this(abstractC24495a, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    /* renamed from: a */
    public void m32611a(RunnableC24085a runnableC24085a) {
        synchronized (this) {
            RunnableC24085a runnableC24085a2 = this.f89899g;
            if (runnableC24085a2 != null && runnableC24085a2 == runnableC24085a) {
                long j = runnableC24085a.f89902d - 1;
                runnableC24085a.f89902d = j;
                if (j == 0 && runnableC24085a.f89903e) {
                    if (this.f89896d == 0) {
                        m32607h(runnableC24085a);
                        return;
                    }
                    C23505h c23505h = new C23505h();
                    runnableC24085a.f89901c = c23505h;
                    c23505h.m32981a(this.f89898f.mo32323e(runnableC24085a, this.f89896d, this.f89897e));
                }
            }
        }
    }

    /* renamed from: c */
    public void m32610c(RunnableC24085a runnableC24085a) {
        InterfaceC23465c interfaceC23465c = runnableC24085a.f89901c;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
            runnableC24085a.f89901c = null;
        }
    }

    /* renamed from: e */
    public void m32609e(RunnableC24085a runnableC24085a) {
        AbstractC24495a<T> abstractC24495a = this.f89894b;
        if (abstractC24495a instanceof InterfaceC23465c) {
            ((InterfaceC23465c) abstractC24495a).dispose();
        } else if (abstractC24495a instanceof InterfaceC23504g) {
            ((InterfaceC23504g) abstractC24495a).mo32598d(runnableC24085a.get());
        }
    }

    /* renamed from: g */
    public void m32608g(RunnableC24085a runnableC24085a) {
        synchronized (this) {
            if (this.f89894b instanceof InterfaceC24031J0) {
                RunnableC24085a runnableC24085a2 = this.f89899g;
                if (runnableC24085a2 != null && runnableC24085a2 == runnableC24085a) {
                    this.f89899g = null;
                    m32610c(runnableC24085a);
                }
                long j = runnableC24085a.f89902d - 1;
                runnableC24085a.f89902d = j;
                if (j == 0) {
                    m32609e(runnableC24085a);
                }
            } else {
                RunnableC24085a runnableC24085a3 = this.f89899g;
                if (runnableC24085a3 != null && runnableC24085a3 == runnableC24085a) {
                    m32610c(runnableC24085a);
                    long j2 = runnableC24085a.f89902d - 1;
                    runnableC24085a.f89902d = j2;
                    if (j2 == 0) {
                        this.f89899g = null;
                        m32609e(runnableC24085a);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public void m32607h(RunnableC24085a runnableC24085a) {
        synchronized (this) {
            if (runnableC24085a.f89902d == 0 && runnableC24085a == this.f89899g) {
                this.f89899g = null;
                InterfaceC23465c interfaceC23465c = runnableC24085a.get();
                EnumC23501d.m33000a(runnableC24085a);
                AbstractC24495a<T> abstractC24495a = this.f89894b;
                if (abstractC24495a instanceof InterfaceC23465c) {
                    ((InterfaceC23465c) abstractC24495a).dispose();
                } else if (abstractC24495a instanceof InterfaceC23504g) {
                    if (interfaceC23465c == null) {
                        runnableC24085a.f89904f = true;
                    } else {
                        ((InterfaceC23504g) abstractC24495a).mo32598d(interfaceC23465c);
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        RunnableC24085a runnableC24085a;
        boolean z;
        InterfaceC23465c interfaceC23465c;
        synchronized (this) {
            runnableC24085a = this.f89899g;
            if (runnableC24085a == null) {
                runnableC24085a = new RunnableC24085a(this);
                this.f89899g = runnableC24085a;
            }
            long j = runnableC24085a.f89902d;
            if (j == 0 && (interfaceC23465c = runnableC24085a.f89901c) != null) {
                interfaceC23465c.dispose();
            }
            long j2 = j + 1;
            runnableC24085a.f89902d = j2;
            if (!runnableC24085a.f89903e && j2 == this.f89895c) {
                z = true;
                runnableC24085a.f89903e = true;
            } else {
                z = false;
            }
        }
        this.f89894b.subscribe(new C24086b(interfaceC23436D, this, runnableC24085a));
        if (z) {
            this.f89894b.mo32086g(runnableC24085a);
        }
    }

    public C24084Q0(AbstractC24495a<T> abstractC24495a, int i, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        this.f89894b = abstractC24495a;
        this.f89895c = i;
        this.f89896d = j;
        this.f89897e = timeUnit;
        this.f89898f = abstractC23437E;
    }
}
