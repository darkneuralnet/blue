package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.y */
/* loaded from: classes6.dex */
public final class C24325y<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC24574u<? extends T> f90708c;

    /* renamed from: io.reactivex.internal.operators.observable.y$a */
    /* loaded from: classes6.dex */
    public static final class C24326a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC24541s<T>, InterfaceC23465c {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90709b;

        /* renamed from: c */
        public InterfaceC24574u<? extends T> f90710c;

        /* renamed from: d */
        public boolean f90711d;

        public C24326a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC24574u<? extends T> interfaceC24574u) {
            this.f90709b = interfaceC23436D;
            this.f90710c = interfaceC24574u;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90711d) {
                this.f90709b.onComplete();
                return;
            }
            this.f90711d = true;
            EnumC23501d.m32998c(this, null);
            InterfaceC24574u<? extends T> interfaceC24574u = this.f90710c;
            this.f90710c = null;
            interfaceC24574u.mo31865a(this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90709b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90709b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c) && !this.f90711d) {
                this.f90709b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f90709b.onNext(t);
            this.f90709b.onComplete();
        }
    }

    public C24325y(Observable<T> observable, InterfaceC24574u<? extends T> interfaceC24574u) {
        super(observable);
        this.f90708c = interfaceC24574u;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24326a(interfaceC23436D, this.f90708c));
    }
}
