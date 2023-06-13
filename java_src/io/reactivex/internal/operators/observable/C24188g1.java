package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.g1 */
/* loaded from: classes6.dex */
public final class C24188g1<T> extends AbstractC24507p<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90214b;

    /* renamed from: io.reactivex.internal.operators.observable.g1$a */
    /* loaded from: classes6.dex */
    public static final class C24189a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f90215b;

        /* renamed from: c */
        public InterfaceC23465c f90216c;

        /* renamed from: d */
        public T f90217d;

        /* renamed from: e */
        public boolean f90218e;

        public C24189a(InterfaceC24541s<? super T> interfaceC24541s) {
            this.f90215b = interfaceC24541s;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90216c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90216c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90218e) {
                return;
            }
            this.f90218e = true;
            T t = this.f90217d;
            this.f90217d = null;
            if (t == null) {
                this.f90215b.onComplete();
            } else {
                this.f90215b.onSuccess(t);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90218e) {
                C24508a.m31988u(th);
                return;
            }
            this.f90218e = true;
            this.f90215b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90218e) {
                return;
            }
            if (this.f90217d != null) {
                this.f90218e = true;
                this.f90216c.dispose();
                this.f90215b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f90217d = t;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90216c, interfaceC23465c)) {
                this.f90216c = interfaceC23465c;
                this.f90215b.onSubscribe(this);
            }
        }
    }

    public C24188g1(InterfaceC23434B<T> interfaceC23434B) {
        this.f90214b = interfaceC23434B;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f90214b.subscribe(new C24189a(interfaceC24541s));
    }
}
