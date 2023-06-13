package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.observers.C24504h;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.M1 */
/* loaded from: classes6.dex */
public final class C24060M1<T, U, R> extends AbstractC24145a<T, R> {

    /* renamed from: c */
    public final InterfaceC23480c<? super T, ? super U, ? extends R> f89802c;

    /* renamed from: d */
    public final InterfaceC23434B<? extends U> f89803d;

    /* renamed from: io.reactivex.internal.operators.observable.M1$a */
    /* loaded from: classes6.dex */
    public static final class C24061a<T, U, R> extends AtomicReference<U> implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -312246233408980075L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89804b;

        /* renamed from: c */
        public final InterfaceC23480c<? super T, ? super U, ? extends R> f89805c;

        /* renamed from: d */
        public final AtomicReference<InterfaceC23465c> f89806d = new AtomicReference<>();

        /* renamed from: e */
        public final AtomicReference<InterfaceC23465c> f89807e = new AtomicReference<>();

        public C24061a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
            this.f89804b = interfaceC23436D;
            this.f89805c = interfaceC23480c;
        }

        /* renamed from: a */
        public void m32628a(Throwable th) {
            EnumC23501d.m33000a(this.f89806d);
            this.f89804b.onError(th);
        }

        /* renamed from: b */
        public boolean m32627b(InterfaceC23465c interfaceC23465c) {
            return EnumC23501d.m32995h(this.f89807e, interfaceC23465c);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f89806d);
            EnumC23501d.m33000a(this.f89807e);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f89806d.get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            EnumC23501d.m33000a(this.f89807e);
            this.f89804b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            EnumC23501d.m33000a(this.f89807e);
            this.f89804b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    this.f89804b.onNext(C23544b.m32923e(this.f89805c.apply(t, u), "The combiner returned a null value"));
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    dispose();
                    this.f89804b.onError(th);
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89806d, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.M1$b */
    /* loaded from: classes6.dex */
    public final class C24062b implements InterfaceC23436D<U> {

        /* renamed from: b */
        public final C24061a<T, U, R> f89808b;

        public C24062b(C24061a<T, U, R> c24061a) {
            this.f89808b = c24061a;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89808b.m32628a(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(U u) {
            this.f89808b.lazySet(u);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f89808b.m32627b(interfaceC23465c);
        }
    }

    public C24060M1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c, InterfaceC23434B<? extends U> interfaceC23434B2) {
        super(interfaceC23434B);
        this.f89802c = interfaceC23480c;
        this.f89803d = interfaceC23434B2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        C24504h c24504h = new C24504h(interfaceC23436D);
        C24061a c24061a = new C24061a(c24504h, this.f89802c);
        c24504h.onSubscribe(c24061a);
        this.f89803d.subscribe(new C24062b(c24061a));
        this.f90078b.subscribe(c24061a);
    }
}
