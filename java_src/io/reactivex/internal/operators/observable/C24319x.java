package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.x */
/* loaded from: classes6.dex */
public final class C24319x<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23496h f90692c;

    /* renamed from: io.reactivex.internal.operators.observable.x$a */
    /* loaded from: classes6.dex */
    public static final class C24320a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23476f, InterfaceC23465c {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90693b;

        /* renamed from: c */
        public InterfaceC23496h f90694c;

        /* renamed from: d */
        public boolean f90695d;

        public C24320a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23496h interfaceC23496h) {
            this.f90693b = interfaceC23436D;
            this.f90694c = interfaceC23496h;
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
            if (this.f90695d) {
                this.f90693b.onComplete();
                return;
            }
            this.f90695d = true;
            EnumC23501d.m32998c(this, null);
            InterfaceC23496h interfaceC23496h = this.f90694c;
            this.f90694c = null;
            interfaceC23496h.mo33003g(this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90693b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90693b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c) && !this.f90695d) {
                this.f90693b.onSubscribe(this);
            }
        }
    }

    public C24319x(Observable<T> observable, InterfaceC23496h interfaceC23496h) {
        super(observable);
        this.f90692c = interfaceC23496h;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24320a(interfaceC23436D, this.f90692c));
    }
}
