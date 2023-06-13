package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.observers.C24504h;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.Y0 */
/* loaded from: classes6.dex */
public final class C24133Y0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f90047c;

    /* renamed from: d */
    public final TimeUnit f90048d;

    /* renamed from: e */
    public final AbstractC23437E f90049e;

    /* renamed from: f */
    public final boolean f90050f;

    /* renamed from: io.reactivex.internal.operators.observable.Y0$a */
    /* loaded from: classes6.dex */
    public static final class C24134a<T> extends AbstractRunnableC24136c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* renamed from: h */
        public final AtomicInteger f90051h;

        public C24134a(InterfaceC23436D<? super T> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            super(interfaceC23436D, j, timeUnit, abstractC23437E);
            this.f90051h = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.observable.C24133Y0.AbstractRunnableC24136c
        /* renamed from: b */
        public void mo32552b() {
            m32551c();
            if (this.f90051h.decrementAndGet() == 0) {
                this.f90052b.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f90051h.incrementAndGet() == 2) {
                m32551c();
                if (this.f90051h.decrementAndGet() == 0) {
                    this.f90052b.onComplete();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.Y0$b */
    /* loaded from: classes6.dex */
    public static final class C24135b<T> extends AbstractRunnableC24136c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public C24135b(InterfaceC23436D<? super T> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            super(interfaceC23436D, j, timeUnit, abstractC23437E);
        }

        @Override // io.reactivex.internal.operators.observable.C24133Y0.AbstractRunnableC24136c
        /* renamed from: b */
        public void mo32552b() {
            this.f90052b.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            m32551c();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.Y0$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractRunnableC24136c<T> extends AtomicReference<T> implements InterfaceC23436D<T>, InterfaceC23465c, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90052b;

        /* renamed from: c */
        public final long f90053c;

        /* renamed from: d */
        public final TimeUnit f90054d;

        /* renamed from: e */
        public final AbstractC23437E f90055e;

        /* renamed from: f */
        public final AtomicReference<InterfaceC23465c> f90056f = new AtomicReference<>();

        /* renamed from: g */
        public InterfaceC23465c f90057g;

        public AbstractRunnableC24136c(InterfaceC23436D<? super T> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            this.f90052b = interfaceC23436D;
            this.f90053c = j;
            this.f90054d = timeUnit;
            this.f90055e = abstractC23437E;
        }

        /* renamed from: a */
        public void m32553a() {
            EnumC23501d.m33000a(this.f90056f);
        }

        /* renamed from: b */
        public abstract void mo32552b();

        /* renamed from: c */
        public void m32551c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f90052b.onNext(andSet);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            m32553a();
            this.f90057g.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90057g.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            m32553a();
            mo32552b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            m32553a();
            this.f90052b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90057g, interfaceC23465c)) {
                this.f90057g = interfaceC23465c;
                this.f90052b.onSubscribe(this);
                AbstractC23437E abstractC23437E = this.f90055e;
                long j = this.f90053c;
                EnumC23501d.m32998c(this.f90056f, abstractC23437E.mo32326f(this, j, j, this.f90054d));
            }
        }
    }

    public C24133Y0(InterfaceC23434B<T> interfaceC23434B, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        super(interfaceC23434B);
        this.f90047c = j;
        this.f90048d = timeUnit;
        this.f90049e = abstractC23437E;
        this.f90050f = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24504h c24504h = new C24504h(interfaceC23436D);
        if (this.f90050f) {
            this.f90078b.subscribe(new C24134a(c24504h, this.f90047c, this.f90048d, this.f90049e));
        } else {
            this.f90078b.subscribe(new C24135b(c24504h, this.f90047c, this.f90048d, this.f90049e));
        }
    }
}
