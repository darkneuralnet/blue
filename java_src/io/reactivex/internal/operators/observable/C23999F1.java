package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: io.reactivex.internal.operators.observable.F1 */
/* loaded from: classes6.dex */
public final class C23999F1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final AbstractC23437E f89593c;

    /* renamed from: io.reactivex.internal.operators.observable.F1$a */
    /* loaded from: classes6.dex */
    public static final class C24000a<T> extends AtomicBoolean implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 1015244841293359600L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89594b;

        /* renamed from: c */
        public final AbstractC23437E f89595c;

        /* renamed from: d */
        public InterfaceC23465c f89596d;

        /* renamed from: io.reactivex.internal.operators.observable.F1$a$a */
        /* loaded from: classes6.dex */
        public final class RunnableC24001a implements Runnable {
            public RunnableC24001a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C24000a.this.f89596d.dispose();
            }
        }

        public C24000a(InterfaceC23436D<? super T> interfaceC23436D, AbstractC23437E abstractC23437E) {
            this.f89594b = interfaceC23436D;
            this.f89595c = abstractC23437E;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f89595c.mo32324d(new RunnableC24001a());
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!get()) {
                this.f89594b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (get()) {
                C24508a.m31988u(th);
            } else {
                this.f89594b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (!get()) {
                this.f89594b.onNext(t);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89596d, interfaceC23465c)) {
                this.f89596d = interfaceC23465c;
                this.f89594b.onSubscribe(this);
            }
        }
    }

    public C23999F1(InterfaceC23434B<T> interfaceC23434B, AbstractC23437E abstractC23437E) {
        super(interfaceC23434B);
        this.f89593c = abstractC23437E;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24000a(interfaceC23436D, this.f89593c));
    }
}
