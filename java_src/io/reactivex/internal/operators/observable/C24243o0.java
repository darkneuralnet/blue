package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23476f;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.fuseable.InterfaceC23549d;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.o0 */
/* loaded from: classes6.dex */
public final class C24243o0<T> extends AbstractC23461c implements InterfaceC23549d<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90404b;

    /* renamed from: io.reactivex.internal.operators.observable.o0$a */
    /* loaded from: classes6.dex */
    public static final class C24244a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23476f f90405b;

        /* renamed from: c */
        public InterfaceC23465c f90406c;

        public C24244a(InterfaceC23476f interfaceC23476f) {
            this.f90405b = interfaceC23476f;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90406c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90406c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90405b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90405b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90406c = interfaceC23465c;
            this.f90405b.onSubscribe(this);
        }
    }

    public C24243o0(InterfaceC23434B<T> interfaceC23434B) {
        this.f90404b = interfaceC23434B;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f90404b.subscribe(new C24244a(interfaceC23476f));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23549d
    /* renamed from: c */
    public Observable<T> mo32427c() {
        return C24508a.m31994o(new C24235n0(this.f90404b));
    }
}
