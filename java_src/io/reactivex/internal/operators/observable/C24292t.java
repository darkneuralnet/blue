package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23549d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.t */
/* loaded from: classes6.dex */
public final class C24292t<T, U> extends AbstractC23442F<U> implements InterfaceC23549d<U> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90576b;

    /* renamed from: c */
    public final Callable<? extends U> f90577c;

    /* renamed from: d */
    public final InterfaceC23479b<? super U, ? super T> f90578d;

    /* renamed from: io.reactivex.internal.operators.observable.t$a */
    /* loaded from: classes6.dex */
    public static final class C24293a<T, U> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super U> f90579b;

        /* renamed from: c */
        public final InterfaceC23479b<? super U, ? super T> f90580c;

        /* renamed from: d */
        public final U f90581d;

        /* renamed from: e */
        public InterfaceC23465c f90582e;

        /* renamed from: f */
        public boolean f90583f;

        public C24293a(InterfaceC23445I<? super U> interfaceC23445I, U u, InterfaceC23479b<? super U, ? super T> interfaceC23479b) {
            this.f90579b = interfaceC23445I;
            this.f90580c = interfaceC23479b;
            this.f90581d = u;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90582e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90582e.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90583f) {
                return;
            }
            this.f90583f = true;
            this.f90579b.onSuccess((U) this.f90581d);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90583f) {
                C24508a.m31988u(th);
                return;
            }
            this.f90583f = true;
            this.f90579b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90583f) {
                return;
            }
            try {
                this.f90580c.accept((U) this.f90581d, t);
            } catch (Throwable th) {
                this.f90582e.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90582e, interfaceC23465c)) {
                this.f90582e = interfaceC23465c;
                this.f90579b.onSubscribe(this);
            }
        }
    }

    public C24292t(InterfaceC23434B<T> interfaceC23434B, Callable<? extends U> callable, InterfaceC23479b<? super U, ? super T> interfaceC23479b) {
        this.f90576b = interfaceC23434B;
        this.f90577c = callable;
        this.f90578d = interfaceC23479b;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super U> interfaceC23445I) {
        try {
            this.f90576b.subscribe(new C24293a(interfaceC23445I, C23544b.m32923e(this.f90577c.call(), "The initialSupplier returned a null value"), this.f90578d));
        } catch (Throwable th) {
            EnumC23502e.m32986j(th, interfaceC23445I);
        }
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23549d
    /* renamed from: c */
    public Observable<U> mo32427c() {
        return C24508a.m31994o(new C24286s(this.f90576b, this.f90577c, this.f90578d));
    }
}
