package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.NoSuchElementException;
/* renamed from: io.reactivex.internal.operators.observable.v0 */
/* loaded from: classes6.dex */
public final class C24310v0<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90658b;

    /* renamed from: c */
    public final T f90659c;

    /* renamed from: io.reactivex.internal.operators.observable.v0$a */
    /* loaded from: classes6.dex */
    public static final class C24311a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90660b;

        /* renamed from: c */
        public final T f90661c;

        /* renamed from: d */
        public InterfaceC23465c f90662d;

        /* renamed from: e */
        public T f90663e;

        public C24311a(InterfaceC23445I<? super T> interfaceC23445I, T t) {
            this.f90660b = interfaceC23445I;
            this.f90661c = t;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90662d.dispose();
            this.f90662d = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90662d == EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90662d = EnumC23501d.DISPOSED;
            T t = this.f90663e;
            if (t != null) {
                this.f90663e = null;
                this.f90660b.onSuccess(t);
                return;
            }
            T t2 = this.f90661c;
            if (t2 != null) {
                this.f90660b.onSuccess(t2);
            } else {
                this.f90660b.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90662d = EnumC23501d.DISPOSED;
            this.f90663e = null;
            this.f90660b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90663e = t;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90662d, interfaceC23465c)) {
                this.f90662d = interfaceC23465c;
                this.f90660b.onSubscribe(this);
            }
        }
    }

    public C24310v0(InterfaceC23434B<T> interfaceC23434B, T t) {
        this.f90658b = interfaceC23434B;
        this.f90659c = t;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90658b.subscribe(new C24311a(interfaceC23445I, this.f90659c));
    }
}
