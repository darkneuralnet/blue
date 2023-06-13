package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.y1 */
/* loaded from: classes6.dex */
public final class C24329y1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f90720c;

    /* renamed from: d */
    public final TimeUnit f90721d;

    /* renamed from: e */
    public final AbstractC23437E f90722e;

    /* renamed from: f */
    public final boolean f90723f;

    /* renamed from: io.reactivex.internal.operators.observable.y1$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24330a<T> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90724b;

        /* renamed from: c */
        public final long f90725c;

        /* renamed from: d */
        public final TimeUnit f90726d;

        /* renamed from: e */
        public final AbstractC23437E.AbstractC23440c f90727e;

        /* renamed from: f */
        public final boolean f90728f;

        /* renamed from: g */
        public final AtomicReference<T> f90729g = new AtomicReference<>();

        /* renamed from: h */
        public InterfaceC23465c f90730h;

        /* renamed from: i */
        public volatile boolean f90731i;

        /* renamed from: j */
        public Throwable f90732j;

        /* renamed from: k */
        public volatile boolean f90733k;

        /* renamed from: l */
        public volatile boolean f90734l;

        /* renamed from: m */
        public boolean f90735m;

        public RunnableC24330a(InterfaceC23436D<? super T> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c, boolean z) {
            this.f90724b = interfaceC23436D;
            this.f90725c = j;
            this.f90726d = timeUnit;
            this.f90727e = abstractC23440c;
            this.f90728f = z;
        }

        /* renamed from: a */
        public void m32404a() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f90729g;
            InterfaceC23436D<? super T> interfaceC23436D = this.f90724b;
            int i = 1;
            while (!this.f90733k) {
                boolean z2 = this.f90731i;
                if (z2 && this.f90732j != null) {
                    atomicReference.lazySet(null);
                    interfaceC23436D.onError(this.f90732j);
                    this.f90727e.dispose();
                    return;
                }
                if (atomicReference.get() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z && this.f90728f) {
                        interfaceC23436D.onNext(andSet);
                    }
                    interfaceC23436D.onComplete();
                    this.f90727e.dispose();
                    return;
                }
                if (z) {
                    if (this.f90734l) {
                        this.f90735m = false;
                        this.f90734l = false;
                    }
                } else if (!this.f90735m || this.f90734l) {
                    interfaceC23436D.onNext(atomicReference.getAndSet(null));
                    this.f90734l = false;
                    this.f90735m = true;
                    this.f90727e.mo32319c(this, this.f90725c, this.f90726d);
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90733k = true;
            this.f90730h.dispose();
            this.f90727e.dispose();
            if (getAndIncrement() == 0) {
                this.f90729g.lazySet(null);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90733k;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90731i = true;
            m32404a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90732j = th;
            this.f90731i = true;
            m32404a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90729g.set(t);
            m32404a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90730h, interfaceC23465c)) {
                this.f90730h = interfaceC23465c;
                this.f90724b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f90734l = true;
            m32404a();
        }
    }

    public C24329y1(Observable<T> observable, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        super(observable);
        this.f90720c = j;
        this.f90721d = timeUnit;
        this.f90722e = abstractC23437E;
        this.f90723f = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new RunnableC24330a(interfaceC23436D, this.f90720c, this.f90721d, this.f90722e.mo8041b(), this.f90723f));
    }
}
