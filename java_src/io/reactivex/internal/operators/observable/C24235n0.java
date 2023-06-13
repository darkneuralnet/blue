package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
/* renamed from: io.reactivex.internal.operators.observable.n0 */
/* loaded from: classes6.dex */
public final class C24235n0<T> extends AbstractC24145a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.n0$a */
    /* loaded from: classes6.dex */
    public static final class C24236a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90388b;

        /* renamed from: c */
        public InterfaceC23465c f90389c;

        public C24236a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f90388b = interfaceC23436D;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90389c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90389c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90388b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90388b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90389c = interfaceC23465c;
            this.f90388b.onSubscribe(this);
        }
    }

    public C24235n0(InterfaceC23434B<T> interfaceC23434B) {
        super(interfaceC23434B);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24236a(interfaceC23436D));
    }
}
