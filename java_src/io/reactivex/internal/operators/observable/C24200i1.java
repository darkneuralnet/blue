package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.observable.i1 */
/* loaded from: classes6.dex */
public final class C24200i1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f90244c;

    /* renamed from: io.reactivex.internal.operators.observable.i1$a */
    /* loaded from: classes6.dex */
    public static final class C24201a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90245b;

        /* renamed from: c */
        public long f90246c;

        /* renamed from: d */
        public InterfaceC23465c f90247d;

        public C24201a(InterfaceC23436D<? super T> interfaceC23436D, long j) {
            this.f90245b = interfaceC23436D;
            this.f90246c = j;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90247d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90247d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90245b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90245b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            long j = this.f90246c;
            if (j != 0) {
                this.f90246c = j - 1;
            } else {
                this.f90245b.onNext(t);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90247d, interfaceC23465c)) {
                this.f90247d = interfaceC23465c;
                this.f90245b.onSubscribe(this);
            }
        }
    }

    public C24200i1(InterfaceC23434B<T> interfaceC23434B, long j) {
        super(interfaceC23434B);
        this.f90244c = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24201a(interfaceC23436D, this.f90244c));
    }
}
