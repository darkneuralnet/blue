package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.observers.C24504h;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.E */
/* loaded from: classes6.dex */
public final class C23989E<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f89550c;

    /* renamed from: d */
    public final TimeUnit f89551d;

    /* renamed from: e */
    public final AbstractC23437E f89552e;

    /* renamed from: io.reactivex.internal.operators.observable.E$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23990a<T> extends AtomicReference<InterfaceC23465c> implements Runnable, InterfaceC23465c {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: b */
        public final T f89553b;

        /* renamed from: c */
        public final long f89554c;

        /* renamed from: d */
        public final C23991b<T> f89555d;

        /* renamed from: e */
        public final AtomicBoolean f89556e = new AtomicBoolean();

        public RunnableC23990a(T t, long j, C23991b<T> c23991b) {
            this.f89553b = t;
            this.f89554c = j;
            this.f89555d = c23991b;
        }

        /* renamed from: a */
        public void m32665a(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this, interfaceC23465c);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == EnumC23501d.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f89556e.compareAndSet(false, true)) {
                this.f89555d.m32664a(this.f89554c, this.f89553b, this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.E$b */
    /* loaded from: classes6.dex */
    public static final class C23991b<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89557b;

        /* renamed from: c */
        public final long f89558c;

        /* renamed from: d */
        public final TimeUnit f89559d;

        /* renamed from: e */
        public final AbstractC23437E.AbstractC23440c f89560e;

        /* renamed from: f */
        public InterfaceC23465c f89561f;

        /* renamed from: g */
        public InterfaceC23465c f89562g;

        /* renamed from: h */
        public volatile long f89563h;

        /* renamed from: i */
        public boolean f89564i;

        public C23991b(InterfaceC23436D<? super T> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c) {
            this.f89557b = interfaceC23436D;
            this.f89558c = j;
            this.f89559d = timeUnit;
            this.f89560e = abstractC23440c;
        }

        /* renamed from: a */
        public void m32664a(long j, T t, RunnableC23990a<T> runnableC23990a) {
            if (j == this.f89563h) {
                this.f89557b.onNext(t);
                runnableC23990a.dispose();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89561f.dispose();
            this.f89560e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89560e.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89564i) {
                return;
            }
            this.f89564i = true;
            InterfaceC23465c interfaceC23465c = this.f89562g;
            if (interfaceC23465c != null) {
                interfaceC23465c.dispose();
            }
            RunnableC23990a runnableC23990a = (RunnableC23990a) interfaceC23465c;
            if (runnableC23990a != null) {
                runnableC23990a.run();
            }
            this.f89557b.onComplete();
            this.f89560e.dispose();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89564i) {
                C24508a.m31988u(th);
                return;
            }
            InterfaceC23465c interfaceC23465c = this.f89562g;
            if (interfaceC23465c != null) {
                interfaceC23465c.dispose();
            }
            this.f89564i = true;
            this.f89557b.onError(th);
            this.f89560e.dispose();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89564i) {
                return;
            }
            long j = this.f89563h + 1;
            this.f89563h = j;
            InterfaceC23465c interfaceC23465c = this.f89562g;
            if (interfaceC23465c != null) {
                interfaceC23465c.dispose();
            }
            RunnableC23990a runnableC23990a = new RunnableC23990a(t, j, this);
            this.f89562g = runnableC23990a;
            runnableC23990a.m32665a(this.f89560e.mo32319c(runnableC23990a, this.f89558c, this.f89559d));
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89561f, interfaceC23465c)) {
                this.f89561f = interfaceC23465c;
                this.f89557b.onSubscribe(this);
            }
        }
    }

    public C23989E(InterfaceC23434B<T> interfaceC23434B, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        super(interfaceC23434B);
        this.f89550c = j;
        this.f89551d = timeUnit;
        this.f89552e = abstractC23437E;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C23991b(new C24504h(interfaceC23436D), this.f89550c, this.f89551d, this.f89552e.mo8041b()));
    }
}
