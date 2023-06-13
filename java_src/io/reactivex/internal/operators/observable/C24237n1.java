package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.n1 */
/* loaded from: classes6.dex */
public final class C24237n1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final AbstractC23437E f90390c;

    /* renamed from: io.reactivex.internal.operators.observable.n1$a */
    /* loaded from: classes6.dex */
    public static final class C24238a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90391b;

        /* renamed from: c */
        public final AtomicReference<InterfaceC23465c> f90392c = new AtomicReference<>();

        public C24238a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f90391b = interfaceC23436D;
        }

        /* renamed from: a */
        public void m32484a(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f90392c);
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90391b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90391b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90391b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f90392c, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.n1$b */
    /* loaded from: classes6.dex */
    public final class RunnableC24239b implements Runnable {

        /* renamed from: b */
        public final C24238a<T> f90393b;

        public RunnableC24239b(C24238a<T> c24238a) {
            this.f90393b = c24238a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C24237n1.this.f90078b.subscribe(this.f90393b);
        }
    }

    public C24237n1(InterfaceC23434B<T> interfaceC23434B, AbstractC23437E abstractC23437E) {
        super(interfaceC23434B);
        this.f90390c = abstractC23437E;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24238a c24238a = new C24238a(interfaceC23436D);
        interfaceC23436D.onSubscribe(c24238a);
        c24238a.m32484a(this.f90390c.mo32324d(new RunnableC24239b(c24238a)));
    }
}
