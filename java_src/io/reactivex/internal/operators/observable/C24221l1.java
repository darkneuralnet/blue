package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23498a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.observers.C24504h;
/* renamed from: io.reactivex.internal.operators.observable.l1 */
/* loaded from: classes6.dex */
public final class C24221l1<T, U> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23434B<U> f90336c;

    /* renamed from: io.reactivex.internal.operators.observable.l1$a */
    /* loaded from: classes6.dex */
    public final class C24222a implements InterfaceC23436D<U> {

        /* renamed from: b */
        public final C23498a f90337b;

        /* renamed from: c */
        public final C24223b<T> f90338c;

        /* renamed from: d */
        public final C24504h<T> f90339d;

        /* renamed from: e */
        public InterfaceC23465c f90340e;

        public C24222a(C23498a c23498a, C24223b<T> c24223b, C24504h<T> c24504h) {
            this.f90337b = c23498a;
            this.f90338c = c24223b;
            this.f90339d = c24504h;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90338c.f90345e = true;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90337b.dispose();
            this.f90339d.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(U u) {
            this.f90340e.dispose();
            this.f90338c.f90345e = true;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90340e, interfaceC23465c)) {
                this.f90340e = interfaceC23465c;
                this.f90337b.m33001a(1, interfaceC23465c);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.l1$b */
    /* loaded from: classes6.dex */
    public static final class C24223b<T> implements InterfaceC23436D<T> {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90342b;

        /* renamed from: c */
        public final C23498a f90343c;

        /* renamed from: d */
        public InterfaceC23465c f90344d;

        /* renamed from: e */
        public volatile boolean f90345e;

        /* renamed from: f */
        public boolean f90346f;

        public C24223b(InterfaceC23436D<? super T> interfaceC23436D, C23498a c23498a) {
            this.f90342b = interfaceC23436D;
            this.f90343c = c23498a;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90343c.dispose();
            this.f90342b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90343c.dispose();
            this.f90342b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90346f) {
                this.f90342b.onNext(t);
            } else if (this.f90345e) {
                this.f90346f = true;
                this.f90342b.onNext(t);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90344d, interfaceC23465c)) {
                this.f90344d = interfaceC23465c;
                this.f90343c.m33001a(0, interfaceC23465c);
            }
        }
    }

    public C24221l1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23434B<U> interfaceC23434B2) {
        super(interfaceC23434B);
        this.f90336c = interfaceC23434B2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24504h c24504h = new C24504h(interfaceC23436D);
        C23498a c23498a = new C23498a(2);
        c24504h.onSubscribe(c23498a);
        C24223b c24223b = new C24223b(c24504h, c23498a);
        this.f90336c.subscribe(new C24222a(c23498a, c24223b, c24504h));
        this.f90078b.subscribe(c24223b);
    }
}
