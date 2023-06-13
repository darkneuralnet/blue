package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.observable.m0 */
/* loaded from: classes6.dex */
public final class C24227m0<T> extends AbstractC24145a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.m0$a */
    /* loaded from: classes6.dex */
    public static final class C24228a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90363b;

        /* renamed from: c */
        public InterfaceC23465c f90364c;

        public C24228a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f90363b = interfaceC23436D;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90364c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90364c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90363b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90363b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90363b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90364c, interfaceC23465c)) {
                this.f90364c = interfaceC23465c;
                this.f90363b.onSubscribe(this);
            }
        }
    }

    public C24227m0(InterfaceC23434B<T> interfaceC23434B) {
        super(interfaceC23434B);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24228a(interfaceC23436D));
    }
}
