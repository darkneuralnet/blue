package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.observers.C24504h;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.x1 */
/* loaded from: classes6.dex */
public final class C24323x1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f90698c;

    /* renamed from: d */
    public final TimeUnit f90699d;

    /* renamed from: e */
    public final AbstractC23437E f90700e;

    /* renamed from: io.reactivex.internal.operators.observable.x1$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24324a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90701b;

        /* renamed from: c */
        public final long f90702c;

        /* renamed from: d */
        public final TimeUnit f90703d;

        /* renamed from: e */
        public final AbstractC23437E.AbstractC23440c f90704e;

        /* renamed from: f */
        public InterfaceC23465c f90705f;

        /* renamed from: g */
        public volatile boolean f90706g;

        /* renamed from: h */
        public boolean f90707h;

        public RunnableC24324a(InterfaceC23436D<? super T> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c) {
            this.f90701b = interfaceC23436D;
            this.f90702c = j;
            this.f90703d = timeUnit;
            this.f90704e = abstractC23440c;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90705f.dispose();
            this.f90704e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90704e.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f90707h) {
                this.f90707h = true;
                this.f90701b.onComplete();
                this.f90704e.dispose();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90707h) {
                C24508a.m31988u(th);
                return;
            }
            this.f90707h = true;
            this.f90701b.onError(th);
            this.f90704e.dispose();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (!this.f90706g && !this.f90707h) {
                this.f90706g = true;
                this.f90701b.onNext(t);
                InterfaceC23465c interfaceC23465c = get();
                if (interfaceC23465c != null) {
                    interfaceC23465c.dispose();
                }
                EnumC23501d.m32998c(this, this.f90704e.mo32319c(this, this.f90702c, this.f90703d));
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90705f, interfaceC23465c)) {
                this.f90705f = interfaceC23465c;
                this.f90701b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f90706g = false;
        }
    }

    public C24323x1(InterfaceC23434B<T> interfaceC23434B, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        super(interfaceC23434B);
        this.f90698c = j;
        this.f90699d = timeUnit;
        this.f90700e = abstractC23437E;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new RunnableC24324a(new C24504h(interfaceC23436D), this.f90698c, this.f90699d, this.f90700e.mo8041b()));
    }
}
