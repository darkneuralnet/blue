package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23505h;
/* renamed from: io.reactivex.internal.operators.observable.o1 */
/* loaded from: classes6.dex */
public final class C24245o1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23434B<? extends T> f90407c;

    /* renamed from: io.reactivex.internal.operators.observable.o1$a */
    /* loaded from: classes6.dex */
    public static final class C24246a<T> implements InterfaceC23436D<T> {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90408b;

        /* renamed from: c */
        public final InterfaceC23434B<? extends T> f90409c;

        /* renamed from: e */
        public boolean f90411e = true;

        /* renamed from: d */
        public final C23505h f90410d = new C23505h();

        public C24246a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23434B<? extends T> interfaceC23434B) {
            this.f90408b = interfaceC23436D;
            this.f90409c = interfaceC23434B;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90411e) {
                this.f90411e = false;
                this.f90409c.subscribe(this);
                return;
            }
            this.f90408b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90408b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90411e) {
                this.f90411e = false;
            }
            this.f90408b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90410d.m32980b(interfaceC23465c);
        }
    }

    public C24245o1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2) {
        super(interfaceC23434B);
        this.f90407c = interfaceC23434B2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24246a c24246a = new C24246a(interfaceC23436D, this.f90407c);
        interfaceC23436D.onSubscribe(c24246a.f90410d);
        this.f90078b.subscribe(c24246a);
    }
}
