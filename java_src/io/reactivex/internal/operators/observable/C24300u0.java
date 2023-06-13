package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.observable.u0 */
/* loaded from: classes6.dex */
public final class C24300u0<T> extends AbstractC24507p<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90619b;

    /* renamed from: io.reactivex.internal.operators.observable.u0$a */
    /* loaded from: classes6.dex */
    public static final class C24301a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f90620b;

        /* renamed from: c */
        public InterfaceC23465c f90621c;

        /* renamed from: d */
        public T f90622d;

        public C24301a(InterfaceC24541s<? super T> interfaceC24541s) {
            this.f90620b = interfaceC24541s;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90621c.dispose();
            this.f90621c = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90621c == EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90621c = EnumC23501d.DISPOSED;
            T t = this.f90622d;
            if (t != null) {
                this.f90622d = null;
                this.f90620b.onSuccess(t);
                return;
            }
            this.f90620b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90621c = EnumC23501d.DISPOSED;
            this.f90622d = null;
            this.f90620b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90622d = t;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90621c, interfaceC23465c)) {
                this.f90621c = interfaceC23465c;
                this.f90620b.onSubscribe(this);
            }
        }
    }

    public C24300u0(InterfaceC23434B<T> interfaceC23434B) {
        this.f90619b = interfaceC23434B;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f90619b.subscribe(new C24301a(interfaceC24541s));
    }
}
