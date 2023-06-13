package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.H */
/* loaded from: classes6.dex */
public final class C24011H<T, U> extends Observable<T> {

    /* renamed from: b */
    public final InterfaceC23434B<? extends T> f89626b;

    /* renamed from: c */
    public final InterfaceC23434B<U> f89627c;

    /* renamed from: io.reactivex.internal.operators.observable.H$a */
    /* loaded from: classes6.dex */
    public final class C24012a implements InterfaceC23436D<U> {

        /* renamed from: b */
        public final C23505h f89628b;

        /* renamed from: c */
        public final InterfaceC23436D<? super T> f89629c;

        /* renamed from: d */
        public boolean f89630d;

        /* renamed from: io.reactivex.internal.operators.observable.H$a$a */
        /* loaded from: classes6.dex */
        public final class C24013a implements InterfaceC23436D<T> {
            public C24013a() {
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onComplete() {
                C24012a.this.f89629c.onComplete();
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onError(Throwable th) {
                C24012a.this.f89629c.onError(th);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onNext(T t) {
                C24012a.this.f89629c.onNext(t);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                C24012a.this.f89628b.m32980b(interfaceC23465c);
            }
        }

        public C24012a(C23505h c23505h, InterfaceC23436D<? super T> interfaceC23436D) {
            this.f89628b = c23505h;
            this.f89629c = interfaceC23436D;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89630d) {
                return;
            }
            this.f89630d = true;
            C24011H.this.f89626b.subscribe(new C24013a());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89630d) {
                C24508a.m31988u(th);
                return;
            }
            this.f89630d = true;
            this.f89629c.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(U u) {
            onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f89628b.m32980b(interfaceC23465c);
        }
    }

    public C24011H(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<U> interfaceC23434B2) {
        this.f89626b = interfaceC23434B;
        this.f89627c = interfaceC23434B2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C23505h c23505h = new C23505h();
        interfaceC23436D.onSubscribe(c23505h);
        this.f89627c.subscribe(new C24012a(c23505h, interfaceC23436D));
    }
}
