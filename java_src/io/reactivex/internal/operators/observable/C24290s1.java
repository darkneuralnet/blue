package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.observable.s1 */
/* loaded from: classes6.dex */
public final class C24290s1<T> extends AbstractC24145a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.s1$a */
    /* loaded from: classes6.dex */
    public static final class C24291a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90573b;

        /* renamed from: c */
        public InterfaceC23465c f90574c;

        /* renamed from: d */
        public T f90575d;

        public C24291a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f90573b = interfaceC23436D;
        }

        /* renamed from: a */
        public void m32428a() {
            T t = this.f90575d;
            if (t != null) {
                this.f90575d = null;
                this.f90573b.onNext(t);
            }
            this.f90573b.onComplete();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90575d = null;
            this.f90574c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90574c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            m32428a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90575d = null;
            this.f90573b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90575d = t;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90574c, interfaceC23465c)) {
                this.f90574c = interfaceC23465c;
                this.f90573b.onSubscribe(this);
            }
        }
    }

    public C24290s1(InterfaceC23434B<T> interfaceC23434B) {
        super(interfaceC23434B);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24291a(interfaceC23436D));
    }
}
