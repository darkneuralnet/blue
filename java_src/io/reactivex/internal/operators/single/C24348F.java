package io.reactivex.internal.operators.single;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.observers.C23567l;
/* renamed from: io.reactivex.internal.operators.single.F */
/* loaded from: classes6.dex */
public final class C24348F<T> extends Observable<T> {

    /* renamed from: b */
    public final InterfaceC23447K<? extends T> f90776b;

    /* renamed from: io.reactivex.internal.operators.single.F$a */
    /* loaded from: classes6.dex */
    public static final class C24349a<T> extends C23567l<T> implements InterfaceC23445I<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* renamed from: d */
        public InterfaceC23465c f90777d;

        public C24349a(InterfaceC23436D<? super T> interfaceC23436D) {
            super(interfaceC23436D);
        }

        @Override // io.reactivex.internal.observers.C23567l, io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            super.dispose();
            this.f90777d.dispose();
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            m32909d(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90777d, interfaceC23465c)) {
                this.f90777d = interfaceC23465c;
                this.f88308b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            m32910c(t);
        }
    }

    public C24348F(InterfaceC23447K<? extends T> interfaceC23447K) {
        this.f90776b = interfaceC23447K;
    }

    /* renamed from: a */
    public static <T> InterfaceC23445I<T> m32402a(InterfaceC23436D<? super T> interfaceC23436D) {
        return new C24349a(interfaceC23436D);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90776b.mo33096a(m32402a(interfaceC23436D));
    }
}
